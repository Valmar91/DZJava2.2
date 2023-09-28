
public class Main {
    public static void main(String[] args) {
        int base = 1000;
        int deposit;
        int score;

        score = 100;
        deposit = 1100;
        
        if (deposit + score > base) {
            score = deposit/100 + score + deposit;
        } else {
            score = score + deposit;
        }

        if (score > base) {
            System.out.println("Ваш бонус составил: " + deposit / 100);
        }
        System.out.println("На счёте: " + score);
    }
}