package school.mjc.stage0.conditions.task3;

import java.util.Arrays;
import java.util.List;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        Character[] lowerCaseAlphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        List<Character> list =  Arrays.asList(lowerCaseAlphabet);
         if(list.contains(symbol)){
             System.out.println("English");
         }
         else{
             System.out.println("Not english");
         }
    }
}
