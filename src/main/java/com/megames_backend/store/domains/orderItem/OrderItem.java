package com.megames_backend.store.domains.orderItem;

import com.megames_backend.store.domains.games.Games;
import com.megames_backend.store.domains.orders.Order;
import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Games game;

    private int quantity;
    private double price;
    // getters and setters
}
