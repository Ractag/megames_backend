package com.megames_backend.store.domains.games;

import com.megames_backend.store.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GamesService extends AbstractService<Games, Long> {

    private final GamesRepository gamesRepository;

    @Autowired
    public GamesService(GamesRepository gamesRepository) {
        super(gamesRepository);
        this.gamesRepository = gamesRepository;
    }

    @Override
    public Games update(Games entity, Long id) {
        Games foundGame = getById(id);
        foundGame.setTitle(entity.getTitle());
        foundGame.setDescription(entity.getDescription());
        foundGame.setGenre(entity.getGenre());
        foundGame.setPlatform(entity.getPlatform());
        foundGame.setReleaseDate(entity.getReleaseDate());
        foundGame.setDeveloper(entity.getDeveloper());
        foundGame.setPublisher(entity.getPublisher());
        foundGame.setPrice(entity.getPrice());
        foundGame.setRating(entity.getRating());
        foundGame.setAgeRating(entity.getAgeRating());
        foundGame.setCoverImageUrl(entity.getCoverImageUrl());
        foundGame.setTrailerUrl(entity.getTrailerUrl());
        foundGame.setMultiplayer(entity.getMultiplayer());
        foundGame.setTags(entity.getTags());

        return gamesRepository.save(foundGame);
    }
}
