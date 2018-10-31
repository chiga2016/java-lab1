public class ItemInContainerException extends Exception{
    public ItemInContainerException() {
    }

    public ItemInContainerException(String message) {
        super(message);
    }
    public ItemInContainerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemInContainerException(Throwable cause) {
        super(cause);
    }
    public ItemInContainerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
