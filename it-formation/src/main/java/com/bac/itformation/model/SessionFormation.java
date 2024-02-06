package com.bac.itformation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SessionFormation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_session;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dateDebut;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dateFin;

    @NotNull
    @ManyToOne
    private Formation formation;

    @ManyToOne
    private Formateur formateur;

    @ManyToOne
    private User user;

}