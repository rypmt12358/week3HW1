package com.example.springrestfulpractice.model.entity;

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
@Table(name = "meals")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主鍵由數據庫自動生成
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private int price;
    @Column
    private String description;

    /*@ManyToMany(targetEntity=Order.class,mappedBy = "mealList",fetch=FetchType.EAGER)
    private List<Order> orders;*/

}
