import java.util.ArrayList;
public class Main {
    
    public static void main(String args[]) {

        //Test One
        ArrayList<String> words = new ArrayList<>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(words);
        
        WordChecker x = new WordChecker(words);
        System.out.println(x.isWordChain());

        //Test Two
        ArrayList<String> newWordsOne = new ArrayList<>();
        newWordsOne.add("to");
        newWordsOne.add("tools");
        newWordsOne.add("stool");
        newWordsOne.add("tools");

        WordChecker y = new WordChecker(newWordsOne);
        System.out.println(y.isWordChain());
        
        //Test Three
        ArrayList<String> newWordsTwo = new ArrayList<>();
        newWordsTwo.add("catch");
        newWordsTwo.add("bobcat");
        newWordsTwo.add("catchacat");
        newWordsTwo.add("cat");
        newWordsTwo.add("at");
        
        WordChecker z = new WordChecker(newWordsTwo);
        System.out.println(z.createList("cat"));
        System.out.println(z.createList("catch"));
        System.out.println(z.createList("dog"));




        

    }
}