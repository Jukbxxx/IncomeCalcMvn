import ru.netology.services.IncomeCalculator;

public class Main {
    public static void main (String[] args) {
        IncomeCalculator service = new IncomeCalculator();
        int count = service.calcIncome(60000, 100000, 150000);
        System.out.println("Месяцев отдыха: " + count);
    }
}
