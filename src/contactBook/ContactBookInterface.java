package contactBook;

public interface ContactBookInterface {
    boolean hasContact(String name);

    int getNumberOfContacts();

    void addContact(String name, int phone, String email);

    void deleteContact(String name);

    int getPhone(String name);

    String getEmail(String name);

    void setPhone(String name, int phone);

    void setEmail(String name, String email);

    void initializeIterator();

    boolean hasNext();

    Contact next();

    String findFromPhone(int number);

    boolean hasRepeatedPhoneNumber();

}
