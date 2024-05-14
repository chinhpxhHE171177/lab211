
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Do Ngoc Hieu
 */
public class CheckInput {
    public static int getInt(String messInfo,
        String messErro,
        String invalid,
        int min, int max){
        
        do {            
            try {
                System.out.println(messInfo);
                Scanner sc=new Scanner(System.in);
                int number=Integer.parseInt(sc.nextLine());
                if(number>min && number<max){
                    return number;
            }
                System.out.println(messErro);
            } catch (NumberFormatException e) {
                System.out.println(invalid);
            }
        } while (true);
        
        
        
    }   
}
