package nestedclass;

public class LocalClass {
    // Local class woh class hai jo kisi bhi block ke ander likh sakteh hai jaise if, for , method blocks ke ander.

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.OuterCall();

    }
}

class Outer {

    void OuterCall() {
        // yaha pe local class method se link ho gai aur hum ish method kom  tabhi  banayege jab ish class ka use ish method ke ander hoga q ki jaise hi ye method call end hogs ish clas ka sue nhi hoga
        class Local {

            void localCall() {
                System.out.println("Local Class Method call");
            }

        }

        Local local = new Local();
        local.localCall();
    }
}
