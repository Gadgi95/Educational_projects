import java.sql.SQLOutput;

public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        char[][] twoDimensionalArray = new char[size][size];
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray.length; j++) {
                if (i == j || i + j == (size - 1)) {
                    twoDimensionalArray[i][j] = symbol;
                } else {
                    twoDimensionalArray[i][j] = ' ';
                }
            }
        }

        return twoDimensionalArray;
    }
}
