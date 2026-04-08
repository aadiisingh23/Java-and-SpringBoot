
public class RunJava {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.OuterCall();

    }
}

class Outer {

    void OuterCall() {
        class Local {
            void localCall() {
                System.out.println("Local Class Method call");
            }
            
        }

        Local local = new Local();
        local.localCall();
    }
}
