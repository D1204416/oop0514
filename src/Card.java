public class Card {

    private int id;
    private int balance; // 卡片餘額

    public Card(int id, int money) {
        this.id = id;
        this.balance = money;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public void topup(int money) {
        this.balance += money;
    }

    boolean withdraw(int money) {
        if (this.balance >= money) {
            this.balance -= money;
            return true;
        }
        return false;
    }

}


