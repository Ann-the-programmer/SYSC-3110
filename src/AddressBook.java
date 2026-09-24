import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> myBuddies;

    public AddressBook() {
        this.myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo aBuddy) {
        if (aBuddy != null) {
            myBuddies.add(aBuddy);
        }
    }

    public void removeBuddy(BuddyInfo aBuddy) {
        if (aBuddy != null) {
            myBuddies.remove(aBuddy);
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
