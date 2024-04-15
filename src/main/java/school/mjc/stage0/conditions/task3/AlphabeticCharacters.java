package school.mjc.stage0.conditions.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlphabeticCharacters {
    public List<Character> consonant = new ArrayList<Character>(Arrays.asList('b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'));
    public void vowelDeterminer(char character) {
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o'
                || character == 'u' || character == 'A' || character == 'E' || character == 'I'
                || character == 'O' || character == 'U')
            System.out.println("It is a Vowel.");
        else if (consonant.contains(character)) {
            System.out.println("It is a Consonant.");
        }
        else {
            System.out.println("wrong alphabet!");
        }
    }
}
