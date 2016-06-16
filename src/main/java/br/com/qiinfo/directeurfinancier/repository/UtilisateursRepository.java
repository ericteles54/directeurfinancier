package br.com.qiinfo.directeurfinancier.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.qiinfo.directeurfinancier.model.Utilisateur;

@Repository
public class UtilisateursRepository {

	private static final List<Utilisateur> UTILISATEUR_LISTE = new ArrayList<>();
	
	static {		
		UTILISATEUR_LISTE.add(new Utilisateur(1L, "Gerard", "123qwe", "gerard@email.com"));
		UTILISATEUR_LISTE.add(new Utilisateur(2L, "Laura", "123qwe", "laura@email.com"));
		UTILISATEUR_LISTE.add(new Utilisateur(3L, "Eric", "123qwe", "eric@email.com"));		
	}
	
	public List<Utilisateur> tous() {
		return UtilisateursRepository.UTILISATEUR_LISTE;
	}
	
	public void ajouter(Utilisateur utilisateur) {
		UtilisateursRepository.UTILISATEUR_LISTE.add(utilisateur);
	}
}
