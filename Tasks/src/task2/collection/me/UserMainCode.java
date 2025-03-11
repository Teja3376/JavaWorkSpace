package task2.collection.me;

import java.util.*;


//raghu program
class UserMainCode {
    public String findGalaxyWithMaxStars(String input) {
        String[] galaxies = input.split("\\{"); 
        int maxStars = 0;
        List<Integer> maxIndexes = new ArrayList<>();

        for (int i = 0; i < galaxies.length; i++) {
            if (galaxies[i].contains("}")) { 
                String galaxy = galaxies[i].split("}")[0]; 
                int starCount = countStars(galaxy);

                if (starCount > maxStars) {
                    maxStars = starCount;
                    maxIndexes.clear();
                    maxIndexes.add(i - 1); 
                } else if (starCount == maxStars) {
                    maxIndexes.add(i - 1);
                }
            }
        }

        return maxIndexes.stream()
                .map(String::valueOf)
                .reduce((a, b) -> a + " " + b)
                .orElse("");
    }

    private int countStars(String galaxy) {
        int count = 0;
        for (char c : galaxy.toCharArray()) {
            if (c == '*') count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
		UserMainCode us = new UserMainCode();
		System.out.println(us.findGalaxyWithMaxStars("{***P**P***}{*****}{**P******}"));
	}
}