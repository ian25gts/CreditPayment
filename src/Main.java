public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int term;
        double credcalk = service.calculate(term = 12);
        double credcalk1 = service.calculate(term = 24);
        double credcalk2 = service.calculate(term = 36);
        String result = String.format("%.0f", credcalk);
        String result1 = String.format("%.0f", credcalk1);
        String result2 = String.format("%.0f", credcalk2);
        System.out.println("Кредит на 1 год.  Ежемесячный платеж: " + result + " рублей, ставка-9.99% годовых");
        System.out.println("Кредит на 2 года. Ежемесячный платеж: " + result1 + " рублей, ставка-9.99% годовых");
        System.out.println("Кредит на 3 года. Ежемесячный платеж: " + result2 + " рублей, ставка-9.99% годовых");
    }

}
