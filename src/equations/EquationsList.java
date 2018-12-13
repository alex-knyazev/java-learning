package equations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EquationsList {

    public static void main(String[]args) {
        List<SquareEquation> squareEquations;
        squareEquations = new ArrayList<>();

        List<ParabolicEquation> parabolicEquations;
        parabolicEquations = new ArrayList<>();



        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int A = random.nextInt(100);
            int B = random.nextInt(100);
            int C = random.nextInt(100);
            SquareEquation squareEquation = new SquareEquation(A, B, C);
            squareEquation.solve();
            squareEquations.add(squareEquation);
        }

        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int A = random.nextInt(100);
            ParabolicEquation parabolicEquation = new ParabolicEquation(A);
            parabolicEquation.solve();
            parabolicEquations.add(parabolicEquation);
        }


        for (int i = 0; i < squareEquations.size(); i++) {
            SquareEquation squareEquation = squareEquations.get(i);
            System.out.println("Для коэффициентов " + Arrays.toString(squareEquation.getCoeffs()));
            double[] answer = squareEquation.getAnswer();
            System.out.println("x1 и x2: " + answer[0] + " : " + answer[1]);
        }

        for (int i = 0; i < parabolicEquations.size(); i++) {
            ParabolicEquation parabolicEquation = parabolicEquations.get(i);
            System.out.println("Для коэффициентов " + Arrays.toString(parabolicEquation.getCoeffs()));
            double[] answer = parabolicEquation.getAnswer();
            System.out.println("x1 и x2: " + answer[0] + " : " + answer[1]);
        }


//        SquareEquation squareEquation = new SquareEquation(2,3,4);
//        squareEquation.solve();
//
//
//        double[] answer = squareEquation.getAnswer();
//        System.out.println("Для коэффициентов " + Arrays.toString(squareEquation.getCoeffs()));
//
//        System.out.println("x1 и x2: " + answer[0] + " : " + answer[1]);
//
//        System.out.println("Уравнение приведенное?  " +  squareEquation.isReducedEquation());
//        System.out.println("Уравнение полное?  " +  squareEquation.isFullEquation());
    }
}

