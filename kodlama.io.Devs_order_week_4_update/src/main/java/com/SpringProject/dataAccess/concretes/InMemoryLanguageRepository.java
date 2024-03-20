package com.SpringProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import com.SpringProject.dataAccess.abstracts.LanguageRepository;
import com.SpringProject.entities.concretes.Language;

public class InMemoryLanguageRepository implements LanguageRepository{
	
	List<Language> language;
	
	
	public InMemoryLanguageRepository(List<Language> language) {
		this.language = new ArrayList<Language>();
		language.add(new Language(1,"Java"));
		language.add(new Language(2,"Python"));
		language.add(new Language(3,"Go"));
		language.add(new Language(4,"C#"));
		language.add(new Language(5,"C++"));
	}


	@Override
	public List<Language> getAll() {
		
		return language;
	}


	@Override
	public Language getById(int id) {
		for(Language language : language)
		{
			if(language.getId() == id)
			{
				return language;
			}
			
		}
		return null;
	}


	@Override
	public void update(int id, String newName) {
		Language programingLanguage2 = getById(id);
		programingLanguage2.setName(newName);
		
	}


	@Override
	public void add(Language language) {
		System.out.println("Yazamadım");
	}


	@Override
	public void delete(int id) {
		for (Language l : language) {
			if (l.getId() ==id) {
				language.remove(l);
			}
		}
		
	}
}
