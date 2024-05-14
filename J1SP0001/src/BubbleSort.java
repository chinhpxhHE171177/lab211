
import java.util.Random;
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
public class BubbleSort {

    public int[] random(int size) {
        Random rd = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rd.nextInt(size);
        }
        // check duplicate
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = rd.nextInt(size);
                    j = -1;
                }
            }

        }
        return arr;
    }

    public void display(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }

    public int[] sortArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap elements  
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public int getInteger(String message, String error, int min, int max) {
        Scanner sc = new Scanner(System.in);

        //-Yêu cầu người dùng nhập vào 1 số nguyên
        while (true) {   // vong lap vo han ket thuc cho den khi break or return gtri         
            try {
                //System.out.print("Enter a integer: ");
                System.out.print(message);
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    System.out.println("Don't is empty!");
                } else {
                    int number = Integer.parseInt(input);
                    // check number in range 
                    if (number >= min && number <= max) {
                        //System.out.println("The value input: " + number);
                        //break;
                        return number;
                    } else {
                        System.out.println("You must input in range " + min + "-" + max);
                    }
                }
            } catch (Exception e) {
                //System.out.println("You inputed wrong!");
                System.out.println(error);
            }
        }
    }
}
