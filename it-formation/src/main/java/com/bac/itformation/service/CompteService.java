package com.bac.itformation.service;

import com.bac.itformation.exception.NotFoundException;
import com.bac.itformation.model.Compte;
import com.bac.itformation.repository.CompteRepository;
import com.bac.itformation.repository.CompteRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteService {

    private final CompteRepository compteRepository;
    private final JdbcTemplate jdbcTemplate;

    public CompteService(CompteRepository compteRepository, JdbcTemplate jdbcTemplate) {
        this.compteRepository = compteRepository;
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Compte> findAll() {
        return compteRepository.findAll();
    }

    public Compte findById(Long id) {
        return compteRepository.findById(id).orElseThrow( () -> new NotFoundException("Compte inconnue !"));
    }

    public Compte save(Compte compte) { return compteRepository.save(compte);}


    public Compte update(Compte compte) {
        return compteRepository.save(compte);
    }

    public void deleteById(Long id) {
        compteRepository.deleteById(id);
    }

    public void deleteAll() {
        compteRepository.deleteAll();
    }
}