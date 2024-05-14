
import java.util.Scanner;

public class ManagementPerson {

    public ManagementPerson() {
    }

    public Person inputPersonInfo(String name, String address, double salary) throws Exception {

        return new Person(name, address, salary);
    }

    public void displayPersonInfo(Person person) {
        person.display();
    }

    public Person[] sortBySalary(Person[] persons) throws Exception {
        if (persons == null || persons.length == 0) {
            throw new Exception("List is empty");
        }

        for (int i = 0; i < persons.length - 1; i++) { // vong lap duyet tu dau den cuoi mang
            for (int j = 0; j < persons.length - 1 - i; j++) {

                if (persons[j].comparePerson(persons[j + 1]) < 0) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;

                }
            }
        }

        return persons;
    }

}
