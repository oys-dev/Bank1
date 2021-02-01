package practice;

public class BankAccount {
	private int balance;
    private Person owner;
    
    public void setBalance(int newBalance){
        balance = newBalance;
    }
    public int getBalance(){
        return balance;
    }
    
    public void setOwner(Person newOwner){
        owner = newOwner;
    }
    public Person getOwner(){
        return owner;
    }
    
    boolean deposit(int amount){
        if(amount < 0 || owner.getCashAmount() < amount){
            System.out.println("�Ա� �����Դϴ�. �ܰ�: " + getBalance() + "��, " + "����: " + owner.getCashAmount() + "��");
            return false;
        }
        else{
            balance = balance + amount;
            owner.setCashAmount(owner.getCashAmount() - amount);
            System.out.println(amount + "�� �Ա��Ͽ����ϴ�. �ܰ�: " + getBalance() + "��, " + "����: " + owner.getCashAmount() + "��");
            return true;
        }
    }
    
    boolean withdraw(int amount){
        if(amount < 0 || amount > getBalance()){
            System.out.println("��� �����Դϴ�. �ܰ�: " + getBalance() + "��, " + "����: " + owner.getCashAmount() + "��");
            return false;
        }
        else{
        	balance = balance - amount;
        	owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "�� ����Ͽ����ϴ�. �ܰ�: " + getBalance() + "��, " + "����: " + owner.getCashAmount() + "��");
            return true;
            
        }
    }
}
