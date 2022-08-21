package com.example.springrestfulpractice.controller;
import com.example.springrestfulpractice.controller.dto.request.CreateOrderRequest;
import com.example.springrestfulpractice.controller.dto.request.UpdateOrderRequest;
import com.example.springrestfulpractice.controller.dto.response.StatusResponse;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.springrestfulpractice.model.entity.Order;
import com.example.springrestfulpractice.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping()
    public List<Order> getAllOrders() {
        List<Order> response = orderService.getAllOrders();
        return response;
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id) {
        Order response=this.orderService.getOrderById(id);
        return response;
    }
    @PostMapping()
    public StatusResponse createUser(@RequestBody CreateOrderRequest request) {
        String response = orderService.createOrder(request);
        return new StatusResponse(response);
    }

    @PutMapping("/{id}")
    public StatusResponse updateOrder(@PathVariable int id, @RequestBody UpdateOrderRequest request) {
        String response = orderService.updateUser(id, request);
        return new StatusResponse(response);
    }

    @DeleteMapping("/{id}")
    public StatusResponse deleteOrderById(@PathVariable int id) {
        String response= orderService.deleteOrderById(id);
        return new StatusResponse(response);
    }
}
