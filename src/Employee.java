class Employ{
    public String getRole(){
        return "Employee";
    }
}

class Manager extends Employ{
    public String getRole(){
        return "Manager";
    }
}

class Developer extends Employ{
    public String getRole(){
        return "Developer";
    }
}

public class Employee {
    public static void main(String[] args){
        Employ emp1 = new Manager();
        System.out.println("Role : "+emp1.getRole());

        Employ emp2 = new Developer();
        System.out.println("Role : "+emp2.getRole());

    }
}
