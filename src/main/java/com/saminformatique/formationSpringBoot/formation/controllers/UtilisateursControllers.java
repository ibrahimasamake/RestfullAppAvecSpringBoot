package com.saminformatique.formationSpringBoot.formation.controllers;

import com.saminformatique.formationSpringBoot.formation.entities.Utilisateurs;
import com.saminformatique.formationSpringBoot.formation.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
//cette classe vas gere la communication http de mon micro service

@RequestMapping("/utilisateur")
//cette anotation montre que
// le controlleur "UtilisateurController" vas ecoute que
// les requette  provenant de localhost:8080/utilisateur
public class UtilisateursControllers {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping

    public List<Utilisateurs> FindAll(){
        return utilisateurService.getAllUtilisateurs();
    }
    @PostMapping
    public Utilisateurs Create(@RequestBody Utilisateurs utilisateur){

        return utilisateurService.saveUtilisateur(utilisateur);

    }

    @PutMapping
    public String Update(){
        return "Utilisateur Update ok";
    }
    @DeleteMapping
    public String Delete(){
        return "Utilisateur Delete ok";
    }







}
