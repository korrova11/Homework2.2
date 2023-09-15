public class Pooffendy extends Hogwarts {
    private int industriousness;//трудолюбие
    private int loyalty;//верность
    private int honesty;//честность

    public Pooffendy(String name,int conjure, int transgress, int industriousness, int loyalty, int honesty) {
        super(name,conjure, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
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
}
