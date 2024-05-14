
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager {

    private List<Storekeeper> list;

    public Manager() {
        list = new ArrayList<>();
    }

    public List<Storekeeper> getList() {
        return list;
    }

    public void setList(List<Storekeeper> list) {
        this.list = list;
    }
//////////////////////////////////////// Add ///////////////////////////////////////////
    // add 1 storekeeper

    public void addStore(String code, String name) throws Exception {
        boolean isduplicate = checkStokeeperDup(code);
        if (isduplicate) {
            throw new Exception("The Storekeeper is existed");
        } else {
            list.add(new Storekeeper(code, name));
            System.out.println("Add StoreKeeper successfully!!!");
        }
    }

    private boolean checkStokeeperDup(String code) {
        for (Storekeeper st : list) {
            if (st.getCode().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkProductExisted(String id) {
        for (Storekeeper storekeeper : list) {
            for (Products product : storekeeper.getP()) {
                if (product.getId().equalsIgnoreCase(id)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addProduct(String id, String name, String location, double price, String Expiry, String dateMan,
            String category, Storekeeper sk, String receiptDate) throws Exception {

        if (checkProductExisted(id)) {
            throw new Exception("Id is existed");
        } else {

            if (list.isEmpty()) {
                throw new Exception("List is empty");
            }
            sk.addProduct(new Products(id, name, location, price, Expiry, dateMan, category, sk, receiptDate));
            // người ql thêm sp vào danh sac sp mà họ ql
            System.out.println("Add product successfully!!!");
        }
    }
//////////////////////////////////// Update Product ////////////////////////////////////////

    public void updateProduct(String id) throws Exception {
        if (list.isEmpty()) {
            throw new Exception("No SoterKeeper");

        }
        if (!checkProductExisted(id)) {
            throw new Exception("Id is not existed");
        }
        // tìm sản phẩm có id cần update
        Products pro = new Products();
        for (Storekeeper storekeeper : list) {
            for (Products product : storekeeper.getP()) {
                if (product.getId().equalsIgnoreCase(id)) {
                    pro = product;
                }
            }
        }

        System.out.print("Enter the new name: ");
        String name = Check.checkString();
        System.out.print("Enter the new location: ");
        String location = Check.checkString();
        System.out.print("Enter the new price: ");
        double price = Check.checkDouble(0, Double.MAX_VALUE);
        System.out.print("Enter the new date of manufacture: ");
        String man = Check.checkDate();
        System.out.print("Enter the new Expiry date: ");
        String expiry = Check.checkDate2(man);
        System.out.print(" Enter the new category: ");
        String category = Check.checkString();
        // chọn Storrekeeper cho sản phẩm mới
        System.out.println("Enter new the choice the storekeeper: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "-" + list.get(i).getName());
        }
        System.out.print("Enter the choice: ");
        int choice = Check.checkInput(1, list.size());
        Storekeeper sk = list.get(choice - 1);

        System.out.print("Enter the new receiptDate: ");
        String receipt = Check.checkDate3(man, expiry);

        if (!sk.getCode().equalsIgnoreCase(pro.getSk().getCode())) { // nếu update store keeper thay đổi
            pro.getSk().remove(pro); // xóa sản phẩm trong storekeeper cũ
            sk.addProduct(new Products(id, name, location, price, expiry, man, category, sk, receipt));

        } else { // up date nếu storekeeper ko thay đổi
            pro.setName(name);
            pro.setLocation(location);
            pro.setPrice(price);
            pro.setDateMan(man);
            pro.setExpiry(expiry);
            pro.setCatagory(category);
            pro.setReceiptDate(receipt);
        }
    }
/////////////////////////////////// Search //////////////////////////////////////

    public void searchByName(String find) throws Exception {

        List<Products> listSearch = new ArrayList<>(); // tạo list các sản phẩm đc quản lý bởi tất cả các storekeeper
        if (list.isEmpty()) {
            throw new Exception("No sotreKeepper");

        }
        for (Storekeeper storekeeper : list) {
            for (Products product : storekeeper.getP()) {
                if (product.getName().equalsIgnoreCase(find)) {
                    listSearch.add(product);
                }
            }
        }
        if (listSearch.isEmpty()) {
            System.out.println("Not found!");
        } else {
            for (Products products : listSearch) {
                System.out.println("ID\tName\t\tLocation\tPrice\t\tExpiry date\tDate of manufacture\tCategory\tStorekeeper\tReceiptDate");
                products.display();
                System.out.println("");
            }
        }
    }

    public void searchByCategory(String find) throws Exception {

        List<Products> listSearch = new ArrayList<>();
        if (list.isEmpty()) {
            throw new Exception("No sotreKeepper");

        }
        for (Storekeeper storekeeper : list) {
            for (Products product : storekeeper.getP()) {
                if (product.getCatagory().equalsIgnoreCase(find)) {
                    listSearch.add(product);
                }
            }
        }
        if (listSearch.isEmpty()) {
            System.out.println("Not found!");
        } else {
            for (Products products : listSearch) {
                System.out.println("ID\tName\t\tLocation\tPrice\t\tExpiry date\tDate of manufacture\tCategory\tStorekeeper\tReceiptDate");
                products.display();
                System.out.println("");
            }
        }
    }

    public void searchBytoreKeeper(String find) throws Exception {

        List<Products> listSearch = new ArrayList<>();
        if (list.isEmpty()) {
            throw new Exception("No sotreKeepper");

        }
        for (Storekeeper storekeeper : list) {
            for (Products product : storekeeper.getP()) {
                if (product.getSk().getName().equalsIgnoreCase(find)) {
                    listSearch.add(product);
                }
            }
        }
        if (listSearch.isEmpty()) {
            System.out.println("Not found!");
        } else {
            for (Products products : listSearch) {
                products.display();
                System.out.println("");
            }
        }
    }

    public void searchProductByDate(String find) throws Exception {

        List<Products> listSearch = new ArrayList<>();
        if (list.isEmpty()) {
            throw new Exception("No have soterKeeper");

        }
        if (Check.checkDate4(find) == false) {
            throw new Exception("Error the Date");
        }

        String date = Check.checkDate5(find);
        for (Storekeeper storekeeper : list) {
            for (Products product : storekeeper.getP()) {
                if (product.getReceiptDate().equals(date)) {
                    listSearch.add(product);
                }
            }
        }

        if (listSearch.size() == 0) {
            System.out.println("Not found!");
        } else {
            for (Products products : listSearch) {
                System.out.println("ID\tName\t\tLocation\tPrice\t\tExpiry date\tDate of manufacture\tCategory\tStorekeeper\tReceiptDate");
                products.display();
                System.out.println("");
            }
        }

    }

//    public void checkList() throws Exception {
//        if (list.isEmpty()) {
//            throw new Exception("List is empty");
//
//        }
//
//    }
    // chọn cách search
    public void search() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("No have storekeepper");
        }
        System.out.println("=========Search===========");
        System.out.println("Menu Search:");
        System.out.println("1. Search by Name");
        System.out.println("2. Search by category");
        System.out.println("3. Search by storekeeper");
        System.out.println("4. Search by receipt date");
        System.out.println("Enter the choice: ");
        int choice3 = Check.checkInput(1, 4);
        switch (choice3) {
            case 1:
                System.out.println("Enter the name: ");
                String find = Check.checkString();
                searchByName(find);
                break;
            case 2:
                System.out.println("Enter the category: ");
                String find1 = Check.checkString();
                searchByCategory(find1);
                break;
            case 3:
                System.out.println("Enter the storekeeper: ");
                String find2 = Check.checkString();
                searchBytoreKeeper(find2);
                break;
            case 4:
                System.out.println("Enter the date");
                String dateReceipt = Check.checkString();
                searchProductByDate(dateReceipt);
                break;
        }
    }
////////////////////////////// Sort Product ////////////////////////////////////////

    public void sortProduct() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("No have storekeeper");

        }
        List<Products> list2 = new ArrayList<>();
        for (Storekeeper sk : list) {
            list2.addAll(sk.getP());
        }

        System.out.println("List before sort===============>: ");
        for (Products products : list2) {
            products.display();
            System.out.println("\n");
        }
        Collections.sort(list2, new Comparator<Products>() {
            @Override
            public int compare(Products o1, Products o2) {
                if (o1.getExpiry().equals(o2.getExpiry())) {
                    return o1.getDateMan().compareTo(o2.getDateMan());
                } else {
                    return o1.getExpiry().compareTo(o2.getExpiry());
                }
            }
        });
        System.out.println("List after sort=================>: ");
        for (Products products : list2) {
            products.display();
            System.out.println();
        }
    }

    public void displayAllProducts() {
        for (Storekeeper storekeeper : list) {
            for (Products pro : storekeeper.getP()) {
                System.out.println("ID\tName\t\tLocation\tPrice\t\tExpiry date\tDate of manufacture\tCategory\tStorekeeper\tReceiptDate");
                pro.display();
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
