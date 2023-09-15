public class Kogtervan extends Hogwarts {
    private int smartness;//умность
    private int wisdom;//мудрость
    private int wit;//остроумие
    private int creative;//творческий



    public Kogtervan(String name,int conjure, int transgress, int smartness, int wisdom, int wit,int creative) {
        super(name,conjure, transgress);
        this.smartness = smartness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative=creative;
    }

    public int getSmartness() {
        return smartness;
    }

    public void setSmartness(int smartness) {
        this.smartness = smartness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
    public void print(Kogtervan[] kogtervans) {
        System.out.println("Студенты факультета Когтевран");
        for (int i = 0; i < kogtervans.length; i++) {
            Kogtervan kogtervan = kogtervans[i];
            System.out.println(kogtervan.getName() + ", сила магии " + kogtervan.getConjure()
                    + ", расстояние трансгрессии " + kogtervan.getTransgress() + ". Свойства характера: умность "
                    + kogtervan.getSmartness() + ", мудрость " + kogtervan.getWisdom() + ", остроумие " + kogtervan.getWit()
                    + " , творчество " + kogtervan.getCreative());
        }

    }
    public void printCompareFacult( Kogtervan[] kogtervans,String name1,String name2){
        int power1=0,power2=0;
        int k1=0,k2=0;

        for (int i = 0; i < kogtervans.length; i++) {

            if (kogtervans[i].getName().equals(name1)) {
                power1 = kogtervans[i].getSmartness() + kogtervans[i].getCreative() + kogtervans[i].getWit()
                        +kogtervans[i].getWisdom();
                k1 = i;
            }
            if (kogtervans[i].getName().equals(name2)) {
                power2 = kogtervans[i].getSmartness() + kogtervans[i].getCreative() + kogtervans[i].getWit()
                        +kogtervans[i].getWisdom();
                k2 = i;
            }
        }
        if (power1>power2) {
            System.out.println(kogtervans[k1].getName() + " лучший Когтевранец, чем " +
                    kogtervans[k2].getName());
        } else if (power2>power1) {
            System.out.println(kogtervans[k2].getName() + " лучший Когтевранец, чем " +
                    kogtervans[k1].getName());
        }
        else System.out.println("Силы равны");


    }
}
