package he171217_j1.s.p0052;


import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ManageEastAsiaCountries {

    List<EastAsiaCountries> country;
    Scanner sc = new Scanner(System.in);

    public ManageEastAsiaCountries() {
        country = new ArrayList<>();
    }
// check user enter input correctly
    public int checkInputMenu(int min, int max) {

       while(true)
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format input");
                System.out.println("Please input again");
            }
        } 

    
    // check user input correctly float number
    public float checkFloat(){
       do {
            try {
                float n = Integer.parseInt(sc.nextLine());
                if (n<0) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format input");
                System.out.println("Please input again");
            }
        } while (true);
}
    // check user input string not empty
    public String checkString(){
          do {
            try {
                String s= sc.nextLine();
                if (s.isEmpty()) {
                    throw new NumberFormatException();
                }
                return s;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format input");
                System.out.println("Please input again");
            }
        } while (true);
    }
    // create menu
    public int Menu() {
        System.out.println("---------------------------Menu------------------------");
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending order");
        System.out.println("5.Exit");
        
        System.out.println("Enter the choice:");
        int choice =checkInputMenu(1,5);
        return choice;
    }
    
    // check exited EastAsiaCountries 
    public boolean checkCountry(EastAsiaCountries ct2){
        for (EastAsiaCountries ct: country) {
            if (ct.countryCode.equalsIgnoreCase(ct2.countryCode)) {
                return true;
            }
        }
        return false;
        
    }
    // add country
    public void addCountryInformation() throws Exception{
        System.out.println("Enter coutryCode: ");
        String code =checkString();
        System.out.println("Enter countryName: ");
        String name =checkString();
        System.out.println("Enter total area: ");
        float total =checkFloat();
        System.out.println("Enter countryTerrain: ");
        String terrain=checkString();
        
        EastAsiaCountries ct2= new EastAsiaCountries(code, name, total, terrain);
        try{
            if (checkCountry(ct2)) {
                throw new Exception();
            }
            country.add(ct2);
            System.out.println("Successfull");
        }catch(Exception e){
            System.out.println("Country existed.");
        }
        
        
    }
    // print country
    public void printCountry(){
        try{
            if (country.isEmpty()) {
                throw new Exception();
            }
            
           for (EastAsiaCountries ct: country) {
               ct.display();
        }  
        }catch(Exception e){
            System.out.println("Not information to print");
        }
       
    }

        public EastAsiaCountries[] searchInformationByName(String name) throws Exception{
            if (country.isEmpty()) {
                throw new Exception("not exits");
            }
            int count =0;
            
            EastAsiaCountries[]  re= new EastAsiaCountries [country.size()];
            
            for (EastAsiaCountries ct: country) {
                if (ct.countryName.equalsIgnoreCase(name)) {
                    re[count]=ct;
                    count++;
                    
                }
            }
              
                
               EastAsiaCountries[]  re2= new EastAsiaCountries [count];
                for (int i = 0; i < count; i++) {
                    re2[i]=re[i];
                }
            
            
            
                     
            return re2;
        }
        
//        public  void bubbleSort() {
//        
//        for (int i = 0; i <country.size(); i++) {
//            for (int j = 0; j < country.size()- 1-i; j++) {
//                 
//                if (country.get(j).countryName.compareToIgnoreCase(country.get(j+1).countryName)==-1) {
//                 EastAsiaCountries temp ;                
//                  temp=country.get(j);                 
//                  country.get(j) = country.get(j+1);
//                  country.get(j+1) = temp;
//            }
//        }
//        }
//}
        public void bubbleSort() {
    for (int i = 0; i < country.size(); i++) {
        for (int j = 0; j < country.size() - 1 - i; j++) {
            if (country.get(j).getCountryName().compareToIgnoreCase(country.get(j + 1).getCountryName()) > 0) {
                EastAsiaCountries temp = country.get(j);
                country.set(j, country.get(j + 1));
                country.set(j + 1, temp);
            }
        }
    }
}
        
         public EastAsiaCountries[]sortInformationByAscendingOrder() throws Exception{
             if (country.isEmpty()) {
                 throw new Exception("Not information");
             }
             
//             Collections.sort(country);
//             EastAsiaCountries[] resultArray = new EastAsiaCountries[country.size()];
//        return country.toArray(resultArray);
//         }
        bubbleSort();
         EastAsiaCountries[] resultArray = new EastAsiaCountries[country.size()];
        return country.toArray(resultArray);
    
}
}