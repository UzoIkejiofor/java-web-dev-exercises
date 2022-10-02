package exercises;

import java.util.Arrays;

public class ControlFlowCollectionsExc {
    public static void main (String[] args) {

        int  numbers []= {1, 1, 2, 3, 5, 8};
        // looping the array
        for ( int number: numbers )
            System.out.println(number);


        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

       String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
       String [] words = phrase.split(" ");
       System.out.println(Arrays.toString(words));

       String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
