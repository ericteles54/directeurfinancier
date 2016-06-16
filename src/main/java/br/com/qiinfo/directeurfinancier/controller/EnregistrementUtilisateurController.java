package br.com.qiinfo.directeurfinancier.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnregistrementUtilisateurController {

	@RequestMapping("/utilisateurs")
	public String liste() {
		return "EnregistrementUtilisateurs";
	}
}
