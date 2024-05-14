

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

    public static void main(String[] args) throws Exception {

        ManageEastAsiaCountry meac = new ManageEastAsiaCountry();
        while (true) {
            System.out.println("                               MENU\n"
                    + "==========================================================================\n"
                    + "1. Input the information of 11 countries in East Asia\n"
                    + "2. Display the information of country you've just input\n"
                    + "3. Search the information of country by user-entered name\n"
                    + "4. Display the information of countries sorted name in ascending order  \n"
                    + "5. Exit \n"
                    + "==========================================================================");
            System.out.println("Enter your choice: ");
            int choice = CheckFunction.checkInt();

            switch (choice) {
                case 1:
                    meac.addCountry();
                    break;
                case 2:
                    meac.printCountry();
                    break;
                case 3:
                    try {
                        System.out.println("Enter name: ");
                        String name = CheckFunction.checkString();
                        EastAsiaCountry[] result = meac.searchCountry(name);
                        for (EastAsiaCountry eac : result) {
                            eac.display();
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        EastAsiaCountry[] sCountrys = meac.sortCountry();
                        System.out.println("Sorted List Countries");
                        for (EastAsiaCountry eac : sCountrys) {
                            eac.display();
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Exit program");
                    return;
            }
        }
    }
}
