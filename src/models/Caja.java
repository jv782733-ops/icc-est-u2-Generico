package models;

public class Caja<T> {
    private T t;

    public Caja(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    
}
