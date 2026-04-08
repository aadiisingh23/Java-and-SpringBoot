package NestedClass;

public class StaticClass {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Innner inner = new Outer.Innner(outer);
    }
}

class Outer {

    static int amount = 1000;
    int rate = 5;

    void printOuter(){
        System.out.println("This is a Outerr class non static outer class Method");
    }

    // Inner class access non static varaible and method indirectly using ref from obj 
    // Inner static class can perfromm all action that a normal class does like it can inherit class , Implement Interfaces and also have static  methods and fields and inner class also be private so we can restricvt from outer class access
    static class Innner {

        Outer outer;

        // so here we can can use Outer class non staic variable using ref of outer class object
        public Innner(Outer outer) {
            this.outer = outer;
            callMe();
        }

        static int value;

        void callMe() {
            System.out.println("the value  is : " + value + " amount is " + amount + " and rate is " + outer.rate);
            outer.printOuter(); // calling non static method of outer class indirectly using ref 
        }
    }
}


// Use cases=> 1. if our nested class use as helper class to our Outer class then we use nested inner class
// 2. Builder Design Pattern 
// 3. If you want to have static methods inside  a nested inner class
// 4. Req/Res DTO    