package DAO;

public class DataAccessException extends Exception {
    public DataAccessException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getLocalizedMessage().toString();
    }
}
