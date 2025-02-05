public class studentclass {

    private String name;
    private int age;

    
    public studentclass() {
        this("John Doe", 18); 
    }

    
    public studentclass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        
        studentclass student1 = new studentclass();
        
        
        studentclass student2 = new studentclass("Alice", 20);

        
        student1.display();
        student2.display();
    }
    
}
