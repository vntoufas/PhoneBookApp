
public interface PhoneBookInterface {
    /*
     Προσθήκη μιας νέας επαφής στην Arraylist
     */

    public void addContact(String name, String address, String phone_number);
    /*
     Αναζήτηση μιας επαφής με βάση το όνομα. Σε περίπτωση που δεν θα
     υπάρχει θα πρέπει να εγείρεται μια εξαίρεση τύπου
     «NoContactException».
     */

    public Contact SearchPhoneBook(String name) throws NoContactException;
    /*
     Διαγραφή επαφής από τον κατάλογο. Επιστρέφει true αν βρέθηκε και
     διαγράφηκε. Σε αντίθετη περίπτωση επιστρέφει false.
     */

    public boolean deleteContact(String name);
}
