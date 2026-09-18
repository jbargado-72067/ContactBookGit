/**
 * enum class for organization to keep all the output messages
 */
public enum Message {
    CONTACT_EXISTS("contactBook.Contact already exists."),
    NAME_NOT_EXIST("contactBook.Contact does not exist."),
    CONTACT_ADDED("contactBook.Contact added."),
    CONTACT_REMOVED("contactBook.Contact removed."),
    CONTACT_UPDATED("contactBook.Contact updated."),
    BOOK_EMPTY("contactBook.Contact book empty."),
    QUIT_MSG("Goodbye!"),
    COMMAND_ERROR("Unknown command."),
    ALL_DIFFERENT("All contacts have different phone numbers."),
    NOT_ALL_DIFFERENT("There are contacts that share phone numbers."),
    PHONE_NOT_EXIST("Phone number does not exist.");

    private final String msg;

    Message(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}
