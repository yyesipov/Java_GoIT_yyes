package module4.homework;

public class BankSystemImpl implements BankSystem {


    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();
        if ((userBank.getLimitOfWithdrawal() >= amount + userBank.getCommission(amount)) &&
                (user.getBalance() >= amount + userBank.getCommission(amount))) {
            double newBalance = user.getBalance() - amount - userBank.getCommission(amount);
            System.out.println(user.getName() + ":  Withdrawal is complete \n" + "Withdraw: "
                    + amount + " " + userBank.getCurrency() + "\n" + "Comission: " + userBank.getCommission(amount)
                    + "\n" + "Balance: " + newBalance + "\n");
        } else System.out.println(user.getName() + ": Withdrawal impossible");

    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();

        if (userBank.getLimitOfFunding() >= amount) {
            double newBalance = user.getBalance() + amount;
            System.out.println(user.getName() + ":  Funding is complete \n" + "Fund: "
                    + amount + " " + userBank.getCurrency() + "\n" + "Balance: " + newBalance + "\n");
        } else System.out.println(user.getName() + ": Funding impossible" + "\n");

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank fromUserBank = fromUser.getBank();
        if ((fromUserBank.getLimitOfWithdrawal() >= amount + fromUserBank.getCommission(amount)) &&
                (fromUser.getBalance() >= amount + fromUserBank.getCommission(amount))) {
            double fromUserBalance = fromUser.getBalance() - amount - fromUserBank.getCommission(amount);
            double toUserBalance = toUser.getBalance() + amount;
            System.out.println("Transfer is complete \n" + "From: " + fromUser.getName() + "\n" + "To: "
                    + toUser.getName() + "\n" + "Summ: " + amount + " " + fromUserBank.getCurrency()
                    + "\n" + fromUser.getName() + " balance: " + fromUserBalance + "\n"
                    + toUser.getName() + " balance: " + toUserBalance + "\n");
        } else System.out.println(fromUser.getName() + ": Transfer impossible" + "\n");

    }

    @Override
    public void paySalary(User user) {
        double newBalance = user.getBalance() + user.getSalary();
        user.setBalance(newBalance);
        System.out.println(user.getName() + " paySalary" + "\n" + "Salary: " + user.getSalary()
                + "\n" + "Balance: " + user.getBalance() + "\n");
    }
}
