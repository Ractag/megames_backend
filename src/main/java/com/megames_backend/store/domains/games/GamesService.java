package com.megames_backend.store.domains.games;

import com.megames_backend.store.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class GamesService extends AbstractService<Games, Long> {

    private GamesRepository gamesRepository;

    public GamesService(JpaRepository<Games, Long> repository) {
        super(repository);
    }

    @Override
    public Games update(Games entity, Long id) {
        Games foundGames= getById(id);
        foundGames.setTitle(entity.getTitle());
        foundGames.setDescription(entity.getDescription());
        foundGames.setGenre(entity.getGenre());
        foundGames.setPlatform(entity.getPlatform());
        foundGames.setReleaseDate(entity.getReleaseDate());
        foundGames.setDeveloper(entity.getDeveloper());
        foundGames.setPublisher(entity.getPublisher());
        foundGames.setPrice(entity.getPrice());
        foundGames.setRating(entity.getRating());
        foundGames.setAgeRating(entity.getAgeRating());
        foundGames.setCoverImageUrl(entity.getCoverImageUrl());
        foundGames.setTrailerUrl(entity.getTrailerUrl());
        foundGames.setMultiplayer(entity.getMultiplayer());
        foundGames.setTags(entity.getTags());

        return repository.save(foundGames);
    }
}
