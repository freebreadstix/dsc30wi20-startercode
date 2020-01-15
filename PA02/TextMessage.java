public class TextMessage extends Message {

    // Error message to use in OperationDeniedException
    private static final String EXCEED_MAX_LENGTH =
            "Your input exceeded the maximum length limit.";

    // input validation criteria
    private static final int MAX_TEXT_LENGTH = 1000;

    public TextMessage(User sender, String text)
            throws OperationDeniedException {
        /* TODO */
    }

    public String getContents() {
        /* TODO */
        return null;
    }

}
