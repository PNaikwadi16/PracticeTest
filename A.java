class Person {
     String name; 
     int age; 

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print out name and age
    public void speak() {
        System.out.println("My name is " + name + " and I'm " + age + " years old.");
    }
}

// Define a Student class that inherits from Person
 class Student extends Person {
    private int grade; 

    // Constructor to initialize name, age, and grade
    public Student(String name, int age, int grade) {
        super(name, age); 
        this.grade = grade; 
    }

    // Method to print out that the student is studying
    public void study() {
        System.out.println(name + " is studying for grade " + grade + ".");
    }
}


public class A {
    public static void main(String[] args) {
        // Create a Student object with name "John", age 18, and grade 12
        Student student = new Student("John", 18, 12);
      
        student.speak();
        
        
        student.study();
    }
}
