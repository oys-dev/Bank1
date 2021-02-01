package practice;

public class Person {
	private int cashAmount;
    private BankAccount account;
    
    public void setCashAmount(int newCashAmount){
        cashAmount = newCashAmount;
    }
    public int getCashAmount(){
        return cashAmount;
    }
    
    public void setAccount(BankAccount newAccount){
        account = newAccount;
    }
    public BankAccount getAccount(){
        return account;
    }
}
