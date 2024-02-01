package lesson13;

public class Main {
    public static void main(String[] args) {
        double[][] numbersForMatrixA = {
                {3, 5, 7, 8},
                {1, 3, 6, 8},
                {2, 4, 6, 8}
        };

        Matrix a = new Matrix(numbersForMatrixA);
        System.out.println(a.getRows());
        System.out.println(a.getColumns());
        System.out.println(a.getValueAt(-1, 10));
        System.out.println(a.getValueAt(1, 1));
        a.setValueAt(1, 1, 2);
        System.out.println(a.getValueAt(1, 1));

        double[][] numbersForMatrixB = {
                {1, 2, 5, 8},
                {5, 3, 6, 9},
                {2, 3, 4, 1}
        };
        Matrix b = new Matrix(numbersForMatrixB);
        Matrix c = (Matrix) a.add(b);
       c.printToConsole();

    }

}
