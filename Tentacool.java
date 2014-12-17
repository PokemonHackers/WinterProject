public class Tentacool extends Pokemon{

    public Tentacool(){
        carnivore = true;
        prey_rank = 2;
        hatch = 21;
        catch_rate = 190;
        rarity = 1;
        population = 0;
        mountain = false;
        lake = true;
        grass = false;
        price = 12;
    } // change this to the pokemon name

    public String toString(){
        return "These small gelatinous creatures feed on small sea critters, and reproduce just enough that they are easy to take care of. They are, however, exceedingly common.";
    }
}
