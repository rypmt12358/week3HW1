package com.example.springrestfulpractice.model.entity;

import com.example.springrestfulpractice.model.entity.Meal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column
    private int id;
    @Column
    private int totalPrice;
    @Column
    private String waiter;

    @Column
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)//ascadeType.ALL儲存、合併、 更新或移除，一併對被參考物件作出對應動作 FetchType.EAGER從表格取得資料
    @JoinTable(
            name = "order_meals",
            joinColumns = @JoinColumn(name = "order_id",referencedColumnName = "id"),//@JoinColumns關聯自己ID的字段
            inverseJoinColumns = @JoinColumn(name = "meal_id",referencedColumnName = "id"))//inverseJoinColumns關聯對方ID的字段

    private List<Meal> mealList;
}
