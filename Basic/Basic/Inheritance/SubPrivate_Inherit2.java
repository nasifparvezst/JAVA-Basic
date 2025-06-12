public class SubPrivate_Inherit2 extends Private_Inherit2 {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    void display(){
        System.out.print(getName()+" ");
        System.out.print(getRoll()+" ");
        System.out.println(getBalance()+" ");
    }
}
