import java.lang.String;
import java.util.Scanner;

class Person{
    private String name;
    private int age;
    private String address;

    public void setAge(int age) {
        if(age<=0){
            System.out.println("Invalid Age");
        }
        else{
            this.age = age;
        }
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public int getAge() {

        return age;
    }

    public String getName() {

        return name;
    }

    public String getAddress() {

        return address;
    }
}

public class Encapsulation{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.next();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Address: ");
        String address = scanner.next();

        Person person1 = new Person();
        person1.setName(name);
        person1.setAge(age);
        person1.setAddress(address);
        System.out.println();
        System.out.println("Details of a Person : ");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Address: " + person1.getAddress());
    }

}
