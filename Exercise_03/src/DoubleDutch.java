/*
Exercise 3 : DoubleDutch

Simple Java program to practice string manipulation

Copyright (C) RedFantom 2017
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class DoubleDutch {
    private static String read_string(){
        System.out.printf("Please enter a string: ");
        return (new Scanner(System.in)).nextLine();
    }

    private static String replace_characters(String to_process, ArrayList<Character> to_replace, char target) {
        for (Character current: to_replace) {
            to_process = to_process.replace(current, target);
        }
        return to_process;
    }

    private static boolean is_vowel(char letter) {
        return (letter == 'a' || letter == 'i' || letter == 'u' || letter == 'o' || letter == 'e' ||
                letter == 'A' || letter == 'I' || letter == 'U' || letter == 'O' || letter == 'E');
    }

    private static String insert_before_consonants(String to_process, String to_insert) {
        String[] elements = to_process.split("\\s+");
        int length = elements.length;
        int item = 0;
        StringBuilder builder = new StringBuilder("");
        for (String current : elements) {
            if (is_vowel(current.charAt(0))) {
                builder.append(current);
            } else {
                builder.append(to_insert);
                builder.append(current);
            }
            item += 1;
            if (item == length) break;
            builder.append(" ");
        }
        return builder.toString();
    }

    private static void print_translation(String translation) {
        System.out.printf("Double Dutch translation: %s\n", translation);
    }

    private static String reorder_string(String to_process) {
        String[] elements = to_process.split("\\s+");
        StringBuilder builder = new StringBuilder("");
        if (!(elements.length > 2)) return to_process;
        for (int i = 2; i < elements.length; i++) {
            builder.append(elements[i]);
            builder.append(" ");
        }
        builder.append(elements[0]);
        builder.append(" ");
        builder.append(elements[1]);
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.printf("** Welcome to the Double Dutch game **\n");
        String to_process = read_string();
        ArrayList<Character> to_replace = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        to_process = replace_characters(to_process, to_replace, 'a');
        System.out.printf("Step 1: %s\n", to_process);
        to_process = insert_before_consonants(to_process, "ay");
        System.out.printf("Step 2: %s\n", to_process);
        to_process = reorder_string(to_process);
        print_translation(to_process);
    }
}
