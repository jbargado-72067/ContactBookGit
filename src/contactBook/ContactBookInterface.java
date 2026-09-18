package contactBook;

public interface ContactBookInterface {
    public boolean hasContact(String name);

    public int getNumberOfContacts();

    public void addContact(String name, int phone, String email);

    public void deleteContact(String name);

    public int getPhone(String name);

    public String getEmail(String name);

    public void setPhone(String name, int phone);

    public void setEmail(String name, String email);

    public void initializeIterator();

    public boolean hasNext();

    public Contact next();

    public String findFromPhone(int number);

    public boolean hasRepeatedPhoneNumber();

}
