public class StandardUser extends User {

    // Message to append when fetching non-text message
    private static final String FETCH_DENIED_MSG =
            "This message cannot be fetched because you are not a premium user.";

    public StandardUser(String username, String bio) {
        /* TODO */
    }

    public String fetchMessage(MessageExchange me) {
        /* TODO */
        return null;
    }

    public String displayName() {
        /* TODO */
        // This is a placeholder. Replace with your implementation.
        return "SenderName";
    }
}
