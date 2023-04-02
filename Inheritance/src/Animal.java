public class Animal {
    private boolean vegetarian;
    public boolean getVegetarian() {
        return this.vegetarian;
    }
    public void setVegetarian(boolean newVegetarian) {
        this.vegetarian = newVegetarian;
    }

    private String eats;
    public String getEats() {
        return this.eats;
    }
    public void setEats(String newEats) {
        this.eats = newEats;
    }

    private int noOfLegs;
    public int getNoOfLegs() {
        return this.noOfLegs;
    }
    public void setNoOfLegs(int newNoOfLegs) {
        this.noOfLegs = newNoOfLegs;
    }

    Animal() {}

    Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }
}
