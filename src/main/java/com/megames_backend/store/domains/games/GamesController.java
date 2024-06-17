package com.megames_backend.store.domains.games;

import com.megames_backend.store.AbstractController;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
public class GamesController extends AbstractController<Games> {

    @Autowired
    private GamesService gamesService;
}
