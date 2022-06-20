package Totay13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LyricWork {
    private static final String[] lyric = {"you", "say", "it", "best",
            "when", "you", "say", "nothing", "at", "all"};

    public static void main(String[] args) {
        // Create a list that’s implemented by ArrayList
        List words = new ArrayList();
        // Add all String in string array to list
        for (String w : lyric)
            words.add(w);
        for (Object o : words)
            System.out.print(o + " ");
        System.out.println("\n------------------");

        System.out.println("Contains [you]?:" + words.contains("you"));
        System.out.println("Contains [me]?:" + words.contains("me"));
        System.out.println("Where's [say]?:" + words.indexOf("say"));
        System.out.println("Where's the last [say]?: " +       words.lastIndexOf("say"));

        //Sort words
        Collections.sort(words);

        //show all elements of words
        for (Object o : words) {
            System.out.print(o + " ");
        }
    }


}
