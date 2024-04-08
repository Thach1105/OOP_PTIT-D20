public class Main {
    public static void main(String[] args) {
        BankAccount savings = new BankAccount("Jimmy");
        savings.deposit(10.00);
        savings.deposit(50.00);
        savings.deposit(10.00);
        savings.deposit(70.00);
        System.out.println(savings.transactionFee((5.00)));
        System.out.println(savings.transactionFee((10.00)));

    }
}

class BankAccount{
    private String id;
    private double balance;
    private int transactions;

    public BankAccount(String id){
        this.id = id;
        transactions = 0;
    }

    public double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }

    public int getTransactions() {
        return transactions;
    }

    public void deposit(double amount){
        if(amount >= 0 && amount <= 500){
            transactions+=1;
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            transactions+=1;
        }
    }
    public boolean transactionFee(double amount){
        double totalTransactionFee = 0;
        for(int i = 1; i <= transactions; i++){
            totalTransactionFee = totalTransactionFee + i * amount;
        }
        if(balance >= totalTransactionFee){
            balance -= totalTransactionFee;
            return true;
        }
        else{
            return false;
        }
    }
}