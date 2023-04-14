public class Tests {
    public static void main(String[] args) {
        System.out.println("Testing all the animals!");
        Cat garfield = new Cat("Garfield");
        Dog spot = new Dog("Spot");
        BigDog bobik = new BigDog("Bobik");
        Dog reksio = new Dog("Reksio");
        garfield.greets();

        bobik.greets(spot);
        bobik.greets(bobik);

        Lion simba = new Lion("Simba");
        Lion mufasa = new Lion("Mufasa");

        allAnimalsGreet(new Animal[] { spot, reksio, bobik, garfield, simba, mufasa });

        takePetsForAWalk(new Pet[] { spot, reksio, bobik, garfield });
        playWithPets(new Pet[] { spot, reksio, bobik, garfield });
        feedAllThePets(new Pet[] { spot, reksio });
        wildAnimalsGoHunting(new Lion[] { simba, mufasa });
    }

    public static void takePetsForAWalk(Pet[] pets) {
        for (var pet : pets) {
            pet.walk();
        }
    }

    public static void playWithPets(Pet[] pets) {
        for (var pet : pets) {
            pet.play();
        }
    }

    public static void feedAllThePets(Pet[] pets) {
        System.out.println("Feeding all the pets in the morning");
        for (var pet : pets) {
            pet.feed();
        }
        System.out.println("Feeding all the pets in the evening");
        for (var pet : pets) {
            pet.feed();
        }
    }

    public static void wildAnimalsGoHunting(WildAnimal[] animals) {
        for (var animal : animals) {
            animal.hunting();
        }
    }

    public static void allAnimalsGreet(Animal[] animals) {
        for (var animal : animals) {
            animal.greets();
        }
    }
}