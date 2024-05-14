
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Storekeeper {

    private String code;
    private String name;
    private List<Products> p; 

    public Storekeeper() {
        p = new ArrayList<>();
    }

    public Storekeeper(String code, String name) {
        this.code = code;
        this.name = name;
        p = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Products pro) {
        pro.setSk(this);

        p.add(pro);
       
    }

    public void remove(Products pro) {
       
        p.remove(pro);
        pro.setSk(null); // khi remove cái sản phảm 
    }

    public List<Products> getP() {
        return p;
    }

    public void setP(List<Products> p) {
        this.p = p;
    }
}
