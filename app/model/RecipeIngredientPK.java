package model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class RecipeIngredientPK implements Serializable {
	
	private Integer recipe_id;
	private Integer ingredient_id;
	
	public Integer getRecipe_id() {
		return recipe_id;
	}
	
	public void setRecipe_id(Integer recipe_id) {
		this.recipe_id = recipe_id;
	}
	
	public Integer getIngredient_id() {
		return ingredient_id;
	}
	
	public void setIngredient_id(Integer ingredient_id) {
		this.ingredient_id = ingredient_id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecipeIngredientPK other = (RecipeIngredientPK) obj;
		if (ingredient_id == null) {
			if (other.ingredient_id != null)
				return false;
		} else if (!ingredient_id.equals(other.ingredient_id))
			return false;
		if (recipe_id == null) {
			if (other.recipe_id != null)
				return false;
		} else if (!recipe_id.equals(other.recipe_id))
			return false;
		return true;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ingredient_id == null) ? 0 : ingredient_id.hashCode());
		result = prime * result + ((recipe_id == null) ? 0 : recipe_id.hashCode());
		return result;
	}

}