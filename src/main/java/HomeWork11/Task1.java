package HomeWork11;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        String[] words = {"alef", "bet", "gimel", "dalet", "bet", "bet", "alef", "sigma", "nona", "one", "alef", "bet", "gimel", "dalet", "bet", "bet", "alef", "sigma", "nona", "one", "zet"};
        countingWords(words);

    }

    private static void countingWords(String[] s){
        int count = 1;

        List<String> wordsList = new ArrayList<>(Arrays.asList(s));

        Collections.sort(wordsList);

        //System.out.println(wordsList);

       
        for (int i = 0; i < (wordsList.size() - 1); i++) {

            if (wordsList.get(i).equals(wordsList.get(i+1))){
                count++;
            } else {
                System.out.println(wordsList.get(i) + " " + count);
                count = 1;
            }
        }

        if (!wordsList.get(wordsList.size()-1).equals(wordsList.get(wordsList.size()-2))){
            System.out.println(wordsList.get(wordsList.size()-1) + " " + 1);
        }


    }


}



