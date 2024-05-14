
import java.util.Arrays;
import java.util.Scanner;

public class ManageEastAsiaCountry {

    EastAsiaCountry[] countries;
    int count;
    Scanner sc = new Scanner(System.in);

    public ManageEastAsiaCountry() {
        countries = new EastAsiaCountry[11];
        count = 0;
    }

    //Check duplicate country
    public boolean checkCountry(EastAsiaCountry eac) {
        for (int i = 0; i < count; i++) {
            if (countries[i].code.equalsIgnoreCase(eac.code)) {
                return true;
            }
        }
        return false;
    }

    // add country
    public void addCountry() {
        System.out.println("Enter countryCode: ");
        String code = CheckFunction.checkString();
        System.out.println("Enter countryName: ");
        String name = CheckFunction.checkString();
        System.out.println("Enter total Area: ");
        float total = CheckFunction.CheckFloat();
        System.out.println("Enter terrain of Country: ");
        String terrian = CheckFunction.checkString();

        Country c = new Country();
        EastAsiaCountry eac = new EastAsiaCountry(terrian, name, code, total); // tao doi tg moi 
        // ktra su trung lap cua dtg eac
        try {
            if (checkCountry(eac)) {
                throw new Exception();
            }
            if (count < 11) {
                countries[count] = eac; // gan dtg eac vao vi tri count cua mang
                count++;
                System.out.println("Successfully added.");
            } else {
                throw new Exception("Can't add more countries.");
            }
        } catch (Exception e) {
            System.out.println("Country already exists.");
        }
    }
    //print country

    public void printCountry() {
        try {
            if (count == 0) {
                throw new Exception();
            }
            for (int i = 0; i < count; i++) {
                countries[i].display();
            }
        } catch (Exception e) {
            System.out.println("No information to print.");
        }
    }

    //Find the country by name
//    public EastAsiaCountry[] searchCountry(String name) throws Exception {
//        if (count == 0) {
//            throw new Exception("No information to print.");
//        }
//        EastAsiaCountry[] eacs = new EastAsiaCountry[count]; // tao mang eac size = count
//        int result = 0; 
//        for (int i = 0; i < count; i++) {
//            if (countries[i].name.equalsIgnoreCase(name)) {  // check name index i have same(unless upper, lower)
//                eacs[result] = countries[i];  
//                result++; 
//            }
//        }
//        return Arrays.copyOf(eacs, result);
//    }
// Tìm quốc gia theo tên hoặc kystuwj 
    public EastAsiaCountry[] searchCountry(String keyword) throws Exception {
        if (count == 0) {
            throw new Exception("Không có thông tin để hiển thị.");
        }
        EastAsiaCountry[] eacs = new EastAsiaCountry[count];
        int result = 0;
        for (int i = 0; i < count; i++) {
            String countryName = countries[i].getName().toLowerCase(); // Chuyển đổi tên quốc gia sang chữ thường để so sánh
            if (countryName.contains(keyword.toLowerCase())) { // Kiểm tra nếu từ khóa xuất hiện trong tên quốc gia
                eacs[result] = countries[i];
                result++;
            }
        }
        return Arrays.copyOf(eacs, result);
    }

    //Sort country asc
    public EastAsiaCountry[] sortCountry() throws Exception {
        if (count == 0) {
            throw new Exception("No information available.");
        }
        bubbleSort();
        return Arrays.copyOf(countries, count);
    }

    // ham bubble sort 
    public void bubbleSort() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (countries[j].name.compareToIgnoreCase(countries[j + 1].name) > 0) {
                    EastAsiaCountry temp = countries[j];
                    countries[j] = countries[j + 1];
                    countries[j + 1] = temp;
                }
            }
        }
    }
//    // Insertion sort 
//    public EastAsiaCountry[] sortCountry() throws Exception {
//        if (count == 0) {
//            throw new Exception("No information available.");
//        }
//
//        EastAsiaCountry[] sortedCountries = Arrays.copyOf(countries, count);
//
//        for (int i = 1; i < count; i++) {
//            EastAsiaCountry currentCountry = sortedCountries[i];
//            int j = i - 1; // gán gtr để trỏ đến ptu trc curentC
//
//            while (j >= 0 && sortedCountries[j].name.compareToIgnoreCase(currentCountry.name) > 0) {
//                sortedCountries[j + 1] = sortedCountries[j];
//                j--; // giảm gtr của j đi 1 và return gtr cũ của j trc khi giảm
//            }
//
//            sortedCountries[j + 1] = currentCountry;
//        }
//
//        return sortedCountries;
//    }
}
