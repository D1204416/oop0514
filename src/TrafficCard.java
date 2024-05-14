public class TrafficCard extends Card {

    private static int counter = 1;

    public TrafficCard(int money) {
        super(counter, money);
        counter++;
    }

    @Override
    public void topup(int money) {
        money = (int) (money * 1.2);
        super.topup(money);
    }

}
