public class BankB extends Bank {

    int balance;
    
    BankB(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return this.balance;
    }

}