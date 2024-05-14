public class Main {

    public static void main(String[] args){

        CreditCard creditCard = new CreditCard(100);
        TrafficCard trafficCard = new TrafficCard(200);

        TeaShopMachine machine = new TeaShopMachine();
        machine.pay(creditCard);
        System.out.println(creditCard.getBalance());

        machine.pay(trafficCard);
        System.out.println(trafficCard.getBalance());

        DepositMachine depositMachine = new DepositMachine();
        depositMachine.deposit(creditCard,300);
        System.out.println(creditCard.getBalance());

    }
}