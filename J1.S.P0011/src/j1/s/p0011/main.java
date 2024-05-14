/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        //loop until user want to exit
        checkInput ck = new checkInput();
        while (true) {
            int choice = ChangeBase.menu();
            switch (choice) {
                case 1:
                    String binary = ck.checkInputBinary();
                    ChangeBase.convertFromBinary(binary);
                    break;
                case 2:
                    String decimal = ck.checkInputDecimal();
                    ChangeBase.convertFromDecimal(decimal);
                    break;
                case 3:
                    String hexa = ck.checkInputHexadecimal();
                    ChangeBase.convertFromHexa(hexa);
                    break;
                case 4:
                    return;
            }
        }
    }
}
