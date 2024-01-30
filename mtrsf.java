import java.util.UUID;

/**
 * This class represents a Money Transfer form for the sender or receiver.
 * It provides methods to generate a transfer code and integrate with an API to access the database.
 */
public class mtrsf {
    private final String senderName;
    private String receiverName;
    private double amount;

    /**
     * Constructor to initialize the MoneyTransferForm object with sender name, receiver name, and amount.
     *
     * @param senderName   The name of the sender.
     * @param receiverName The name of the receiver.
     * @param amount       The amount to be transferred.
     */
    public mtrsf(String senderName, String receiverName, double amount) {
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.amount = amount;
    }

    /**
     * Generates a unique transfer code using UUID (Universally Unique Identifier).
     *
     * @return Returns the generated transfer code.
     */
    public String generateTransferCode() {
        UUID transferCode = UUID.randomUUID();
        return transferCode.toString();
    }

    /**
     * Integrates with an API to access the database and perform the money transfer.
     *
     * @param transferCode The transfer code generated for the transaction.
     * @return Returns true if the transfer is successful, false otherwise.
     */
    public boolean performMoneyTransfer(String transferCode) {
        // Integration with API to access the database and perform the money transfer
        // Implementation details are omitted for brevity

        // Simulating a successful transfer
        return true;
    }

    /**
     * Getter for the sender name.
     *
     * @return Returns the name of the sender.
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Getter for the receiver name.
     *
     * @return Returns the name of the receiver.
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Getter for the transfer amount.
     *
     * @return Returns the amount to be transferred.
     */
    public double getAmount() {
        return amount;
    }
}

// Usage Example for MoneyTransferForm

