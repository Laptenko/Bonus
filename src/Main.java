public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int cash = 1000;
        if (cash>1000){
            int bonus = cash/100;
            int total = bonus + cash + balance;
            System.out.println("Ваш баланс = " + total);
        }
        else {
            int total = balance + cash;
            System.out.println("Ваш баланс = " + total);
        }
    }
}
