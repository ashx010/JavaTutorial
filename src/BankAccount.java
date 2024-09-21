public class BankAccount implements Bank{
    //Encapsulation as no one can access the below private data variables,
    //but can be accessed through methods defined in the class.
    //Encapsulation means to store data and methods in a single entity in this case its Class.
    private int balance;
    private final int accountNumber;

    public BankAccount(int accountNumberIN, int balanceIN){
        this.accountNumber = accountNumberIN;
        this.balance = balanceIN;
        System.out.println("Account Created \nAccount Number:\t" + this.accountNumber + "\nBalance:\t" + this.balance);
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
            System.out.println("New Balance:\t"+this.balance);
        } else{
            System.out.println("Deposit should be greater than 0.");
        }
    }

    public void withdraw(int amount){
        if(amount > this.balance || amount <= 0){
            System.out.println("Wrong Amount!");
        }else{
            this.balance = this.balance - amount;
            System.out.println("New Balance:\t"+this.balance);
        }
    }

    public void getInfo(){
        System.out.println("Account Number:\t"+this.accountNumber+"\nBalance:\t"+this.balance);
    }
}
