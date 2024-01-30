public class MoneyTransferExample {
    public static void main(String[] args) {
        // Create a MoneyTransferForm object
        mtrsf transferForm = new mtrsf("John Doe", "Jane Smith", 1000.0);

        // Generate a transfer code
        String transferCode = transferForm.generateTransferCode();
        System.out.println("Transfer Code: " + transferCode);

        // Perform the money transfer
        boolean transferSuccessful = transferForm.performMoneyTransfer(transferCode);
        if (transferSuccessful) {
            System.out.println("Money transfer successful!");
        } else {
            System.out.println("Money transfer failed!");
        }
    }
}
