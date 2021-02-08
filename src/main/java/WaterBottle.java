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

    public int getVolume() {
        return this.volume;
    }

    public void drink() {
        if (this.volume >= 10){
            this.volume -= 10;
        }
    }

    public void empty() {
        this.volume = 0;
    }

    public void refill() {
        if (this.volume < 100){
            this.volume = 100;
        }
    }
}
