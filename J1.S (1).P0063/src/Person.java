
/**
 *
 * @author Dell
 */
public class Person {
    private String Name;
    private String Address;
    private int salary;

    public Person() {
    }

    public Person(String Name, String Address, int salary) {
        this.Name = Name;
        this.Address = Address;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
  public int compareBySalary(Person a1){
      if (salary==a1.salary) 
          return 0;
      if (salary>a1.salary)  return 1;
      
       return -1; 
        
          
      
  }

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + ", Address=" + Address + ", salary=" + salary + '}';
    }
  
}
