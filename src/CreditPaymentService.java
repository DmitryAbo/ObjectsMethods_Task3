public class CreditPaymentService {
    public double calculate(int creditPeriod, double creditAmount, double creditPercent) {

        int numberPayments = creditPeriod * 12;
        double mounthPercent = (creditPercent / 12) / 100;  //Месячная процентная ставка
        double factorAnnuity = mounthPercent * Math.pow(1 + mounthPercent, numberPayments) / (Math.pow(1 + mounthPercent, numberPayments) - 1);   //Коэффициент аннуитета
        double annuityPayment = creditAmount * factorAnnuity;   //Аннуитетный платеж
        return annuityPayment;
    }
}
