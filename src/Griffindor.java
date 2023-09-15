public class Griffindor extends Hogwarts {

    private int nobility;//благородство
    private int honor;//честь
    private int bravery;//храбрость

    public Griffindor (String name,int conjure, int transgress, int nobility, int honor, int bravery) {
        super(name,conjure, transgress);

        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public void print(Griffindor[] griffindors) {
        System.out.println("Студенты факультета Гриффиндор");
        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor = griffindors[i];
            System.out.println(griffindor.getName() + ", сила магии " + griffindor.getConjure()
                    + ", расстояние трансгрессии " + griffindor.getTransgress() + ". Свойства характера: благородство "
                    + griffindor.getNobility() + ", честь " + griffindor.getHonor() + ", храбрость " + griffindor.getBravery());

        }
    }
    public void printCompareFacult( Griffindor[] griffindors,String name1,String name2){
        int power1=0,power2=0;
        int k1=0,k2=0;

        for (int i = 0; i < griffindors.length; i++) {

            if (griffindors[i].getName().equals(name1)) {
                power1 = griffindors[i].getNobility() + griffindors[i].getHonor() + griffindors[i].getBravery();
                k1 = i;
            }
            if (griffindors[i].getName().equals(name2)) {
                power2 = griffindors[i].getNobility() + griffindors[i].getHonor() + griffindors[i].getBravery();
                k2 = i;
            }
        }
        if (power1>power2) {
            System.out.println(griffindors[k1].getName() + " лучший Гриффиндорец, чем " +
                    griffindors[k2].getName());
        } else if (power2>power1) {
            System.out.println(griffindors[k2].getName() + " лучший Гриффиндорец, чем " +
                    griffindors[k1].getName());
        }
        else System.out.println("Силы равны");


    }

}
