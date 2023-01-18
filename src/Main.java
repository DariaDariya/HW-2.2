public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 2000;


        int bonus;
        int finalBalance;



        if (payment <= 1000) {
            bonus = 0;
            finalBalance = (balance + payment + bonus);

        }
        else {
            bonus = (payment / 100);
            finalBalance = (balance + payment + bonus);

        }

        System.out.println("Количество бонусов: " + bonus);
        System.out.println("Итоговый баланс: " + finalBalance);

}
}