import static java.lang.Math.pow;

public class CreditPaymentService {
    public double calculate (int term, int credit, double procent) {
        double monthProcent = procent / 100 / 12; // расчет ежемесячного процента
        double mps = 1 + monthProcent; // формула расчета
        double psv = pow(mps, term) - 1;
        double spv = monthProcent / psv;
        double vips = monthProcent + spv;
        double res = credit * vips; // результат
        return res;
    }

    }
