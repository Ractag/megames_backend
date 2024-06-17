package com.megames_backend.store.domains.orders;

import com.megames_backend.store.domains.orderItem.OrderItem;
import com.megames_backend.store.domains.user.UserApp;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserApp user;

    private LocalDateTime orderDate;
    private String status; // e.g., PENDING, COMPLETED, CANCELED

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> items;
    // getters and setters
}
