package springboot.lecture1;

/*
Coupling refers to how much one class knows about or relies on another class. or It is the degree of dependency between two classes. 

1. What is Coupling?
If Class A uses Class B, they are "coupled." The goal in Java (and software design) is to keep this dependency as low as possible so that changing one class doesn't break the other. 

2. Tight Coupling
When classes are highly dependent on each other.
Simple Example: If Class A creates an object of Class B internally (new ClassB()), they are tightly coupled. If you change Class B, Class A will likely break.

3. Loose Coupling
When classes are independent and communicate through interfaces.
Simple Example: Class A doesn't care which specific class it uses, as long as it follows a certain "rule" (Interface). This makes the code easy to change, test, and maintain.



*/
public class Lecture1 {
    public static void main(String[] args) {
        System.out.println("lecture 1");
    }
}
