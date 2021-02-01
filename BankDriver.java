package practice;

public class BankDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
        p1.setCashAmount(100000);
    
        BankAccount a1 = new BankAccount();
        a1.setBalance(500000);
    
        p1.setAccount(a1);
        a1.setOwner(p1);
    
        a1.deposit(30000);
        a1.withdraw(170000);
        a1.deposit(620000);
        a1.withdraw(890000);
		
	}

}
