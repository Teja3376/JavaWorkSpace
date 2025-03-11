package task2.collection.me;

import java.util.ArrayList;
import java.util.List;

public class CardGame{
public static String findGalaxyWithMaxStars(String input) {
        String[] galaxies = input.split("\\{"); // Split based on '{'
        int maxStars = 0;
        List<Integer> maxIndexes = new ArrayList<>();
        int index = 0; // Start from 0 to avoid -1 index issue

        for (String galaxy : galaxies) {
            if (galaxy.contains("}")) { // Ensure valid galaxy
                String content = galaxy.contains("}") ? galaxy.substring(0, galaxy.indexOf("}")) : "";
                int starCount = countStars(content);

                if (starCount > maxStars) {
                    maxStars = starCount;
                    maxIndexes.clear();
                    maxIndexes.add(index);
                } else if (starCount == maxStars) {
                    maxIndexes.add(index);
                }
                index++; // Increment only for valid galaxy
            }
        }

        return String.join(" ", maxIndexes.stream().map(i -> String.valueOf(i)).toArray(String[]::new));
    }

    private static int countStars(String galaxy) {
        int count = 0;
        for (char c : galaxy.toCharArray()) {
            if (c == '*') count++;
        }
        return count;
    }
    }