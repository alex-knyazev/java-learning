public class Main {
    public static void main(String[] args) {
        double [][] polygon ={
                { 0,0 },
                { 2,4 },
                { 3,8 },
                { 1,3 },
                { 1,0 },
                {0,0 },

        };

        double summ = 0;
        for (int i=0; i < polygon.length -1; i++){
            double Xk = polygon[i][0];
            double Xk1 = polygon[i+1][0];
            double Yk = polygon[i][1];
            double Yk1 = polygon[i+1][1];
            double mult = (Xk + Xk1) * (Yk + Yk1);

            summ = summ + mult;
        }

        double square = summ / 2;

        System.out.println("Square of polygon is " + square);
    }
}
