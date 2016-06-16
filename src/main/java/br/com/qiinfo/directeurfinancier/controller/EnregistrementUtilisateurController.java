package br.com.qiinfo.directeurfinancier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.qiinfo.directeurfinancier.model.Utilisateur;
import br.com.qiinfo.directeurfinancier.repository.UtilisateursRepository;

@Controller
@RequestMapping("/utilisateurs")
public class EnregistrementUtilisateurController {

	@Autowired
	private UtilisateursRepository utilisateursRepository;
	
	@RequestMapping
	public ModelAndView liste() {
		
		ModelAndView mv = new ModelAndView("EnregistrementUtilisateurs");
		mv.addObject("utilisateurs", utilisateursRepository.tous());
		mv.addObject(new Utilisateur());
		
		return mv;		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String sauvegarder(Utilisateur utilisateur) {
		this.utilisateursRepository.ajouter(utilisateur);
		
		return "redirect:/utilisateurs";
	}
}
