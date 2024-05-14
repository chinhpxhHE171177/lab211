
import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Do Ngoc Hieu
 */
public class array {
    // tao 1 mang va dien các giá trị random cho mảng \
    public static int[] inputArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size) ;
            
            
        }

        return array;
    }
    
    // in ra màn hình array
    public static void printArray(int[] arr ){
        System.out.println(Arrays.toString(arr));
    }
    
    // liner search in ra tat ca cac vi tri index co gia tri bang value can tim
    
    

    public static void linearSearch(int a[], int value){
        int k =-1;
        int index;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==value) {
                System.out.print(i+" ");
                     k=1;
            }
        }
        if(k==-1) {
            System.out.println(" Not found");
        }
    }
    


    
    
    
 
    
}
    

    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
        
        
        
        
