package hu.nive.ujratervezes.kepesitovizsga.sleepingbeauty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SleepingBeauty {

    public Map<Character, Integer> countCharacters(String filename) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(SleepingBeauty.class.getResourceAsStream("/" + filename)))) {

            return count(br);

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    private Map<Character, Integer> count(BufferedReader br) throws IOException {
        Map<Character, Integer> letters = new HashMap<>();
        int character;
        while ((character = br.read()) != -1) {
            char letter = Character.toLowerCase((char) character);
            if (Character.isLetter(letter) && !letters.containsKey(letter)) {
                letters.put(letter, 1);
            } else if (Character.isLetter(letter) && letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1);
            }
        }
        return letters;
    }
}
