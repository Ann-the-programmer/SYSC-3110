// author: Anna

import java.util.ArrayList;
import java.util.List;

/**
 * The type Address book.
 */
public class AddressBook {
    private List<BuddyInfo> myBuddies;

    /**
     * Instantiates a new Address book.
     */
    public AddressBook() {
        this.myBuddies = new ArrayList<>();
    }

    /**
     * Add buddy.
     *
     * @param aBuddy the a buddy
     */
    public void addBuddy(BuddyInfo aBuddy) {
        if (aBuddy != null) {
            myBuddies.add(aBuddy);



        }
    }

    /**
     * Remove buddy buddy info.
     *
     * @param index the index
     * @return the buddy info
     */
    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < myBuddies.size()) {
            return myBuddies.remove(index);
        }
        return null;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
