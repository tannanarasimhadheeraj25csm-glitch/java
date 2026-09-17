package problems;

interface PaymentService {
    void pay(String receiverUPI, double amount)
            throws InvalidUPIException, InvalidAmountException,
            InsufficientBalanceException;

    double checkBalance();
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidUPIException extends Exception {
    public InvalidUPIException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class Wallet {
    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    public Wallet(String userName, String mobileNumber, String upiId, double balance) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
        this.balance = balance;
    }

    public void addMoney(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Amount to be added must be greater than zero."
            );
        }

        balance += amount;
        System.out.println("₹" + amount + " added successfully.");
    }

    public double getBalance() {
        return balance;
    }

    public String getUpiId() {
        return upiId;
    }

    public void deductMoney(double amount) {
        balance -= amount;
    }

    public void displayWalletDetails() {
        System.out.println("\n----- Wallet Details -----");
        System.out.println("User Name    : " + userName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("UPI ID       : " + upiId);
        System.out.println("Balance      : ₹" + balance);
    }
}

class UPIPayment implements PaymentService {
    private Wallet wallet;

    public UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    private boolean validateUPI(String upiId) {
        if (upiId == null || upiId.isEmpty()) {
            return false;
        }

        int atIndex = upiId.indexOf("@");

        return atIndex > 0 && atIndex < upiId.length() - 1;
    }

    @Override
    public void pay(String receiverUPI, double amount)
            throws InvalidUPIException,
            InvalidAmountException,
            InsufficientBalanceException {

        if (!validateUPI(receiverUPI)) {
            throw new InvalidUPIException(
                    "Invalid UPI ID: " + receiverUPI
            );
        }

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Payment amount must be greater than zero."
            );
        }

        if (amount > wallet.getBalance()) {
            throw new InsufficientBalanceException(
                    "Insufficient balance. Available balance: ₹"
                            + wallet.getBalance()
            );
        }

        wallet.deductMoney(amount);

        System.out.println("\nPayment Successful!");
        System.out.println("Receiver UPI : " + receiverUPI);
        System.out.println("Amount Paid  : ₹" + amount);
        System.out.println("Remaining Balance: ₹" + wallet.getBalance());
    }

    @Override
    public double checkBalance() {
        return wallet.getBalance();
    }
}

public class task4 {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(
                "Rahul",
                "9876543210",
                "rahul@upi",
                0
        );

        UPIPayment payment = new UPIPayment(wallet);

        wallet.displayWalletDetails();

        try {
            wallet.addMoney(5000);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nCurrent Balance: ₹" + payment.checkBalance());

        System.out.println("\n----- Transaction 1 -----");

        try {
            payment.pay("friend@upi", 1500);
        } catch (InvalidUPIException |
                 InvalidAmountException |
                 InsufficientBalanceException e) {

            System.out.println("Transaction Failed: " + e.getMessage());
        } finally {
            System.out.println("Transaction process completed.");
        }

        System.out.println("\n----- Transaction 2 -----");

        try {
            payment.pay("invalidUPI", 500);
        } catch (InvalidUPIException |
                 InvalidAmountException |
                 InsufficientBalanceException e) {

            System.out.println("Transaction Failed: " + e.getMessage());
        } finally {
            System.out.println("Transaction process completed.");
        }

        System.out.println("\n----- Transaction 3 -----");

        try {
            payment.pay("shop@upi", 5000);
        } catch (InvalidUPIException |
                 InvalidAmountException |
                 InsufficientBalanceException e) {

            System.out.println("Transaction Failed: " + e.getMessage());
        } finally {
            System.out.println("Transaction process completed.");
        }

        System.out.println("\n----- Transaction 4 -----");

        try {
            payment.pay("friend@upi", -100);
        } catch (InvalidUPIException |
                 InvalidAmountException |
                 InsufficientBalanceException e) {

            System.out.println("Transaction Failed: " + e.getMessage());
        } finally {
            System.out.println("Transaction process completed.");
        }

        wallet.displayWalletDetails();

        System.out.println("\nFinal Wallet Balance: ₹" + payment.checkBalance());
    }
}


