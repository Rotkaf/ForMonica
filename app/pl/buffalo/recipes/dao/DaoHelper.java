package pl.buffalo.recipes.dao;

import java.util.List;

import model.Recipe;
//import play.db.jpa.JPA;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;

public class DaoHelper {

	public static Recipe findById(Long id) {
		return JPA.em().find(Recipe.class, id);
		//return Recipe.find.byId(id);
	}
	
//    @Transactional
	public static List<Recipe> getAllRecipes() {
		return JPA.em().createQuery("SELECT * FROM recipe").getResultList();
//		return Recipe.find.all();
	}
}
