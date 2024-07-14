package com.saminformatique.formationSpringBoot.formation.repository;

import com.saminformatique.formationSpringBoot.formation.entities.Utilisateurs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateurs,Long> {
}
