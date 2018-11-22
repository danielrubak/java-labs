package lab5;

abstract public class Node {
    int sign=1;

    Node minus() {
        sign = -1;
        return this;
    }

    Node plus() {
        sign = 1;
        return this;
    }

    int getSign() { return sign; }

    abstract double evaluate();

    public String toString() { return ""; }

    int getArgumentsCount() { return 0; }

}