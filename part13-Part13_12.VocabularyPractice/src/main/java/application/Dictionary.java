package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Dictionary {
    
    private List<String> words;
    private Map<String, String> translations;
    
    public Dictionary() {
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
        
        add("word", "sana");
    }
    
    public String get(String word) {
        return translations.get(word);
    }
    
    public void add(String word, String translation) {
        if (!this.translations.containsKey(word)) {
            this.words.add(word);
        }

        this.translations.put(word, translation);
    }
    
    public String getRandomWord() {
        Random random = new Random();
        return words.get(random.nextInt(this.words.size()));
    }
}
