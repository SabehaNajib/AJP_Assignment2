
public class Bank_Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Bank_Account(String accountNumber, String accountHolderName, double initialBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Successfully deposited : "+amount);
            System.out.println("New Balance: "+balance);
        }
        else{
            System.out.println("Invalid Deposit Amount, it must be positive.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Successfully withdraw: "+amount);
            System.out.println("New Balance: "+balance);
        }
        else if(amount>balance){
            System.out.println("Insufficient Balance");
            System.out.println("Current Balance: "+balance);
        }
        else{
            System.out.println("Withdrawal Amount must be positive.");
        }
    }
    public void display(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Current Balance: "+balance);
    }

    public static void main(String[] args){
        Bank_Account account1 = new Bank_Account("543987623","John",10000);
        account1.deposit(20000);
        account1.withdraw(10000);
        account1.display();

    }
}

