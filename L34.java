class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {  // return type should be String
        return name;
    }

    public void setName(String n) {  // setters are usually void
        name = n;
    }
}

public class L34 {
    public static void main(String[] args) {
        Employee rachait = new Employee();
        rachait.setName("Rachait");
        System.out.println(rachait.getName());  // prints "Rachait"
    }
}
