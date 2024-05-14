
/**
 *
 * @author Dell
 */
public class Main {
     
    public static void main(String[] args) {
       Check ck= new Check();
        Manager m=new Manager();
        while(true){
            System.out.println("=====Management Person programer=====");
            System.out.println("1.Add person.");
            System.out.println("2.Display.");
            System.out.println("3.Sort");
            System.out.println("4.exit");
            System.out.println("Enter the choice");
            int choice= ck.checkIntMenu(1, 4);
             switch(choice){
                 case 1: 
                     
                     try{
                       m.add();
                     }catch(Exception e){
                         System.out.println(e.getMessage());
                     }
                     break;
                 case 2:
                     try{
                         m.printArray();
                     }catch(Exception e){
                         System.out.println(e.getMessage());
                     }
                     break;
                 case 3:
                     try{
                         m.sortArray();
                     }catch(Exception e){
                         System.out.println(e.getMessage());
                     }
                     break;
                 case 4: 
                     System.out.println("Exit.");
                     return;
             }
        }
    }
    
}
