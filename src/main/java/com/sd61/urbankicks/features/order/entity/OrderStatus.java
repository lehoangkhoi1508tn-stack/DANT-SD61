package com.sd61.urbankicks.features.order.entity;

import lombok.*;



public enum OrderStatus {
    PENDING(0),
    CONFIRMED(1),
    SHIPPING(2),
    COMPLETED(3),
    CANCELLED(4);

    private final int code;

    OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus fromCode(int code) {
        for (OrderStatus s : values()) {
            if (s.code == code) return s;
        }
        throw new IllegalArgumentException("Unknown OrderStatus code: " + code);
    }
}