package com.ayoub.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayoub.produits.entities.Ingenieur;
import com.ayoub.produits.entities.Projet;
import com.ayoub.produits.repos.IngenieurRepository;

@Service
public class IngenieurServiceImpl implements IngenieurService {

	@Autowired
	IngenieurRepository produitRepository;

	@Override
	public Ingenieur saveIngenieur(Ingenieur p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);
	}

	@Override
	public Ingenieur updateIngenieur(Ingenieur p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);

	}

	@Override
	public void deleteIngenieur(Ingenieur p) {
		// TODO Auto-generated method stub
		produitRepository.delete(p);

	}

	@Override
	public void deleteIngenieurById(Long id) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(id);

	}

	@Override
	public Ingenieur getIngenieur(Long id) {
		// TODO Auto-generated method stub
		return produitRepository.findById(id).get();
	}

	@Override
	public List<Ingenieur> getAllIngenieur() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public List<Ingenieur> findByNomIngenieur(String nom) {
		// TODO Auto-generated method stub
		return produitRepository.findByNomIngenieur(nom);
	}

	@Override
	public List<Ingenieur> findByNomIngenieurContains(String nom) {
		// TODO Auto-generated method stub
		return produitRepository.findByNomIngenieurContains(nom);
	}

	@Override
	public List<Ingenieur> findByNomExpertise(String nom, String expertise) {
		// TODO Auto-generated method stub
		return produitRepository.findByNomExpertise(nom, expertise);
	}

	@Override
	public List<Ingenieur> findByProjet(Projet projet) {
		// TODO Auto-generated method stub
		return produitRepository.findByProjet(projet);

	}

	@Override
	public List<Ingenieur> findByProjetIdProj(Long id) {
		// TODO Auto-generated method stub
		return produitRepository.findByProjetIdProj(id);
	}

	@Override
	public List<Ingenieur> findByOrderByNomIngenieurAsc() {
		// TODO Auto-generated method stub
		return produitRepository.findByOrderByNomIngenieurAsc();

	}

}
