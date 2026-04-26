class Employee{
    int id;
    String name;

    Employee(int i, String name){
        id = i;
        this.name = name;
    }
    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }
}

public class constructors {
    public static void main(String[] args) {
       Employee s1 = new Employee(101, "Rachait"); 
       s1.display();
    }
}
