public class Main {
    public static void main(String[] args) {
        int startScore = 100; // на счёте
        int bonus;
        int add = 1100;
        if (add <= 1000) {
            bonus = 0;
        } else {
            bonus = add / 100;
        }
        System.out.println("Бонус: " + bonus);
        int balance = startScore + add + bonus;
        System.out.println("Баланс: " + balance);
    }
}