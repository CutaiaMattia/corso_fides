package generics;

public class Coppia<T> {

    /*
    edit -> find -> replace in Files -> search (type)  and replace (T)
     */

    T a;
    T b;

    public Coppia(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }
}
