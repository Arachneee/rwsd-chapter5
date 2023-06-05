package main.java;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BusinessRuleEngine {

    private final List<Rule> rules;
    private final Facts facts;

    public BusinessRuleEngine(Facts facts) {
        this.facts = facts;
        this.rules = new ArrayList<>();
    }

    public void addRule(Rule rule) {
        this.rules.add(rule);
    }

    public void run() {
        this.rules.stream().sorted(Comparator.comparingInt(Rule::getRank)).forEach(rule -> rule.perform(facts));
    }
}