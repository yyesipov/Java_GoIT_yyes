package module4.homework;

public class EUBank extends Bank {

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
    double getComission(int summ) {
        double comission;
        if (getCurrency() == Currency.USD) {
            if (summ < 1000) comission = summ * 0.05;
            else {
                comission = summ * 0.07;
            }
        } else {
            if (summ < 1000) comission = summ * 0.02;
            else {
                comission = summ * 0.04;
            }

        }
        return comission;
    }
}
