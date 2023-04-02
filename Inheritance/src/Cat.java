public class Cat extends Animal {
    private String color;
    public String getColor() {
        return this.color;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }

    Cat(String color, boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color = "Black (default color)";
    }
}
