public class Main {
    public static void main(String[] args) {

        int initialAmount = -100; // сколько денег изначально
        int amountAdded = 7000; // сколько денег закинул
        int bonusAmount; // начислено бонусных рублей

        if (amountAdded >= 1000) {
            bonusAmount = amountAdded / 100;
        } else {
            bonusAmount = 0;
        }

        int finalAmount = initialAmount + amountAdded + bonusAmount; // итоговый баланс

        System.out.println("Ваш баланс равен " + finalAmount + " рублей, включая " + bonusAmount + " бонусных рублей");
    }
}