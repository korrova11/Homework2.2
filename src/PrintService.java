public class PrintService {
    public void print(Hogwarts[] hogwarts) {
        System.out.println("Студенты Хогвартса:");
        for (int i = 0; i < hogwarts.length; i++) {
            Hogwarts hogwart = hogwarts[i];
            System.out.println(hogwart.getName() + ", сила магии " + hogwart.getConjure()
                    + ", расстояние трансгрессии " + hogwart.getTransgress());

        }
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

    public void print(Pooffendy[] pooffendies) {
        System.out.println("Студенты факультета Пуффендуй");
        for (int i = 0; i < pooffendies.length; i++) {
            Pooffendy pooffendy = pooffendies[i];
            System.out.println(pooffendy.getName() + ", сила магии " + pooffendy.getConjure()
                    + ", расстояние трансгрессии " + pooffendy.getTransgress() + ". Свойства характера: трудолюбие "
                    + pooffendy.getIndustriousness() + ", верность " + pooffendy.getLoyalty() + ", честность " + pooffendy.getHonesty());

        }
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
    public void print(Slizerin[] slizerins) {
        System.out.println("Студенты факультета Слизерин");
        for (int i = 0; i < slizerins.length; i++) {
            Slizerin slizerin = slizerins[i];
            System.out.println(slizerin.getName() + ", сила магии " + slizerin.getConjure()
                    + ", расстояние трансгрессии " + slizerin.getTransgress() + ". Свойства характера: хитрость "
                    + slizerin.getTrick() + ", решительность " + slizerin.getResolute() + ", амбициозность " + slizerin.getAmbitious()
                    + " ,находчивость " + slizerin.getResourceful() +", жажда власти "+slizerin.getLustForPower());
        }

    }
    //сравнение сил на факультете
    public void printCompareFacult( Griffindor[] griffindors,String name1,String name2){
        int power1=0,power2=0;
        int k1=0,k2=0;

        for (int i = 0; i < griffindors.length; i++) {
            //  Griffindor griffindor = griffindors[i];
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
    public void printCompareFacult( Pooffendy[] pooffendies,String name1,String name2){
        int power1=0,power2=0;
        int k1=0,k2=0;

        for (int i = 0; i < pooffendies.length; i++) {

            if (pooffendies[i].getName().equals(name1)) {
                power1 = pooffendies[i].getIndustriousness() + pooffendies[i].getLoyalty() + pooffendies[i].getHonesty();
                k1 = i;
            }
            if (pooffendies[i].getName().equals(name2)) {
                power2 = pooffendies[i].getIndustriousness() + pooffendies[i].getLoyalty() + pooffendies[i].getHonesty();
                k2 = i;
            }
        }
        if (power1>power2) {
            System.out.println(pooffendies[k1].getName() + " лучший Пуффендуец, чем " +
                    pooffendies[k2].getName());
        } else if (power2>power1) {
            System.out.println(pooffendies[k2].getName() + " лучший Пуффендуец, чем " +
                    pooffendies[k1].getName());
        }
        else System.out.println("Силы равны");


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
    public void printCompareFacult( Slizerin[] slizerins,String name1,String name2){
        int power1=0,power2=0;
        int k1=0,k2=0;

        for (int i = 0; i < slizerins.length; i++) {

            if (slizerins[i].getName().equals(name1)) {
                power1 = slizerins[i].getLustForPower() + slizerins[i].getResourceful() + slizerins[i].getTrick()
                        +slizerins[i].getResolute()+slizerins[i].getAmbitious();
                k1 = i;
            }
            if (slizerins[i].getName().equals(name2)) {
                power2 = slizerins[i].getLustForPower() + slizerins[i].getResourceful() + slizerins[i].getTrick()
                        +slizerins[i].getResolute()+slizerins[i].getAmbitious();
                k2 = i;
            }
        }
        if (power1>power2) {
            System.out.println(slizerins[k1].getName() + " лучший Слизеринец, чем " +
                    slizerins[k2].getName());
        } else if (power2>power1) {
            System.out.println(slizerins[k2].getName() + " лучший Слизеринец, чем " +
                    slizerins[k1].getName());
        }
        else System.out.println("Силы равны");


    }
    public void printCompare( Hogwarts[] hogwarts,String name1,String name2){

        int power1=0,power2=0;
        int k1=0,k2=0;

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
        if (power1>power2) {
            System.out.println(hogwarts[k1].getName() + " большей мощностью магии, чем " +
                    hogwarts[k2].getName());
        } else if (power2>power1) {
            System.out.println(hogwarts[k2].getName() + " большей мощностью магии, чем " +
                    hogwarts[k1].getName());
        }
        else System.out.println("Силы равны");


    }





}



