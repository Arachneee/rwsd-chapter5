package main.java;

@FunctionalInterface
public interface Condition {

    boolean evaluate(Facts facts);
}