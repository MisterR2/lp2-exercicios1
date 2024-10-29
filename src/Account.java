public class Account {
    private String id;
    private String name;
    private double balance = 0;

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double credit(double ammount) {
        this.setBalance(this.getBalance()+ammount);
        return balance;
    }

    public double debit(double ammount) {
        if (ammount > balance) {
            System.out.println("A quantia solicitada é maior que o saldo");
        } else {
            this.setBalance(this.getBalance()-ammount);
        }
        return balance;
    }

    public double transferTo(Account a2, double ammount){
        if (ammount > balance) {
            System.out.println("A quantia solicitada é maior que o saldo");
        } else {
            this.setBalance(this.getBalance()-ammount);
            a2.setBalance(a2.getBalance()+ammount);
        }
        
        return balance;
    }
}
