public class Magikarp implements PokemonInterface{

private boolean carnivore = false;
private int prey_rank = 1;
private int hatch = 6;
private int catch_rate = 255;
private int rarity = 1;
private int population = 0;
private boolean mountain = false;
private boolean lake = true;
private boolean grass = false;
private int price = 10;
private String description = "This seemingly useless Pokemon is found everywhere, and is thus is the primary food for many sea creatures. Beware, they breed like wild, and could crowd out other species in their pond";

public Magikarp(){}

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
