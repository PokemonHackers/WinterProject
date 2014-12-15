public class Tentacool implements PokemonInterface{

private boolean carnivore = true;
private int prey_rank = 2;
private int hatch = 21;
private int catch_rate = 190;
private int rarity = 1;
private int population = 0;
private boolean mountain = false;
private boolean lake = true;
private boolean grass = false;
private int price = 12;
private String description = "These small gelatinous creatures feed on small sea critters, and reproduce just enough that they are easy to take care of. They are, however, exceedingly common.";

public Tentacool(){} // change this to the pokemon name

public String description(){
	return this.description;
}

public int get_price(){
	return this.price;
}

public boolean isCarnivore(){
	return this.carnivore;
}

public int prey_rank(){
	return this.prey_rank;
}

public int catch(){
	return this.catch_rate;
}

public int rarity(){
	return this.rarity;
}

public int population(){
	return this.population;
}

public boolean mountain(){
	return this.mountain;
}

public boolean lake(){
	return this.lake;
}
public boolean grass(){
	return this.grass;
}

public void set_population(int new_pop){
	this.population = new_pop;
}





}
