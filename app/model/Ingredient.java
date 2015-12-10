package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ingredient {

	@Id
	public Long id;
	
	@Column(nullable = false)
	public String name;
	
	@OneToMany(mappedBy = "recipeIngredientPk.ingredients")
	public List<RecipeIngredient> recipes;
		
}
