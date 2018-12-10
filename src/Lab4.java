import java.util.Arrays;

public class Lab4 {
    public static void main(String[]args) {
        SquareEquation squareEquation = new SquareEquation(2,3,4);
        squareEquation.solve();
        double[] answer = squareEquation.getAnswer();
        System.out.println("Для коэффициентов " + Arrays.toString(squareEquation.getCoeffs()));

        System.out.println("x1 и x2: " + answer[0] + " : " + answer[1]);

        System.out.println("Уравнение приведенное?  " +  squareEquation.isReducedEquation());
        System.out.println("Уравнение полное?  " +  squareEquation.isFullEquation());
    }
}
