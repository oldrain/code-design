package app;

/**
 * IdempotenceStorage
 *
 * @author roy
 * @version 1.0.0
 */
public interface IdempotenceStorage {

    boolean saveIfAbsent(String idempotenceId);

    void delete(String idempotenceId);

}
