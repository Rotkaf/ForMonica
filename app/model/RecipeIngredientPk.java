package model;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
public class RecipeIngredientPk implements Serializable {

	@ManyToOne
	@JoinColumn(name = "recipe_id")
	private Recipe recipes;

	@ManyToOne
	@JoinColumn(name = "ingredient_in")
	private Ingredient ingredients;
}
