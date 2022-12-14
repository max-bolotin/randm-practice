package com.example.randmpractice.model;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "movie_character")
public class MovieCharacter {
    @Id
    @GeneratedValue(generator = "movie_character_id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "movie_character_id_seq",
    sequenceName = "movie_character_id_seq",
    allocationSize = 1)
    private Long id;
    private String name;
//    @Enumerated(EnumType.STRING)
    private String status;
//    @Enumerated(EnumType.STRING)
    private String gender;

}
