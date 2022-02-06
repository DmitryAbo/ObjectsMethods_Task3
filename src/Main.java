public class Main {
    public static void main(String[] args) {
        CreditPaymentService CreditPaymentService = new CreditPaymentService();
        double payment = CreditPaymentService.calculate(3, 1_000_000, 9.99);
        System.out.println(Math.round(payment));
    }
}
