package equations;

public class SquareEquation {
    private double A;
    private double B;
    private double C;
    private double[] answer;

    public SquareEquation(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }


    public SquareEquation(double A, double B) {
        this.A = A;
        this.B = B;
        this.C = 0;
    }

    public SquareEquation(double A) {
        this.A = A;
        this.B = 0;
        this.C = 0;
    }


    public void solve() {
        double discriminant = Math.pow(this.B, 2) + 4 * this.A * this.C;
        double x1 = -1 * this.B + Math.sqrt(discriminant);
        double x2 = -1 * this.B + Math.sqrt(discriminant);
        double[] result = {x1, x2};
        this.answer = result;
    }

    public double[] getCoeffs() {
        double[] result = { this.A, this.B, this.C };
        return result;
    }

    public double[] getAnswer() {
        return this.answer;
    }

    public boolean isReducedEquation() {
        return this.A == 1;
    }

    public  boolean isFullEquation() {
        return this.B != 0 && this.C !=0;
    }

}

