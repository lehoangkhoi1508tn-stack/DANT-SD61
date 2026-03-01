package com.example.cart.controller;

import com.example.cart.entity.CartItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Arrays;
import java.util.UUID;

@Controller
@RequestMapping("/cart")
public class CartViewController {

    @GetMapping
    public String showCart(Model model) {

        CartItem item1 = new CartItem(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 1, 1200000.0, "Nike Air Force 1");
        CartItem item2 = new CartItem(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 2, 950000.0, "Adidas Forum Low");
        model.addAttribute("cartItems", Arrays.asList(item1, item2));
        return "cart";
    }

    @GetMapping("/checkout")
    public String showCheckout(@RequestParam Double total, Model model) {
        model.addAttribute("totalAmount", total);
        return "checkout";
    }
}