package module4.homework;

public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(10101010, "USA", Currency.EUR, 250, 605.7, 223, 212345550);
        Bank euBank = new EUBank(20202020, "GB", Currency.EUR, 200, 504.9, 221, 110395720);
        Bank chinaBank = new ChinaBank(30303030, "PRC", Currency.EUR, 360, 238.3, 220, 11347710);

        User user1 = new User();
        user1.setName("User1_ofUSBank");
        user1.setCompanyName("Company1");
        user1.setBank(usBank);
        user1.setId(1111111);
        user1.setBalance(6000);
        user1.setSalary(600);
        user1.setMounthsOfEmployment(5);

        User user2 = new User();
        user2.setName("User2_ofUSBank");
        user2.setCompanyName("Company2");
        user2.setBank(usBank);
        user2.setId(2222222);
        user2.setBalance(1000);
        user2.setSalary(400);
        user2.setMounthsOfEmployment(2);

        User user3 = new User();
        user3.setName("User3_ofEUBank");
        user3.setCompanyName("Company3");
        user3.setBank(euBank);
        user3.setId(3333333);
        user3.setBalance(8300);
        user3.setSalary(750);
        user3.setMounthsOfEmployment(23);

        User user4 = new User();
        user4.setName("User4_ofEUBank");
        user4.setCompanyName("Company4");
        user4.setBank(euBank);
        user4.setId(4444444);
        user4.setBalance(11750);
        user4.setSalary(1200);
        user4.setMounthsOfEmployment(38);

        User user5 = new User();
        user5.setName("User5_ofChinaBank");
        user5.setCompanyName("Company5");
        user5.setBank(chinaBank);
        user5.setId(5555555);
        user5.setBalance(19800);
        user5.setSalary(2300);
        user5.setMounthsOfEmployment(47);

        User user6 = new User();
        user6.setName("User6_ofCinaBank");
        user6.setCompanyName("Company6");
        user6.setBank(chinaBank);
        user6.setId(6666666);
        user6.setBalance(3000);
        user6.setSalary(500);
        user6.setMounthsOfEmployment(6);

        BankSystem bankSystem = new BankSystemImpl();

        //operations for user1

        usBank.setCurrency(Currency.USD);
        bankSystem.withdrawOfUser(user1, 100);

        usBank.setCurrency(Currency.EUR);
        bankSystem.fundUser(user1, 400);

        usBank.setCurrency(Currency.USD);
        bankSystem.transferMoney(user1, user6, 900);

        bankSystem.paySalary(user1);

        //operations for user2

        usBank.setCurrency(Currency.EUR);
        bankSystem.withdrawOfUser(user2, 500);

        usBank.setCurrency(Currency.EUR);
        bankSystem.fundUser(user2, 400);

        usBank.setCurrency(Currency.USD);
        bankSystem.transferMoney(user2, user4, 900);

        bankSystem.paySalary(user2);

        //operations for user3

        euBank.setCurrency(Currency.EUR);
        bankSystem.withdrawOfUser(user3, 1650);

        euBank.setCurrency(Currency.USD);
        bankSystem.fundUser(user3, 800);

        euBank.setCurrency(Currency.USD);
        bankSystem.transferMoney(user3, user5, 300);

        bankSystem.paySalary(user3);

        //operations for user4

        euBank.setCurrency(Currency.EUR);
        bankSystem.withdrawOfUser(user3, 100);

        euBank.setCurrency(Currency.USD);
        bankSystem.fundUser(user3, 2200);

        euBank.setCurrency(Currency.EUR);
        bankSystem.transferMoney(user3, user5, 850);

        bankSystem.paySalary(user3);

        //operations for user5

        chinaBank.setCurrency(Currency.EUR);
        bankSystem.withdrawOfUser(user5, 90);

        chinaBank.setCurrency(Currency.USD);
        bankSystem.fundUser(user5, 400);

        chinaBank.setCurrency(Currency.USD);
        bankSystem.transferMoney(user5, user1, 70);

        bankSystem.paySalary(user3);

        //operations for user6

        chinaBank.setCurrency(Currency.EUR);
        bankSystem.withdrawOfUser(user5, 90);

        chinaBank.setCurrency(Currency.USD);
        bankSystem.fundUser(user6, 500);

        chinaBank.setCurrency(Currency.USD);
        bankSystem.transferMoney(user6, user2, 150);

        bankSystem.paySalary(user6);
    }
}
