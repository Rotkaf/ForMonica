package controllers;

import java.util.List;

import model.MealType;
import model.Recipe;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

	public Result index() {
	    return ok(views.html.index.render());
	}  
	
	public Result addRecipeForm() {
		return ok(views.html.addRecipe.render());
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)	
	public Result listRecipes() {
		
		//List<Recipe> recipes = DaoHelper.getAllRecipes();
		
		List<Recipe> recipes = JPA.em().createQuery("FROM Recipe").getResultList();
		
		return ok("recipes " + recipes);
	}
	
	public Result searchByIngredients() {
		return ok("szukaj po składnikach");
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	public Result getMealTypes() {
		List<MealType> mealTypes = JPA.em().createQuery("FROM MealType").getResultList();
		return ok(Json.toJson(mealTypes));
	}
}