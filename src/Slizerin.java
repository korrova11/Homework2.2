public class Slizerin extends Hogwarts{
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
}
