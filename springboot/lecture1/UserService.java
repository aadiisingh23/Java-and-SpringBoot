package springboot.lecture1;

public class UserService {
    NotificationService notification = new NotificationService();

    public void UserNotify(String message) {
        notification.notifyUser(message);
    }
}
