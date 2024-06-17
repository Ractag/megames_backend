package com.megames_backend.store.domains.cartItem;

import com.megames_backend.store.domains.cart.Cart;
import com.megames_backend.store.domains.games.Games;
import jakarta.persistence.*;

@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Games game;

    private int quantity;

}
