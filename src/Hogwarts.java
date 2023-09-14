public class Hogwarts {
    private String name;
    private int conjure;//свойство колдовать
    private int transgress;//свойство трансгрессировать

    public Hogwarts(String name,int conjure, int transgress) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
