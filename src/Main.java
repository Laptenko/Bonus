public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int cash = 1100;
        int bonus = 0;
        if (cash>1000){
            bonus = cash/100;
        }
        balance = bonus + cash + balance;
        System.out.println("Ваш баланс = " + balance);
    }
}
