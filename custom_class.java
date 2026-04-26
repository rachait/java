class Employee{
    private int id;
    private String name;
    public void getName(){
        System.out.println(name);
    }
    public void setName(String n){
        name=n;
    }
    public int setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}

public class custom_class{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 101;
        emp1.name = "Rachait";

    }
}