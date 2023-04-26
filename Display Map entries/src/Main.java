import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Poland");
        states.put(2, "United Kingdom");
        states.put(4, "France");
        states.put(3, "Italy");
        states.put(5, "Ukraine");

        displaySortedMapEntries(states);

        Map<Integer, String> ingredients = new HashMap<Integer, String>();
        ingredients.put(1, "Butter");
        ingredients.put(2, "Sugar");
        ingredients.put(4, "Eggs");
        ingredients.put(3, "Milk");
        ingredients.put(5, "Flour");

        displaySortedMapEntries(ingredients);
    }

    public static void displaySortedMapEntries(Map<Integer, String> mapToDisplay) {
        var sortedArray = mapToDisplay.entrySet().stream().sorted(
                (e1, e2) -> e1.getValue().compareTo(e2.getValue())
        ).toList();

        for (var entry: sortedArray) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}