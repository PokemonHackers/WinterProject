public class Kingdra implements PokemonInterface{

private boolean carnivore = true;
private int prey_rank = 4;
private int hatch = 21;
private int catch_rate = 45;
private int rarity = 9;
private int population = 0;
private boolean mountain = false;
private boolean lake = true;
private boolean grass = false;
private int price = 1100;
private String description = "These fearsome dragons are destructive creatures. They hunt and kill easily."

public Kingdra(){} // change this to the pokemon name

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
