package NestedClass;

// Inner class => koi bhi Nested class joh Static class na ho useh Inner class kehteh hai
public class InnerClassCode {
    public static void main(String[] args) {

        // Outer outer = new Outer();
        // Outer.Inner inner = outer.new Inner();

       // we can skip 2 steps and do in one go 
       Outer.Inner  inner = new Outer().new Inner();  // we omly use this when we don't need Outer obj bez it don't crreate outer ref 
        inner.innerCall();
    }
}

class Outer {
    int a =100;
    // inner class
    // we cannot create inner class object without crating outer class object first

    // inner class ke ander hammedha outer class ka ref store rhega
    // inner class can access outer class static and non static methods and varibles
    class Inner{
        int a = 200;
        void innerCall(){
            System.out.println("Inner a value : " + a + " Outer a :"+ Outer.this.a); // using Outer.this in inner class we are accessing outter class variable
        }

       // IMP=> we cannot create static member in Inner class till before Java 16 but now we can create after java 16  
        static void fun(){
            System.out.println("Static method in non static class ");
        }
    }
}
