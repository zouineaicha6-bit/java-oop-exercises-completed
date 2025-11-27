public class M {
    public static void main(String[] args) {

        // -------------------------------------------------------
        // 1. Create three Book objects with different values.
        //    Call discount(10%) for each and print the discounted price.
        // -------------------------------------------------------

        // TODO: Book b1 = ...
        Book b1 = new Book("Harry Potter", "JK Rowling", 20.0);
        // TODO: Book b2 = ...
        Book b2 = new Book("The Hobbit", "JRR Tolkien", 15.0);
        // TODO: Book b3 = ...
        Book b3 = new Book("1984", "George Orwell", 12.0);
        // TODO: Call printInfo() and discounted price
        b1.printInfo();
        System.out.println("Discounted price: $" + b1.discount(10));
        b2.printInfo();
        System.out.println("Discounted price: $" + b2.discount(10));
        b3.printInfo();
        System.out.println("Discounted price: $" + b3.discount(10));


        // -------------------------------------------------------
        // 2. Create five Student objects.
        //    After creating them, print the total number of students.
        // -------------------------------------------------------

        // TODO: create 5 Student objects
        Student s1 = new Student("Alice", 3.8);
        Student s2 = new Student("Bob", 3.5);
        Student s3 = new Student("Charlie", 3.9);
        Student s4 = new Student("Diana", 3.7);
        Student s5 = new Student("Eve", 3.6);
        // TODO: call printStudent() for each
        s1.printStudent();
        s2.printStudent();
        s3.printStudent();
        s4.printStudent();
        s5.printStudent();
        // TODO: print Student.totalStudents
        System.out.println("Total students: " + Student.getTotalStudents());


        // -------------------------------------------------------
        // 3. Create two Rectangle objects:
        //    - r1 using the default constructor
        //    - r2 using the parameterized constructor (5, 50)
        //    Print their areas.
        // -------------------------------------------------------

        // TODO: Rectangle r1 = ...
        Rectangle r1 = new Rectangle();
        // TODO: Rectangle r2 = ...
        Rectangle r2 = new Rectangle(5, 50);
        // TODO: print r1.getArea() and r2.getArea()
        System.out.println("Rectangle 1 area: " + r1.getArea());
        System.out.println("Rectangle 2 area: " + r2.getArea());


        // -------------------------------------------------------
        // 4. Create 4 Circle objects with different radii.
        //    Then print the total number of circles created.
        // -------------------------------------------------------

        // TODO: create 4 Circle objects
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(3.0);
        Circle c3 = new Circle(7.0);
        Circle c4 = new Circle(2.5);
        // TODO: print Circle.numberOfCircles
        System.out.println("Total circles: " + Circle.getNumberOfCircles());
    }
}