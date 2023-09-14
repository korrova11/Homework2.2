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
}
