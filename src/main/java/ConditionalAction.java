package main.java;

public interface ConditionalAction {
    void perform(Facts facts);
    boolean evaluate(Facts facts);

}