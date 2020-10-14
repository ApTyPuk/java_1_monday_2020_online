package student_lilija_g.homework.lesson_9.level_5_middle.task_29;

class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return "Germany".equals(trader.getCountry()) && transaction.getAmount() > 1000;
    }
}
