package module4.homework;

public class USBank extends Bank {

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 1000;
        else limit = 1200;
        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limit;
        if (getCurrency() == Currency.EUR) limit = 10000;
        else limit = 0;
        return limit;
    }

    @Override
    int grtMonthlyRate() {
        int mounthlyRate;
        if (getCurrency() == Currency.USD) mounthlyRate = 1;
        else mounthlyRate = 2;
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
            if (summ < 1000) comission = summ * 0.06;
            else {
                comission = summ * 0.08;
            }

        }
        return comission;
    }
}

