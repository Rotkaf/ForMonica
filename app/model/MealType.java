package model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="meal_type")
public class MealType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="mealtype_seq")
    @SequenceGenerator(name="mealtype_seq", sequenceName="mealtype_seq")
	public Long id;
	
	@Column(nullable = false, unique = true)
	public String name;
	
	//@OneToMany(cascade=ALL, mappedBy="mealType")
	@OneToMany(mappedBy="mealType")
	public Set<Recipe> recipes;
}
