public class Magikarp extends Pokemon{

    public Magikarp(){
        carnivore = false;
        prey_rank = 1;
        hatch = 6;
        catch_rate = 255;
        rarity = 1;
        population = 0;
        mountain = false;
        lake = true;
        grass = false;
        price = 10;
    }

    public String toString(){
        return "This seemingly useless Pokemon is found everywhere, and is thus is the primary food for many sea creatures. Beware, they breed like wild, and could crowd out other species in their pond";
    }
}
