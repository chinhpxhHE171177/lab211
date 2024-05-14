package he171217_j1.s.p0052;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Program {
    public static void main(String[] args) throws Exception {
        ManageEastAsiaCountries m = new ManageEastAsiaCountries ();
        Scanner sc = new Scanner(System.in);
        while(true){
          int choice=  m.Menu();
            
            switch(choice){
                case 1:
                    m.addCountryInformation();
                    break;
                case 2:
                    m.printCountry();
                    break;
                case 3:
                    try{
                        System.out.println("Enter name: ");
                        String name =m.checkString();
                        EastAsiaCountries [] result =m.searchInformationByName(name);
                        for (EastAsiaCountries ct: result) {
                            ct.display();
                        }
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try{
                        EastAsiaCountries[ ] sortedCountries =m.sortInformationByAscendingOrder();
                        System.out.println("Sorted List Countries");
                        for (EastAsiaCountries ct: sortedCountries) {
                            ct.display();
                        }
                        
                    }catch(Exception e){
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
