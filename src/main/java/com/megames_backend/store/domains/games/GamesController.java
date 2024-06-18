package com.megames_backend.store.domains.games;

import com.megames_backend.store.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/games")
public class GamesController extends AbstractController<Games, Long> {

    @Autowired
    public GamesController(GamesService gamesService) {
        super(gamesService);
    }
}
