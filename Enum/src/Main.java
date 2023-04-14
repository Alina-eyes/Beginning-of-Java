import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Size.MEDIUM.toString());
        System.out.println(Size.LARGE.toString());
        System.out.println(Size.EXTRA_LARGE.toString());
        if (!Size.MEDIUM.toString().equals("M or \"MEDIUM\" size: width=13, length=45")) {
            throw new Exception("Incorrect value");
        }
        if (!Size.LARGE.toString().equals("L or \"LARGE\" size: width=15, length=50")) {
            throw new Exception("Incorrect value");
        }

        if (!Size.EXTRA_LARGE.toString().equals("XL or \"EXTRA_LARGE\" size: width=17, length=55")) {
            throw new Exception("Incorrect value");
        }
    }
}