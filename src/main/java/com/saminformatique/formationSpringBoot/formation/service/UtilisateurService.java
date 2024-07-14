package com.saminformatique.formationSpringBoot.formation.service;


import com.saminformatique.formationSpringBoot.formation.entities.Utilisateurs;
import com.saminformatique.formationSpringBoot.formation.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;


    public List<Utilisateurs> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    public Utilisateurs getUtilisateurById(Long id) {
        return utilisateurRepository.getById(id);
    }
    public Utilisateurs saveUtilisateur(Utilisateurs utilisateurs) {
        return utilisateurRepository.save(utilisateurs);
    }
}
