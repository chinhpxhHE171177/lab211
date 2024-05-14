
public class Main {

    public static void main(String[] args) throws Exception {
        try {
            System.out.print("Enter the number of List: ");
            int n = CheckInput.inputInt();

            Person[] person = new Person[n];

            System.out.println("=====Management Person programer=====");

            ManagementPerson m = new ManagementPerson();

            for (int i = 0; i < person.length; i++) {

                System.out.println("Input Information of Person");
                System.out.print("Please input name: ");
                String name = CheckInput.inputString();

                System.out.print("Please input address: ");
                String address = CheckInput.inputString();

                System.out.print("Please input salary: ");
                double salary = CheckInput.inputSalary();
                person[i] = m.inputPersonInfo(name, address, salary);
            }

            System.out.println("=======>>>List is unsorted: ");
            for (Person p : person) {
                p.display();
            }

            System.out.println("=======>>>List is sorted: ");
            for (Person p1 : m.sortBySalary(person)) {
                p1.display();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
