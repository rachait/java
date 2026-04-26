// class Student{
//         Student(){
//             System.out.println("simple");
//         }
//     }
// public class constructors2 {
//     public static void main(String[] args) {
//         Student hello = new Student();
//     }

       
// }

class Student{
    String name;
    int id;
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}
public class constructors2 {
    public static void main(String[] args) {
        Student s1 = new Student("Rachait", 101);
        s1.display();
    }
}