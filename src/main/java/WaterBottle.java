public class WaterBottle {
    private String name;
    private int volume;

    public WaterBottle(String name, int volume){
        this.name = name;
        this.volume = 100;
    }
    public String getName(){
        return this.name;
    }

    public int getStartingVolume() {
        return this.volume;
    }
}
