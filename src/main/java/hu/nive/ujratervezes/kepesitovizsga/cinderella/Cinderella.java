package hu.nive.ujratervezes.kepesitovizsga.cinderella;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Cinderella {

    private int[] numbers = new int[5];
    private String[] importantWords = new String[]{"Hamupipőke", "galamb", "királyfi", "mostoha", "cipő"};

    public int[] getNumbers() {
        return numbers;
    }

    public void readFromFile() {
        try (BufferedReader br = Files.newBufferedReader(Path.of("src/main/resources/cinderella/cinderella.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                countWords(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    private void countWords(String line) {
        line = line.replace('.', ' ');
        line = line.replace(',', ' ');
        String[] temp = line.split(" ");
        for (String s : temp) {
            if (s.contains(importantWords[0])) {
                numbers[0] += 1;
            } else if (s.toLowerCase().contains(importantWords[1])) {
                numbers[1] += 1;
            } else if (s.toLowerCase().contains(importantWords[2])) {
                numbers[2] += 1;
            } else if (s.toLowerCase().contains(importantWords[3])) {
                numbers[3] += 1;
            } else if (s.toLowerCase().contains(importantWords[4])) {
                numbers[4] += 1;
            }
        }
    }

    public Object[] getMax() {
        int max = 0;
        String word = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                word = importantWords[i];
            }
        }
        return new Object[]{word, max};
    }
}
