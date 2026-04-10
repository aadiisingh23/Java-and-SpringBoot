
// Immutable class is a class that if we create object from this class then we  can't change mean that  we cannot override its method and its variables and cannot be inherited.

/* Rules to  create  a immutable class 1. class must be final 2. varibles must be final and private 3. there is only getter no  setter 4. First time initailization is only by Constructors */

public class ImmutableClass {
    public static void main(String[] args) {
        // ERROR FIX: Use double quotes for Strings, not single quotes
        College college = new College("GEC Daman", "Nani Daman");
        Student s = new Student(23, "Aditya", college);
        
        System.out.println("Name: " + s.getName());
        System.out.println("College: " + s.getCollege().getName());
    }
}

// 1. Class is final
final class Student {
    // 2. Variables are private and final
    private final int age;
    private final String name;
    private final College college;

    public Student(int age, String name, College college) {
        this.age = age;
        this.name = name;
        
        /* 
           ERROR/VULNERABILITY: Deep Copy 
           If we do 'this.college = college', the caller still has a 
           reference to the college object and can change it. 
           We must create a new instance (Defensive Copy).
        */
        this.college = new College(college.getName(), college.getAddress());
    }

    public String getName() {
        return this.name;
    }

    /* 
       ERROR/VULNERABILITY: Returning the real reference
       If we return 'this.college', the user can do 'getCollege().setName("New Name")'.
       We return a copy instead to keep the class immutable.
    */
    public College getCollege() {
        return new College(this.college.getName(), this.college.getAddress());
    }
}

// Helper class (Ideally this should also be immutable)
class College {
    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; } // Mutable setter
    public String getAddress() { return address; }
}
