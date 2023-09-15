public class Slizerin extends Hogwarts{
    public int s;
    private int trick;//хитрость
    private int resolute;//решительность
    private int ambitious;//амбициозность
    private int resourceful;//находчивость
    private int lustForPower;//жажда власти

    public Slizerin(String name,int conjure, int transgress, int trick, int resolute, int ambitious, int resourceful, int lustForPower) {
        super( name,conjure, transgress);
        this.trick = trick;
        this.resolute = resolute;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getResolute() {
        return resolute;
    }

    public void setResolute(int resolute) {
        this.resolute = resolute;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public void setResourceful(int resourceful) {
        this.resourceful = resourceful;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    public static void print(Slizerin[] slizerins) {
        System.out.println("Студенты факультета Слизерин");
        for (int i = 0; i < slizerins.length; i++) {
            Slizerin slizerin = slizerins[i];
            System.out.println(slizerin.getName() + ", сила магии " + slizerin.getConjure()
                    + ", расстояние трансгрессии " + slizerin.getTransgress() + ". Свойства характера: хитрость "
                    + slizerin.getTrick() + ", решительность " + slizerin.getResolute() + ", амбициозность " + slizerin.getAmbitious()
                    + " ,находчивость " + slizerin.getResourceful() +", жажда власти "+slizerin.getLustForPower());
        }

    }
    public  void printCompareFacult( Slizerin[] slizerins,String name1,String name2){
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
}
