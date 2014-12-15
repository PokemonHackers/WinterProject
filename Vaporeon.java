public class Vaporeon implements PokemonInterface{

private boolean carnivore = true;
private int prey_rank = 3;
private int hatch = 36;
private int catch_rate = 45;
private int rarity = 8;
private int population = 0;
private boolean mountain = false;
private boolean lake = true;
private boolean grass = false;
private int price = 800;
private String description = "These friendly creatures are a popular attraction - rare, strong, and playful. However, they aren't easy to take of."

public Vaporeon(){} // change this to the pokemon name

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
