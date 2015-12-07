package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//import com.avaje.ebean.Model;

@Entity
public class Ingredient {//extends Model {

	@Id
	public Long id;
	
	public String name;
	
	@OneToMany(mappedBy = "ingredient")
	public List<RecipeIngredient> recipeIngredients;
		
}
