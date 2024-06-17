package com.megames_backend.store.domains.gameTag;

import com.megames_backend.store.domains.games.Games;
import com.megames_backend.store.domains.tags.Tags;
import jakarta.persistence.*;

@Entity
public class GameTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Games game;

    @ManyToOne
    @JoinColumn(name = "tag_id")
    private Tags tag;

}

