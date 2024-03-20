package com.SpringProject.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringProject.business.abstracts.LanguageService;
import com.SpringProject.entities.concretes.Language;

@RestController
@RequestMapping("api/languages")
public class controllers {
	private LanguageService languageService;
	
	@Autowired
	public controllers(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	   public List<Language> getAll(){
		   return languageService.getAll();
	   }
	@GetMapping("/getbyid")
	public Language getById(int id) throws Exception{
		return languageService.getById(id);
	}

	@GetMapping("/update")
	public void update(int id, String newName) throws Exception {
		languageService.update(id, newName);
	}

	@GetMapping("/add")
	public void add(Language language) {
		languageService.add(language);
	}

	@GetMapping("delete")
	public void delete(int id) {
		languageService.delete(id);
	   }
	
	
}
