package com.ayoub.produits.service;

import java.util.List;
import com.ayoub.produits.entities.Ingenieur;
import com.ayoub.produits.entities.Projet;


public interface IngenieurService {
	Ingenieur saveIngenieur(Ingenieur p);
	Ingenieur updateIngenieur(Ingenieur p);
	void deleteIngenieur(Ingenieur p);
	 void deleteIngenieurById(Long id);
	 Ingenieur getIngenieur(Long id);
	List<Ingenieur> getAllIngenieur();
	List<Ingenieur> findByNomIngenieur(String nom);
	List<Ingenieur> findByNomIngenieurContains(String nom);
	List<Ingenieur> findByNomExpertise (String nom, String expertise);
	List<Ingenieur> findByProjet (Projet projet);
	List<Ingenieur> findByProjetIdProj(Long id);
	List<Ingenieur> findByOrderByNomIngenieurAsc();
}
