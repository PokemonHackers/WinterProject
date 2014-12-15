public abstract class Pokemon {

    protected boolean carnivore;
    protected int prey_rank;
    protected int hatch;
    protected int catch_rate;
    protected int rarity;
    protected boolean mountain;
    protected boolean lake;
    protected boolean grass;
    protected int price;
    protected String description;

    public int get_price(){
        return price;
    }

    public boolean isCarnivore(){
        return carnivore;
    }

    public int prey_rank(){
        return prey_rank;
    }

    public int catchRate(){
        return catch_rate;
    }

    public int getRarity(){
        return rarity;
    }

    public boolean isMountain(){
        return mountain;
    }

    public boolean isLake(){
        return lake;
    }
    public boolean isGrass(){
        return grass;
    }

    public void set_population(int new_pop){
        population = new_pop;
    }

    public abstract String toString();
    public abstract int getPopulation();
}
