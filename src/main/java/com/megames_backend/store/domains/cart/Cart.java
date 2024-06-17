package com.megames_backend.store.domains.cart;

import com.megames_backend.store.domains.cartItem.CartItem;
import com.megames_backend.store.domains.user.UserApp;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserApp user;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<CartItem> items;
    // getters and setters
}
