package springboot.lecture1;

public class MainService {
    public static void main(String[] args) {
        UserService userNotify = new UserService();
        userNotify.UserNotify("Order Placed");
    }
}
