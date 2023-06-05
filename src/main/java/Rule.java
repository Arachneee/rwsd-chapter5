package main.java;

public class Rule {

    private Condition condition;
    private Action action;
    private int rank;

    public Rule(Condition condition, Action action) {
        this.condition = condition;
        this.action = action;
        this.rank = 0;
    }
    public Rule(Condition condition, Action action, int rank) {
        this.condition = condition;
        this.action = action;
        this.rank = rank;
    }

    public int getRank(){
        return this.rank;
    }

    public void perform(Facts facts) {
        if(condition.evaluate(facts)){
            action.execute(facts);
        }
    }
}