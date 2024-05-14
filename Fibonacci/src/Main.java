/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// ĐỆ quy là quá trình trong đó 1 phương thức gọi lại chính nó 1 cách liên tiếp
/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        // find the fibo equal using recusrion
        int[] arr = Fibo.findFibo(45);
        // print out the fibo sequence
        Fibo.display(arr);
//        try {
//            System.out.println("Enter n: ");
//            int n = Fibo.checkInt();
////            int [] arr = Fibo.findFibo(n);
////            Fibo.display(arr);
//            int result = Fibo.fibo3(n);
//            System.out.println(result);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }
}
