public class Calculator {
    private String name;

    public Calculator(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double add(double a, double b){
        return a += b;
    }

    public int subtract(int a, int b){
        return a -= b;
    }

    public double multiply(int i, int i1) {
        return  i *= i1;
    }

    public double divide(int i, int i1) {
        return i /= i1;
    }
}
