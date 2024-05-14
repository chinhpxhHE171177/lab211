
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
public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("======== Caculator Matrix ========");
            System.out.println("1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");
            System.out.print("Select an option: ");
            int option = CheckInput.checkChoice(1, 4);

            switch (option) {
                case 1:

                    try {
                        System.out.println("---------- Addition ----------");
                        System.out.println("Enter the first matrix");
                        System.out.print("Number of rows: ");
                        int row1 = CheckInput.checkInt();
                        System.out.print("Number of colums: ");
                        int col1 = CheckInput.checkInt();
                        Matrix mt1 = new Matrix(row1, col1);
                        mt1.inputMatrix();

                        System.out.println("Enter the second matrix");
                        System.out.print("Number of rows: ");
                        int row2 = CheckInput.checkInt();
                        System.out.print("Number of colums: ");
                        int col2 = CheckInput.checkInt();
                        Matrix mt2 = new Matrix(row2, col2);
                        mt2.inputMatrix();

                        Matrix result = mt1.addtionMatrix(mt2);
                        System.out.println("------------ Result ---------------");
                        mt1.printMatrix();
                        System.out.println("+");
                        mt2.printMatrix();
                        System.out.println("=");
                        result.printMatrix();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:

                    try {
                        System.out.println("---------- Subtraction ----------");
                        System.out.println("Enter the first matrix");
                        System.out.print("Number of rows: ");
                        int row1 = CheckInput.checkInt();
                        System.out.print("Number of colums: ");
                        int col1 = CheckInput.checkInt();
                        Matrix mt1 = new Matrix(row1, col1);
                        mt1.inputMatrix();

                        System.out.println("Enter the second matrix");
                        System.out.print("Number of rows: ");
                        int row2 = CheckInput.checkInt();
                        System.out.print("Number of colums: ");
                        int col2 = CheckInput.checkInt();
                        Matrix mt2 = new Matrix(row2, col2);
                        mt2.inputMatrix();

                        Matrix result = mt1.subtractionMatrix(mt2);
                        System.out.println("------------ Result ---------------");
                        mt1.printMatrix();
                        System.out.println("-");
                        mt2.printMatrix();
                        System.out.println("=");
                        result.printMatrix();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:

                    try {
                        System.out.println("---------- Multiplication ----------");
                        System.out.println("Enter the first matrix");
                        System.out.print("Number of rows: ");
                        int row1 = CheckInput.checkInt();
                        System.out.print("Number of colums: ");
                        int col1 = CheckInput.checkInt();
                        Matrix mt1 = new Matrix(row1, col1);
                        mt1.inputMatrix();

                        System.out.println("Enter the second matrix");
                        System.out.print("Number of rows: ");
                        int row2 = CheckInput.checkInt();
                        System.out.print("Number of colums: ");
                        int col2 = CheckInput.checkInt();
                        Matrix mt2 = new Matrix(row2, col2);
                        mt2.inputMatrix();

                        Matrix result = mt1.multiplicationMatrix(mt2);
                        System.out.println("------------ Result ---------------");
                        mt1.printMatrix();
                        System.out.println("*");
                        mt2.printMatrix();
                        System.out.println("=");
                        result.printMatrix();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Exist the program....");
                    return;
            }
        }
    }

}
