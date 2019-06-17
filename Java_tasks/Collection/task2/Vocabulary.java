package task2;

import java.util.HashMap;
import java.util.Map;

public class Vocabulary {
    Map<String, String> vocabularyEngRus = new HashMap<>();

    public Vocabulary() { };

    public void addWordsForTranslation(String eng, String rus){
        vocabularyEngRus.put(eng, rus);
    }

    public String translateText(String text){
        String[] words = text.split(" ");
        String translated = "";
        for(String word: words){
            if (vocabularyEngRus.containsKey(word.toUpperCase())){
                translated += vocabularyEngRus.get(word.toUpperCase()) + " ";
            } else {
                translated += "*no translation*" + " ";
            }
        }
        return translated;
    }
}
