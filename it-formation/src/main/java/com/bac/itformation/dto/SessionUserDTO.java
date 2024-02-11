package com.bac.itformation.dto;

import lombok.Data;

import java.util.Date;

@Data
public class SessionUserDTO {

    private String nomFormation;

    private String themeFormation;

    private String dureeFormation;

    private Date dateDebut;

    private boolean isEvaluee;

}
