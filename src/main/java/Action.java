package main.java;

@FunctionalInterface
interface Action{
    void execute(Facts facts);
}