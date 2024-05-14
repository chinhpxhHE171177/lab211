
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class J1SP0008 {

    private static final Scanner sc = new Scanner(System.in);
    
     public static void main(String[] args) {
        //declare HashMap for contain word and letter
        HashMap<String, Integer> word = new HashMap<>();
        HashMap<String, Integer> letter = new HashMap<>();

        System.out.println("Enter your content: ");
        String str = inpuString();

        countWord(word, str);
        countLetter(letter, word);

        display(word, letter);

    }
    // Check input a string 
     // remider user input a not empty
    private static String inpuString() {
        while (true) {  // vong lap vo han chi ket thuc return gap cau lenh
            String result = sc.nextLine().trim(); // trim() remove space dau va cuoi
            if (result.isEmpty()) {   // ktra chuoi dau vao co trong hay khong
                System.out.println("Do not empty!!!");
            } else {
                return result;
            }
        }
    }

    //Display function
    private static void display(HashMap<String, Integer> word, HashMap<String, Integer> letter) {
        System.out.println(word);
        System.out.println(letter);
    }
    
    // Count occurrences of each word in content Str and store the counts in the words HashMap
    private static void countWord(HashMap<String, Integer> word, String content) {
        String[] lw = content.trim().split("[^A-Za-z]"); //seperate by spaces, get the word list

        for (int i = 0; i < lw.length; i++) { // Loop for used index to access each word
            String w = lw[i].toLowerCase();
            if (w.isEmpty()) {
                continue;
            }
            if (!word.containsKey(w)) {
                //if the word dont exsit in hashMap, the add the key is the word and value is 1
                word.put(w, 1);
            } else {
                //if the word key had exsit in hashMap, update the value of the key <word> to this value + 1
                word.replace(w, word.get(w) + 1);
            }
        }
    }

    
    private static void countLetter(HashMap<String, Integer> letter, HashMap<String, Integer> word) {
        for (String w : word.keySet()) {    // get word list from wordHashMap
            for (String l : w.split("")) {  // seperate each word with "" regex
                if (!letter.containsKey(l)) {
                    //if the letter hashMap doesnot contain the letter key, put the key is this letter and the value is the numbers of the word
                    //for example: the HashMap word has the key-value <Hello-3>, then the letter 'h' will appear 3 times 
                    letter.put(l, word.get(w));
                } else {
                    //if the letter hashMap got the key, update the value by adding old value to the numbers of the word again
                    letter.replace(l, letter.get(l) + word.get(w));
                }
            }
        }
    }
}
