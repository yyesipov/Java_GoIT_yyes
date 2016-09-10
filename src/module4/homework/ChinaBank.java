package module4.homework;

public class ChinaBank extends Bank {
    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 100;
        else limit = 150;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limit;
        if (getCurrency() == Currency.EUR) limit = 10000;
        else limit = 5000;
        return limit;
    }

    @Override
    int grtMonthlyRate() {
        int mounthlyRate;
        if (getCurrency() == Currency.USD) mounthlyRate = 1;
        else mounthlyRate = 0;
        return mounthlyRate;
    }

    @Override
    double getCommission(int summ) {
        double commission;
        if (getCurrency() == Currency.USD) {
            if (summ < 1000) commission = summ * 0.03;
            else {
                commission = summ * 0.05;
            }
        } else {
            if (summ < 1000) commission = summ * 0.1;
            else {
                commission = summ * 0.11;
            }

        }
        return commission;
    }
}
