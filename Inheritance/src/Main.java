import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Ginger", false, "mice", 4);
        Cat cat2 = new Cat("Black", false, "cat food", 4);
        Cat cat3 = new Cat(false, "the sofa", 4);
        Animal animal1 = new Animal(true, "grain", 4);
        Animal animal2 = new Animal();

        System.out.println("cat1 is: " + ReflectionToStringBuilder.toString(cat1));
        System.out.println("cat2 is: " + ReflectionToStringBuilder.toString(cat2));
        System.out.println("cat3 is: " + ReflectionToStringBuilder.toString(cat3));
        System.out.println("animal1 is: " + ReflectionToStringBuilder.toString(animal1));
        System.out.println("animal2 is: " + ReflectionToStringBuilder.toString(animal2));
    }
}