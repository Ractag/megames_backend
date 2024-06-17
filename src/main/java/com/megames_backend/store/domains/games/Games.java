package com.megames_backend.store.domains.games;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String genre;
    private String platform;
    private LocalDate releaseDate;
    private String developer;
    private String publisher;
    private Double price;
    private Double rating;
    private String ageRating;
    private String coverImageUrl;
    private String trailerUrl;
    private Boolean multiplayer;
    private List<String> tags;

}
