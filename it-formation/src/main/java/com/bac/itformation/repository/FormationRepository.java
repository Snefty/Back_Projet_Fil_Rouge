package com.bac.itformation.repository;

import com.bac.itformation.model.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationRepository extends JpaRepository<Adresse, Long> {
}
