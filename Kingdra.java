public class Kingdra extends Pokemon{

    private int population;

    public Kingdra(){
        carnivore = true;
        prey_rank = 4;
        hatch = 21;
        catch_rate = 45;
        rarity = 9;
        population = 0;
        mountain = false;
        lake = true;
        grass = false;
        price = 1100;
        description = "These fearsome dragons are destructive creatures. They hunt and kill easily.";
    } // change this to the pokemon name

    public String toString(){
        return description;
    }

    public int getPopulation() {
        return population;
    }
}
