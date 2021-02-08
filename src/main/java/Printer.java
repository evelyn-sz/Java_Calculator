public class Printer {
    private String name;
    private int sheets;
    private int tonerVolume;

    public Printer(String name, int sheets){
        this.name = name;
        this.sheets = sheets;
        this.tonerVolume = tonerVolume;
    }

    public String getName(){
        return this.name;
    }

    public int getSheetsLeft() {
        return this.sheets;
    }

    public void print(int numberOfPages, int duplicates){
        int total = numberOfPages *= duplicates;
        if (this.sheets >= total){
            this.sheets -= total;
        }
    }
}
