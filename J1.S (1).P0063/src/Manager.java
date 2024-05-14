
import java.util.Arrays;


/**
 *
 * @author Dell
 */
public class Manager {
    Check ck= new Check();
    
    Person [] p;

    public Manager() {
        p= new Person [0 ];
    }
    
    public void add() throws Exception{
        
        System.out.print("Please input name:");
        String name =ck.checkString();
        if (checkDul(name)) {
            throw new Exception("the name is exsited");
        }
        System.out.print("Please input address:");
        String add = ck.checkString();
        System.out.print("Please input salary: ");
        int salary=ck.checkInt();
        Person p1= new Person( name,  add,  salary);
        
        p= Arrays.copyOf(p,p.length+1);
        p[p.length-1]=p1;
        System.out.println("Successfully");
    }
    
   public void sortArray() throws Exception{
       if (p.length==0) {
           throw new Exception("array is empty");
           
       }
       
       for (int i = 0; i < p.length-1; i++) {
           for (int j = 0; j < p.length-1-i; j++) {
               if (p[j].compareBySalary(p[j+1])==1 ) {
                  Person temp= p[j];
                  p[j]=p[j+1];
                  p[j+1]=temp;
               }
           }
       }
   }
    
   public void printArray() throws Exception{
       if (p.length==0) {
           throw new Exception("List is empty");
       }
       for (int i = 0; i < p.length; i++) {
           System.out.println(p[i].toString());
       }
   }
    public boolean checkDul(String name){
        for (Person p1:p) {
            if (p1.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}
