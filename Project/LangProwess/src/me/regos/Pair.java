package me.regos;

public class Pair <A, B>{
    private A first;
    private B second;

    public Pair() {
        super();
        this.first = first;
        this.second = second;
    }

    public String toString()
    {
        return "(" + first + ", " + second + ")";
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }
}
