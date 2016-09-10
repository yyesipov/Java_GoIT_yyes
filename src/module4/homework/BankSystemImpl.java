package module4.homework;

public class BankSystemImpl implements BankSystem {


    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();

        if (userBank.getLimitOfWithdrawal() >= amount + userBank.getCommission(amount)) {
            double newBalance = user.getBalance() - amount - userBank.getCommission(amount);
        } else System.out.println("Withdrawal impossible");
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();

        if (userBank.getLimitOfFunding() >= amount) {
            double newBalance = user.getBalance() + amount;
        } else System.out.println("Funding impossible");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank fromUserBank = fromUser.getBank();

        if (fromUserBank.getLimitOfWithdrawal() >= amount + fromUserBank.getCommission(amount)) {
            double fromUserBalance = fromUser.getBalance() - amount - fromUserBank.getCommission(amount);
        } else System.out.println("Transfer impossible");

        double toUserBalance = toUser.getBalance() + amount;
    }

    @Override
    public void paySalary(User user) {
        double newBalance = user.getBalance() + user.getSalary();
    }
}
