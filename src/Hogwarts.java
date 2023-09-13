public class Hogwarts {
    private int conjure;//свойство колдовать
    private int transgress;//свойство трансгрессировать

    public Hogwarts(int conjure, int transgress) {
        this.conjure = conjure;
        this.transgress = transgress;
    }

    public int getConjure() {
        return conjure;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setConjure(int conjure) {
        this.conjure = conjure;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }
}
