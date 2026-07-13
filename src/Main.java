
public class Main {
    static Contact[] contactArray = new Contact[2];
    static int index = 0;

    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        contactManager.start();
    }
}