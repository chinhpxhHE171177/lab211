
import java.util.Scanner;

/*
 * Tính đa hình cho phép chúng ta xử lý các đối tượng của các lớp con như là các đối tượng của lớp cha chung, 
  điều này giúp tăng tính linh hoạt và tiện lợi trong quá trình lập trình.
 */
/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Shape: ");
        int n = CheckInput.checkInt();
        Shape[] listShapes = new Shape[n];
        System.out.println("===== Caculator Shape Program =====");
        for (int i = 0; i < n; i++) {
            System.out.println("Select shape type: ");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            int shapeType = CheckInput.checkInt();

            switch (shapeType) {
                case 1:
                    System.out.println("------Rectangle------");
                    System.out.println("Please input side width of Rectangle: ");
                    int width = CheckInput.checkInt();
                    System.out.println("Please input side length of Rectangle: ");
                    int length = CheckInput.checkInt();
                    listShapes[i] = new Rectangle(length, width);;
                    break;
                case 2:
                    System.out.println("------Circle------");
                    System.out.println("Please input radius of Circle: ");
                    double radius = CheckInput.checkDouble();
                    listShapes[i] =  new Circle(radius);

                    break;
                case 3:
                    System.out.println("-------Triangle------");
                    System.out.println("Please input side A of Triangle: ");
                    int A = CheckInput.checkInt();
                    System.out.println("Please input side B of Triangle: ");
                    int B = CheckInput.checkInt();
                    System.out.println("Please input side C of Triangle: ");
                    int C = CheckInput.checkInt();
                    listShapes[i] = new Triangle(A, B, C);
                    break;
                default:
                    System.out.println("Invalid shape type. Skipping...");
                    break;
            }
        }
        // Tinh da hinh: tren cac doi tuong lop con khac nhau, nhung kq dk hien thi tuong ung voi tung loai hinh
        
        //Display results
        System.out.println("Display: ");
        for (Shape ls : listShapes) {
            ls.printResult();
        }
    }
}
