package app;

/**
 * Idempotence
 *
 * @author roy
 * @version 1.0.0
 */
public class Idempotence {

    private IdempotenceStorage storage;

    public Idempotence(IdempotenceStorage storage) {
        this.storage = storage;
    }

    public boolean saveIfAbsent(String idempotenceId) {
        return this.storage.saveIfAbsent(idempotenceId);
    }

    public void delete(String idempotenceId) {
        this.storage.delete(idempotenceId);
    }

}
