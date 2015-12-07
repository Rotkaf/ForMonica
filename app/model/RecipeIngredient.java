package model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import com.avaje.ebean.Model;

@Entity
@Table(name = "recipes_ingredients")
public class RecipeIngredient {// extends Model {

	/*
	RecipeIngredient() {
		primaryKey = new RecipeIngredientPK();
	}
	*/

	@EmbeddedId
	private RecipeIngredientPK primaryKey = new RecipeIngredientPK();

	@ManyToOne
	@JoinColumn(name = "recipe_id", insertable = false, updatable = false)
	public Recipe recipe;

    @ManyToOne
	@JoinColumn(name = "ingredient_id", insertable = false, updatable = false)
	public Ingredient ingredient;

	/** Ilość danego składnika (np. "300 g") **/
	public String amount;
}


