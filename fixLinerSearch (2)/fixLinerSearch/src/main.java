/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Do Ngoc Hieu
 */
public class main {
    public static void main(String[] args) {
        int size=CheckInput.getInt("Enter the number of array","number trong khaong","not valid",0,Integer.MAX_VALUE);
        
        // khoi tao mang va truyn vao size
        int[]MyArray=array.inputArray(size);
        System.out.println("array:");
        array.printArray(MyArray);
        int search=CheckInput.getInt("Enter key search"," num ber>0","not valid",0,Integer.MAX_VALUE);
        array.linearSearch(MyArray,search);
        
                
        
        
        
        
    }
}
