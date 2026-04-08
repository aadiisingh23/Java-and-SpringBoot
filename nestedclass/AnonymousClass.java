package nestedclass.LocalClass;
  // Anonymous class woh class hai jiska koi naam nahi hota hai aur hum ise directly uske object ke sath hi define karteh hai. Anonymous class ka use hum tab karteh hai jab hume ek hi baar use hone wali class ki jarurat hoti hai.

public class AnonymousClass {
    public static void main(String[] args) {
        // Anonymous class bana rahe hain jo AnonymousClassCode ko extend karega
        AnonymousClassCode a = new AnonymousClassCode() {
            @Override
            void print() {
                System.out.println("This is an anonymous class method");
                introduce(); // we can call the introduce method here because it is defined in the anonymous class and we are calling it from the print method which is also defined in the anonymous class.
            }

            void introduce(){
                System.out.println("Hi, i am aditya singh");
            }
        };
        a.print();
        a.introde(); // yaha pe hum directly a.introduce() nahi kar sakteh hai q ki introduce method AnonymousClassCode me define nahi hai aur a ka type AnonymousClassCode hai isliye hum ise call nahi kar sakteh hai.
    }
}
// Anonymous class tabhi ban sakti hai jab tum ek abstract class ya interface ko extend/implement karte ho.

// Base class jisme ek method define hai
class AnonymousClassCode {
    void print() {
        System.out.println("This is base class method");
    }
}


//  anonymous class ke ander har ek  chiz normal class ke  tareh kar sakta hu lekin hum ishme constructor nahi bana sakteh hai q ki iska koi naam nahi hota hai aur hum ise directly uske object ke sath hi define karteh hai. Anonymous class ka use hum tab karteh hai jab hume ek hi baar use hone wali class ki jarurat hoti hai.