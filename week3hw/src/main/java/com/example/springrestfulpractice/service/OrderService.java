package com.example.springrestfulpractice.service;

import com.example.springrestfulpractice.controller.dto.request.CreateOrderRequest;
import com.example.springrestfulpractice.controller.dto.request.UpdateOrderRequest;
import com.example.springrestfulpractice.model.OrderRepository;
import com.example.springrestfulpractice.model.entity.Meal;
import com.example.springrestfulpractice.model.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    private List<Order> orderList;

    public List<Order> getAllOrders() {
        List<Order> response = orderRepository.findAll();
        return response;
    }

    public Order getOrderById(int id) {
        Order response = orderRepository.findById(id);
        return response;
    }

    public String createOrder(CreateOrderRequest request) {
        Order order = new Order();

        order.setId(request.getId());
        order.setTotalPrice(request.getTotalPrice());
        order.setWaiter(request.getWaiter());
        order.setMealList(request.getMealList());

        orderRepository.save(order);

        return "ok";
    }

    public String updateUser(int id, UpdateOrderRequest request) {
        Order order = orderRepository.findById(id);
        if (order == null) {
            return "fail";
        }
        order.setTotalPrice(request.getTotalPrice());
        order.setWaiter(request.getWaiter());
        order.setMealList(request.getMealList());

        orderRepository.save(order);

        return "ok";
    }

    public String deleteOrderById(int id) {
        Order user = orderRepository.findById(id);
        if (null == user) {
            return "fail";
        }
        Long count = orderRepository.deleteById((id));
        return "ok";
    }
}
