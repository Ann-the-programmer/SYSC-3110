/**
 * The type Buddy info.
 *
 * @author Anna Romazanova
 * @version October 1, 2026
 */
public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;
    private String change1;

    /**
     * Instantiates a new Buddy info.
     */
    public BuddyInfo() {
        this("Default Buddy", "Unknown Address", "000-000-0000");
    }

    /**
     * Instantiates a new Buddy info.
     *
     * @param name        the name
     * @param address     the address
     * @param phoneNumber the phone number
     */
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo();
        buddy.setName("Anna");
        System.out.println("Hello " + buddy.getName());
    }


    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets phone number.
     *
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phone number.
     *
     * @param phoneNumber the phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
