import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] res1 = AddingAnElement(new String[] {"a", "b"}, "c", 2);
        assertArraysEqual(res1, new String[] { "a", "b", "c" });

        String[] res2 = AddingAnElement(new String[] {"t", "k"}, "l", 2);
        assertArraysEqual(res2, new String[] { "t", "k", "l" });

        String[] res3 = AddingAnElement(new String[] {"q", "r"}, "p", 0);
        assertArraysEqual(res3, new String[] { "p", "q", "r" });

        String[] res4 = AddingAnElement(new String[] {"4", "5", "6"}, "3");
        assertArraysEqual(res4, new String[] { "3", "4", "5", "6" });
    }


    public static String[] AddingAnElement (String [] elements, String element) {
        return AddingAnElement(elements, element, 0);
    }
    public static String[] AddingAnElement (String [] elements, String element, int index) {
        String[] newArray = new String[elements.length + 1];

        for (int i=0; i<elements.length + 1; ++i) {
            if (i < index) {
                newArray[i] = elements[i];
            } else if (i == index) {
                newArray[i] = element;
            } else {
                newArray[i] = elements[i-1];
            }
        }
        System.out.println("Final sequence is: " + Arrays.toString(newArray));

        return newArray;
    }

    private static void assertArraysEqual(String[] a, String[] b) throws Exception {
        if (!Arrays.equals(a, b)) {
            throw new Exception("The array is not what was expected! Expected " + Arrays.toString(b) + " got " + Arrays.toString((a)));
        };
    }
}