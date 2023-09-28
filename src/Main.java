
public class Main {
    public static void main(String[] args) {
        int base = 1000; // число, которое должно превышать сумма пополнения
        int deposit = 1100; //сумма пополнения
        int score = 100; //сколько на счёте сейчас

        if (deposit > base) {
            score = deposit / 100 + score + deposit;
        } else {
            score = score + deposit;
        }

        if (deposit > base) {
            System.out.println("Ваш бонус составил: " + deposit / 100);
        }
        System.out.println("На счёте: " + score);
    }
}