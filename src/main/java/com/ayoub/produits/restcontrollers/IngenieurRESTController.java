package com.ayoub.produits.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ayoub.produits.entities.Ingenieur;
import com.ayoub.produits.service.IngenieurService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class IngenieurRESTController {

	@Autowired
	IngenieurService produitService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Ingenieur> getAllIngenieur() {
	return produitService.getAllIngenieur();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Ingenieur getIngenieurById(@PathVariable("id") Long id) {
	return produitService.getIngenieur(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Ingenieur createIngenieur(@RequestBody Ingenieur ingenieur) {
	return produitService.saveIngenieur(ingenieur);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Ingenieur updateIngenieur(@RequestBody Ingenieur ingenieur) {
	return produitService.updateIngenieur(ingenieur);
	}

	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteIngenieur(@PathVariable("id") Long id)
	{
	produitService.deleteIngenieurById(id);
	}
	@RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
	public List<Ingenieur> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
	return produitService.findByProjetIdProj(idCat);
	}
}
