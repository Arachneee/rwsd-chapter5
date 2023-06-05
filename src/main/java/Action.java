package main.java;

@FunctionalInterface
public interface Action{
    void execute(Facts facts);
}