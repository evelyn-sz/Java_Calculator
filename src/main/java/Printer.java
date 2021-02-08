public class Printer {
    private String name;
    private int sheets;
    private int tonerLevel;

    public Printer(String name, int sheets, int tonerLevel){
        this.name = name;
        this.sheets = sheets;
        this.tonerLevel = tonerLevel;
    }

    public String getName(){
        return this.name;
    }

    public int getSheetsLeft() {
        return this.sheets;
    }

    public void print(int numberOfPages, int duplicates){
        int total = numberOfPages *= duplicates;

        if (tonerLevel == 0){
            System.out.println("Ink empty, please refill");
        }
        if(sheets == 0){
            System.out.println("Paper tray empty, please refill");
        }
        if (this.sheets >= total && tonerLevel >= total){
            this.sheets -= total;
            this.tonerLevel -= total;
        }
    }
}
