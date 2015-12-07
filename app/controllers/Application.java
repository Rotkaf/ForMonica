package controllers;

import java.util.List;

import javax.persistence.Persistence;
import javax.sql.DataSource;

import model.Recipe;
import pl.buffalo.recipes.dao.DaoHelper;
import play.db.DB;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

	public Result index() {
	    return ok(views.html.index.render());
	}  
	
	public Result addRecipeForm() {
		return ok("dodawanie");
	}
	
	@Transactional(readOnly=true)	
	public Result listRecipes() {
		
//		Persistence.generateSchema("defaultPersistenceUnit", null);
		
		//List<Recipe> recipes = DaoHelper.getAllRecipes();
		
		List<Recipe> recipes = JPA.em().createQuery("FROM Recipe").getResultList();
		
		//List<Recipe> recipes = Recipe.find.all();
		
		System.out.println("recipes " + recipes);
		return ok("recipes " + recipes);
	}
	
	public Result searchByIngredients() {
		return ok("szukaj po składnikach");
	}
}