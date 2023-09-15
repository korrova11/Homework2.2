public class Hogwarts {
    private String name;
    private int conjure;//свойство колдовать
    private int transgress;//свойство трансгрессировать



    public Hogwarts(String name, int conjure, int transgress) {
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
    public void print(Hogwarts[] hogwarts) {
        System.out.println("Студенты Хогвартса:");
        for (int i = 0; i < hogwarts.length; i++) {
            Hogwarts hogwart = hogwarts[i];
            System.out.println(hogwart.getName() + ", сила магии " + hogwart.getConjure()
                    + ", расстояние трансгрессии " + hogwart.getTransgress());

        }
    }

    public void printCompare(Hogwarts[] hogwarts, String name1, String name2) {

        int power1 = 0, power2 = 0;
        int k1 = 0, k2 = 0;

        for (int i = 0; i < hogwarts.length; i++) {

            if (hogwarts[i].getName().equals(name1)) {
                power1 = hogwarts[i].getConjure() + hogwarts[i].getTransgress();
                k1 = i;
            }
            if (hogwarts[i].getName().equals(name2)) {
                power2 = hogwarts[i].getConjure() + hogwarts[i].getTransgress();
                k2 = i;
            }
        }
        if (power1 > power2) {
            System.out.println(hogwarts[k1].getName() + " обладает большей мощностью магии, чем " +
                    hogwarts[k2].getName());
        } else if (power2 > power1) {
            System.out.println(hogwarts[k2].getName() + " обладает большей мощностью магии, чем " +
                    hogwarts[k1].getName());
        } else System.out.println("Силы равны");


    }

}
