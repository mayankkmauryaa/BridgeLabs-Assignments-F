
class User {

    final int userId;

    User(int id) {
        this.userId = id;
    }
}

public class q12 {

    public static void main(String[] args) {
        User user = new User(101);
        System.out.println(user.userId);
    }
}
