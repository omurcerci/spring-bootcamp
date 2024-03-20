package com.SpringProject.dataAccess.abstracts;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.SpringProject.entities.concretes.Language;

@Repository
public interface LanguageRepository {

	  List<Language> getAll(); 
	  
	  Language getById(int id);
	  	
	  void update(int id, String newName);
	  	
	  void add(Language language);
	  	
	  void delete(int id);
}
