class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
}

public class L33 {
    public static void main(String[] args) {
        Employee rachait = new Employee();
        rachait.id = 22;
        rachait.name = "Rachait";
        rachait.printDetails();
        System.out.println(rachait.id);
        System.out.println(rachait.name);
        System.out.println("Try programiz.pro");
    }
}