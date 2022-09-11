package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author logan
 */
public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public void add(String words, String translation) {
        dictionary.putIfAbsent(words, translation);
        dictionary.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        return dictionary.get(word);
    }

    public void delete(String word) {
        dictionary.remove(dictionary.get(word));
        dictionary.remove(word);
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(this.file))
                    .map(l -> l.split(":"))
                    .forEach(parts -> {
                        this.dictionary.put(parts[0], parts[1]);
                        this.dictionary.put(parts[1], parts[0]);
                    });
            return true;
        } 
        catch (Exception e) {
            return false;
        }
    }
    
    public boolean save() {
        try {
        PrintWriter writer = new PrintWriter(new File(file));
        ArrayList<String> alreadyAdded = new ArrayList<>();
        
        this.dictionary.keySet().stream()
                .forEach(t -> {
                    if (alreadyAdded.contains(t)) {
                        return;
                    }
                    alreadyAdded.add(t);
                    alreadyAdded.add(dictionary.get(t));
                    writer.println(t + ":" + dictionary.get(t));
                        });
        writer.close();
                
        return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
