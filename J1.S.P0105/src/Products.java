
import java.util.Date;


/**
 *
 * @author Dell
 */
public class Products {
    private  String id;
    private String name;
    private  String location;
    private double price;
    private  String Expiry;
    private String dateMan;
    private String catagory;
    private Storekeeper sk;
    private  String receiptDate;

    public Products() {
    }

    
    public Products(String id, String name, String location, double price, String Expiry, String dateMan, String catagory, Storekeeper sk, String receiptDate) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.price = price;
        this.Expiry = Expiry;
        this.dateMan = dateMan;
        this.catagory = catagory;
        this.sk = sk;
        this.receiptDate = receiptDate;
    }

  
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public Storekeeper getSk() {
        return sk;
    }

    public void setSk(Storekeeper sk) {
        this.sk = sk;
    }

    public String getExpiry() {
        return Expiry;
    }

    public void setExpiry(String Expiry) {
        this.Expiry = Expiry;
    }

    public String getDateMan() {
        return dateMan;
    }

    public void setDateMan(String dateMan) {
        this.dateMan = dateMan;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }
    
    public void display(){
        System.out.printf("%-8s%-16s%-16s%-16s%-16s%-24s%-16s%-16s%-15s",  id,  name,  location, price,  Expiry, dateMan, catagory,  sk.getName(), receiptDate);
    }
}
