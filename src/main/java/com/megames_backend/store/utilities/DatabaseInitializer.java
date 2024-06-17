package com.megames_backend.store.utilities;

import com.megames_backend.store.domains.games.Games;
import com.megames_backend.store.domains.games.GamesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private final GamesRepository gamesRepository;

    @Override
    public void run(String... args) throws Exception {
            this.createGames();
    }

    private void createGames() {
        Games Game1 = Games.builder()
                .title("Metal Gear Solid")
                .description("Metal Gear Solid (メタルギアソリッド, Metaru Gia Soriddo?), communément abrégé MGS, est un jeu vidéo d'action-infiltration produit et réalisé par Hideo Kojima, développé et édité par Konami, et sorti en 1998 sur PlayStation.")
                .genre("Tactique, Espionnage, Action")
                .platform("Playstation")
                .releaseDate(LocalDate.parse("2000-10-24"))
                .developer("Konami, Digital Dialect (PC)")
                .publisher("Konami, Microsoft Game Studios (PC)")
                .price(50.5)
                .rating(4.9)
                .ageRating("18+")
                .coverImageUrl("https://image.jeuxvideo.com/images/ps/m/g/mgsops0f.jpg")
                .trailerUrl("Indisponible")
                .multiplayer(false)
                .tags(List.of(new String[]{"Action", "Infiltration"}))
                .build();


        this.gamesRepository.save(Game1);
    }
}
