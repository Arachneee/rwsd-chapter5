package main.java;

public class RuleBuilder {
    private Condition condition;
    private Action action;

    private RuleBuilder(Condition condition) {
        this.condition = condition;
    }
    private RuleBuilder(Condition condition, Action action) {
        this.condition = condition;
        this.action = action;
    }

    public static RuleBuilder when(Condition condition) {
        return new RuleBuilder(condition);
    }
    public static RuleBuilder whenAnd(Condition conditionA, Condition conditionB) {
        return new RuleBuilder(facts->conditionA.evaluate(facts) && conditionB.evaluate(facts));
    }
    public static RuleBuilder whenOr(Condition conditionA, Condition conditionB) {
        return new RuleBuilder(facts->conditionA.evaluate(facts) || conditionB.evaluate(facts));
    }


    public RuleBuilder then(Action action) {
        return new RuleBuilder(condition, action);
    }
    public Rule order(int rank){
        return new Rule(condition, action, rank);
    }
}