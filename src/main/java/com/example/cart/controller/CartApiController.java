package com.example.cart.controller;

import com.example.cart.entity.Order;
import com.example.cart.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/cart")
public class CartApiController {

    @Autowired
    private OrderRepository orderRepository;

    // API 1: Cập nhật số lượng sản phẩm trong giỏ
    @PutMapping("/update-qty")
    public ResponseEntity<String> updateQty(@RequestParam UUID id, @RequestParam int qty) {
        // Logic update số lượng vào DB urbankicks ở đây
        return ResponseEntity.ok("Updated");
    }

    // API 2: Tạo đơn hàng mới từ giỏ hàng
    @PostMapping("/create-order")
    public ResponseEntity<String> createOrder(@RequestBody Order order) {
        order.setOrderCode("ORD-" + System.currentTimeMillis());
        orderRepository.save(order);
        return ResponseEntity.ok("Đặt hàng thành công!");
    }

    // API 3: (MỚI) Lấy toàn bộ danh sách đơn hàng để test Postman
    @GetMapping("/all-orders")
    public ResponseEntity<List<Order>> getAllOrders() {
        // Lấy sạch dữ liệu từ bảng orders trong SQL Server
        List<Order> orders = orderRepository.findAll();
        return ResponseEntity.ok(orders);
    }
}