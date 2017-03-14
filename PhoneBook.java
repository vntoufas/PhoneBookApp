
import java.util.ArrayList;

public class PhoneBook implements PhoneBookInterface {

    ArrayList<Contact> Book1 = new ArrayList();
    boolean found = false;
    Contact foundContact = new Contact();
    public void addContact(String Name, String Address, String Phone_Number) {
        Book1.add(new Contact(Name, Address, Phone_Number));
    }

    public Contact SearchPhoneBook(String Name) throws NoContactException {
        

        for (int i = 0; i < Book1.size(); i++) {
            if (Name.equals(Book1.get(i).getName())) {
                found = true;
                foundContact = Book1.get(i);
            }
        }
        if (found == false) {
            throw new NoContactException(Name);
        }
        return foundContact;
    }

    public boolean deleteContact(String Name) {
        boolean removed = false;

        for (int i = 0; i < Book1.size(); i++) {
            if (Name.equals(Book1.get(i).getName())) {
                removed = true;
                Book1.remove(i);
            }
        }

        return removed;

    }

}
