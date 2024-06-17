package com.megames_backend.store.domains.review;

import com.megames_backend.store.domains.games.Games;
import com.megames_backend.store.domains.user.UserApp;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserApp user;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Games game;

    private int rating;
    private String comment;
    private LocalDateTime reviewDate;

}
