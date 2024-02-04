package com.bac.itformation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_session;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dateDebut;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dateFin;

    @ManyToOne
    private List<Formateur> formateurs;

    @ManyToOne
    private List<User> users;

    @NotNull
    @ManyToOne
    private Formation formation;
}
