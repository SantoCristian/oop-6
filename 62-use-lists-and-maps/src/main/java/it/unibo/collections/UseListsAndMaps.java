package it.unibo.collections;


import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseListsAndMaps {

    private static final int ELEMS = 20;

    private UseListsAndMaps() {
    }
      

    /**
     * Program entry point.
     */
    public static void main() {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
         final Set<String> set = new TreeSet<>();
        /* 
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         * /
        
        */
        for(int i=1; i<=ELEMS; i++){
            String string = String.valueOf(i);
            set.add(string);
        }
       
        /* 
         * 3) Prints its content
        */
        for(String s : set){
            IO.println("String:" + s);
        }
        
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            
            final String s = iterator.next();
            int n = Integer.parseInt(s);
            if(n%3 == 0){
                iterator.remove();
            }
        }
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        IO.println("point 5)");
        for(String s : set){
            IO.println(s);
        }

        /* 
         * 6) Verifies whether all the numbers left in the set are even
         */
        for(String s : set){
            int newInt = Integer.parseInt(s);

            if((newInt%2) != 0){
                IO.println("found something not even! :(");
                break;
            }
        }

        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         *
         * Africa -> 1,110,635,000
         *
         * Americas -> 972,005,000
         *
         * Antarctica -> 0
         *
         * Asia -> 4,298,723,000
         *
         * Europe -> 742,452,000
         *
         * Oceania -> 38,304,000
         */
        Map<String, Integer> continents = new HashMap<>();
        continents.put("Africa", 1110635000);
        continents.put("Americas", 927005000);

          /*
         * 8) Compute the population of the world
         */
        for(String s : continents.keySet()){
            IO.println("Key:"+s+"Value:"+continents.get(s));
        }

        

    }
}
        
      

