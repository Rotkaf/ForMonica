package model;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@AssociationOverrides({
	@AssociationOverride(name = "recipeIngredientPk.recipes", joinColumns = @JoinColumn(name = "recipe_id")),
	@AssociationOverride(name = "recipeIngredientPk.ingredients", joinColumns = @JoinColumn(name = "ingredient_id")) 
})
@Table(name="recipe_ingredient")
public class RecipeIngredient {

	@EmbeddedId
	public RecipeIngredientPk recipeIngredientPk;

	/** Ilość danego składnika **/
	@Column(name = "ingredient_amount", nullable = false)
	public String ingredientAmount;

}
