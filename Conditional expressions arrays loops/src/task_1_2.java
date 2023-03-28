public class task_1_2 {
        public static void main(String[] args) {
            int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 48, 49, 50};

            int totalSum = 0;

            for (int i = 0; i < mass.length; i++) {
                int numberFromTheArray = mass[i];

                if (numberFromTheArray > 5 && numberFromTheArray < 45) {
                    totalSum = totalSum + numberFromTheArray;
                }
            }

            System.out.println("total sum: " + totalSum);
        }
}
