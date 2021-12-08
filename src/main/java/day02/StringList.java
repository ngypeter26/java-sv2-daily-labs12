package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringList {

//    public List<String> shortestWords(List<String> words){
//        int shortestLength = Integer.MAX_VALUE;
//        List<String> output = new ArrayList<>();
//
//        for (String s : words){
//            if (s.length() < shortestLength){
//                shortestLength = s.length();
//            }
//        }
//
//        for (String s : words){
//            if (s.length() == shortestLength){
//                output.add(s);
//            }
//        }
//        return output;
//    }

    public List<String> shortestWords(List<String> words){
        int shortestLength = Integer.MAX_VALUE;
        List<String> output = new ArrayList<>();

        for (String s : words){
            if (s.length() < shortestLength){
                shortestLength = s.length();
                output.clear();
                output.add(s);
            }else if (s.length() == shortestLength) {
                output.add(s);
            }
            }
        return output;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("aaa", "aa", "bb", "cccc", "dd");

        List<String> output = new StringList().shortestWords(input);

        System.out.println(output);
    }
}
