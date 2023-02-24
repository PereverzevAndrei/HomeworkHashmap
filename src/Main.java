import java.util.*;


public class Main {
    static String text = "lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    static Map<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        char[] symbolSet = text.toCharArray();

        for (int i = 0; i < symbolSet.length; i++) {
            Integer charQuantity = map.get(symbolSet[i]);
            if (Character.isLetter(symbolSet[i])) {
                if (!map.containsKey(symbolSet[i])) {
                    map.put(symbolSet[i], 1);
                } else {
                    map.put(symbolSet[i], charQuantity + 1);
                }
            }
        }
        System.out.println(map);
        moreOftenLetter();
        lessMeetsLetter();

    }
    public static void moreOftenLetter () {
        int freq = 0;
        char letter = 'a';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > freq) {
                freq = entry.getValue();
                letter = entry.getKey();
            }
        }
        System.out.println("Наиболее часто встречающаяся буква : " + letter + " встречается -  " + freq + " раз.");
    }

    public static void lessMeetsLetter () {
        int freq = 0;
        char letter = 'a';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() < freq) {
                freq = entry.getValue();
                letter = entry.getKey();
            }
        }
        System.out.println("Наименее часто встречающаяся буква : " + letter + " встречается -  " + freq + " раз.");
    }
}