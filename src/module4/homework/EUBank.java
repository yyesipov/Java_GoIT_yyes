package module4.homework;

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {int limit;
        if (getCurrency() == Currency.USD) limit = 2000;
        else limit = 2200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {int limit;
        if (getCurrency() == Currency.EUR) limit = 20000;
        else limit = 10000;
        return limit;
    }

    @Override
    int grtMonthlyRate() {
        int mounthlyRate;
        if (getCurrency() == Currency.USD) mounthlyRate = 0;
        else mounthlyRate = 1;
        return mounthlyRate;
    }

    @Override
    double getCommission(int summ) {
        double commission;
        if (getCurrency() == Currency.USD) {
            if (summ < 1000) commission = summ * 0.05;
            else {
                commission = summ * 0.07;
            }
        } else {
            if (summ < 1000) commission = summ * 0.02;
            else {
                commission = summ * 0.04;
            }

        }
        return commission;
    }
}
