package com.example.cinemamongo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film {
    @Id
    private String id;
    private String nom;
    private Integer duree;

    @Field("seance")
    @DBRef
    private List<Seance> seances;

}
