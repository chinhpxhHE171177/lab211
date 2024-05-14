
/**
 *
 * @author Dell
 */
public class Main {

    public static void main(String[] args) {
        Manager m = new Manager();
        while (true) {
            System.out.println("-----------------------Menu-----------------------");
            System.out.println("1.Add storekeeper");
            System.out.println("2.Add product");
            System.out.println("3.Update product");
            System.out.println("4.Search product by Name, Category, Storekeeper, ReceiptDate");
            System.out.println("5.Sort product by Expiry date, Date of manufacture");
            System.out.println("6.Exit");
            System.out.println("Enter the choice: ");
            int choice = Check.checkInput(1, 6);
            switch (choice) {
                case 1:
                    try {
                        System.out.println("-------- Add Storekeeper ---------");
                        System.out.print("Enter the Code: ");
                        String code = Check.checkString();

                        System.out.print("Enter the name: ");
                        String name = Check.checkString();

                        m.addStore(code, name);
//                    System.out.println("Successfully");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2:
                    try {
                        System.out.println("----------- Add product ------------");
                        System.out.print("Enter the ID: ");
                        String id = Check.checkString();
                        System.out.print("Enter the name: ");
                        String name = Check.checkString();
                        System.out.print("Enter the location: ");
                        String location = Check.checkString();
                        System.out.print("Enter the price: ");
                        double price = Check.checkDouble(0, Double.MAX_VALUE);
                        System.out.print("Enter the date of manufacture: ");
                        String man = Check.checkDate();
                        System.out.print("Enter the Expiry date: ");
                        String expiry = Check.checkDate2(man);
                        System.out.print("Enter the category: ");
                        String category = Check.checkString();
                        System.out.print("Enter the receiptDate: ");
                        String receipt = Check.checkDate3(man, expiry);
                        Storekeeper sk = null;

                        System.out.println("Enter the choice the storekeeper: ");
                        for (int i = 0; i < m.getList().size(); i++) {
                            System.out.println((i + 1) + " - " + m.getList().get(i).getName());
                        }
                        System.out.print("Enter the choice: ");
                        int choice2 = Check.checkInput(1, m.getList().size());
                        sk = m.getList().get(choice2 - 1);

                        m.addProduct(id, name, location, price, expiry, man, category, sk, receipt);
                        System.out.println("");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 3:
                    try {
                        System.out.print("Enter the ID: ");
                        String id = Check.checkString();
                        m.updateProduct(id);
                        m.displayAllProducts();

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {

                        m.search();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.println("-------------- Sort ------------------");
                        System.out.println("ID\tName\t\tLocation\tPrice\t\tExpiry date\tDate of manufacture\tCategory\tStorekeeper\tReceiptDate");
                        m.sortProduct();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Exist the program...");
                    return;
            }

        }
    }
}
