package model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Recipe {

	@Id
	@GeneratedValue
	public Long id;

	
	/** Nazwa dania **/
	@Column(nullable = false)
	public String name;

	
	/** Typ dania (danie główne, deser, itp.) **/
	@ManyToOne
	@JoinColumn(name = "id", insertable = false, updatable = false) 
	public MealType mealType;


	/** Lista składników **/
	@OneToMany(mappedBy = "recipeIngredientPk.recipes")
	public List<RecipeIngredient> ingredients;
	
	
	/** Opis przygotowania **/
	@Column(name = "prepare_desc", nullable = false)
	public String prepareDesc;
	
	
	/** Czas przyrządzania posiłku **/
	public Date duration;
	
	
	/** Data dodania przepisu **/
	@Column(name = "add_date")
	public Date addDate;
}
