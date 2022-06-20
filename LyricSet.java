package Totay13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LyricSet {
    private static final String[] lyric = {"you", "say", "it", "best",
            "when", "you", "say", "nothing", "at", "all"};

    public static void main(String[] args) {

        Set words = new HashSet();

        for (String w : lyric)
            words.add(w);
        for (Object o : words)
            System.out.print(o + " ");
        System.out.println("\n------------------");

        TreeSet treeSet = new TreeSet<>();
        for (String t : lyric)
            treeSet.add(t);
        for (Object r : treeSet)
            System.out.print(r + " ");
        System.out.println("\n------------------");

        System.out.println("Contains [you]?:" + treeSet.contains("you"));
        System.out.println("Contains [me]?:" + treeSet.contains("me"));


        System.out.println("Contains [you]?:" + words.contains("you"));
        System.out.println("Contains [me]?:" + words.contains("me"));
    }

}
