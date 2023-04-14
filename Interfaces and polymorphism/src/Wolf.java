public class Wolf extends  Animal implements WildAnimal {
    Wolf(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wolf " + this.getName() + " says: Hawoo");
    }

    @Override
    public void hunting() {
        System.out.println("Wolf " + this.getName() + " goes hunting");
    }
}
