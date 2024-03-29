package com.bac.itformation.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Entite permettant la representation du compte d'un utilisateur avec un certain niveau d'autorisation
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 6, max = 50)
    private String motDePasse;

    @NotNull
    @Size(min = 4, max = 50)
    private String identifiant;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TypeDeCompte typeCompte = TypeDeCompte.Users_Normal;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JsonBackReference
    private Utilisateur utilisateur;
}
