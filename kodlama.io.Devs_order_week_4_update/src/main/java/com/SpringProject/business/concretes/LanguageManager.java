package com.SpringProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringProject.business.abstracts.LanguageService;
import com.SpringProject.dataAccess.abstracts.LanguageRepository;
import com.SpringProject.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	
	LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	@Override
	public List<Language> getAll() {
		 //is kuralları
		return languageRepository.getAll();
	}
	
	@Override
	public Language getById(int id) throws Exception {
		if (!isIdExist(id)) {
			throw new Exception("Language id is not valid.");
			//return null;
		}
		return languageRepository.getById(id);
	}
	
	@Override
	public void update(int id, String newName)throws Exception {
		if (!isIdExist(id)) {
			throw new Exception("Invalid id!");
		}
		for (Language l : getAll()) {
			if (l.getName().equals(newName) || newName.isEmpty()) {
				throw new Exception("Invalid language name!");
			}
		}
		languageRepository.update(id,newName);
	}
	
	@Override
	public void add(Language language) {
			if (!isNameExist(language)) {
				languageRepository.add(language);
			}
	}
	
	@Override
	public void delete(int id) {
		if (isIdExist(id)) {
			languageRepository.delete(id);
		}
	}
	
	public boolean isIdExist(int id) {
		for (Language language : getAll()) {
			if (language.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isNameExist(Language language) {
		for (Language l : getAll()) {
			if (l.getName().equals(language.getName()) || language.getName().isEmpty()) {
				return true;
			}
		}
		return false;
	}
	

}
