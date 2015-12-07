package model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Recipe {

	@Id
	public Long id;

	/** Nazwa dania **/
	public String name;

	/** Typ dania (danie główne, deser, itp.) **/
	public String type;
	
	/** Opis przygotowania **/
	public String description;
	
	/** Czas przyrządzania posiłku **/
	public Date duration;

	/** Lista składników **/
	@OneToMany(mappedBy = "recipe")
	public List<RecipeIngredient> recipeIngredients;
	
	/** Data dodania przepisu **/
	@Column(name = "add_date")
	public Date addDate;
}
