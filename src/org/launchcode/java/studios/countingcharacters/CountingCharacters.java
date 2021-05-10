package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    static boolean isAlpha(String str) {

        boolean isAlpha = true;
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (Character.isDigit(c)) {
                return isAlpha = false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str;

        do {
            System.out.println("Enter a string: ");
            str = input.nextLine().toLowerCase();
        } while (!isAlpha(str));

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        char[] charactersInStr = str.toCharArray();

        for (char i : charactersInStr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Character, Integer> character : map.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
