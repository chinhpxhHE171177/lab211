
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FindWordInFile {

    public static void writeToFile() {
        try {
            FileWriter fw = new FileWriter("myfile.txt"); // tao ra mot filr moi co gtri chuyen vao la doi tg file
            BufferedWriter bw = new BufferedWriter(fw); // ghi du lieu vao file
            String arr[] = {"Think", "Minor", "Designing", "..."};
            for (String s : arr) {
                bw.write(s); // ghi mang chuoi s nay vao file txt
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. USer input directory of file 
        System.out.print("Please enter directory of file: ");
        String pathFile = sc.nextLine();

        //2. User input string to search 
        System.out.print("Please enter string to search: ");
        String searchFile = sc.nextLine();

        //3. Find string or letter words that contain the input string
        System.out.print("Search results: ");
        try {
            FileReader fr = new FileReader("myfile.txt"); // Open file thể hiện file đã cjo ở chế độ doc
            BufferedReader br = new BufferedReader(fr);
            String line = ""; // de doc so dong
            while (true) {
                line = br.readLine();//
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }

        } catch (IOException ex) { // neu tap tin kho ton tai nem ra ngoai le
        }
    }
}
