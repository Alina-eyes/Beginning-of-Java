import java.util.concurrent.ThreadLocalRandom;

public class task3 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[100];
        for (int i=0; i<100; i++) {
            arrayOfNumbers[i] = ThreadLocalRandom.current().nextInt(-100, 100);;
        }
        int totalSum = 0;
        for (int numberFromTheArray: arrayOfNumbers) {
            if (numberFromTheArray > 5 && numberFromTheArray < 45) {
                totalSum = totalSum + numberFromTheArray;
            }
            // TODO: write the if statement printing the number if it's even and positive
        }
        System.out.println("Sum of all elements of the array that are >5 and <45: " + totalSum);
    }
}