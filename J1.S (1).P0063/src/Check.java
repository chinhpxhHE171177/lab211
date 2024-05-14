
import java.util.Scanner;


/**
 *
 * @author Dell
 */
public class Check {
    final Scanner sc= new Scanner(System.in);
    public Check() {
    }
    
    public int checkInt(){
        
    
        while(true){
            try{
            int n= Integer.parseInt(sc.nextLine());
            if (n<0)  throw new NumberFormatException();
            
            return n;
        
        }catch(NumberFormatException e){
                System.out.print("Wrong format. Please input again: ");
          }
    }
}
    public String checkString(){
        
    
        while(true){
            try{
            String n=sc.nextLine();
            if (n.isEmpty())  throw new NumberFormatException();
            
            return n;
        
        }catch(NumberFormatException e){
                System.out.print("Wrong format. Please input again: ");
          }
    }
}
      
    public int checkIntMenu(int min, int max){
        
    
        while(true){
            try{
            int n= Integer.parseInt(sc.nextLine());
            if (n<min||n>max)  throw new NumberFormatException();
            
            return n;
        
        }catch(NumberFormatException e){
                System.out.print("Wrong format. Please input again: ");
          }
    }
}
    
}