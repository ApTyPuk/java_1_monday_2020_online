package student_lilija_g.homework.lesson_9.level_4_junior.task_20;

class Demo {

    public static void main(String[] args) {

        Demo demo = new Demo();

        demo.notFraudRuleOne();
        demo.fraudRuleOne();

        demo.notFraudRuleTwo();
        demo.fraudRuleTwo();

        demo.notFraudRuleThree();
        demo.fraudRuleThree();

        demo.notFraudRuleFour();
        demo.fraudRuleFour();

    }

    void totalTest(int expectedValue, int actualValue, String testName) {
        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
            System.out.println("Expected Value = " + expectedValue);
            System.out.println("Actual Value = " + actualValue);
        }
    }

    void notFraudRuleOne() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles","USA");
        Transaction transaction = new Transaction(trader, 1000);
        demo.totalTest(1000, transaction.getAmount(), "Not Pokemon");
    }

    void fraudRuleOne() {
        Demo demo = new Demo();
        Trader trader = new Trader("Pokemon", "Los Angeles","USA");
        Transaction transaction = new Transaction(trader, 1000);
        demo.totalTest(0, transaction.getAmount(), "Pokemon");
    }
    void notFraudRuleTwo() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles","USA");
        Transaction transaction = new Transaction(trader, 1000);
        demo.totalTest(1000, transaction.getAmount(), "Amount < 1000000");
    }

    void fraudRuleTwo() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 100000000);
        demo.totalTest(0, transaction.getAmount(), "Amount > 1000000");
    }
    void notFraudRuleThree() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 1000);
        demo.totalTest(1000, transaction.getAmount(), "Not Sydney");
    }
    void fraudRuleThree() {
        Demo demo = new Demo();
        Trader trader = new Trader("Pokemon", "Sydney","USA");
        Transaction transaction = new Transaction(trader, 1000);
        demo.totalTest(0, transaction.getAmount(), "Sydney");
    }
    void notFraudRuleFour() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 1000);
        demo.totalTest(1000, transaction.getAmount(), "Not Jamaica");
    }
    void fraudRuleFour() {
        Demo demo = new Demo();
        Trader trader = new Trader("Jessica", "Kingston","Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        demo.totalTest(0, transaction.getAmount(), "Jamaica");
    }
}
