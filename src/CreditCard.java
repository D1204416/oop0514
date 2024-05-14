public class CreditCard extends Card{

    private static int counter = 1;

    public CreditCard(int money) {
        super(counter,money);
        counter ++;
    }

    @Override
    public void topup(int money) {
        money = (int)(money * 1.1);
        super.topup(money);
    }
}