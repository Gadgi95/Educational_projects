public class Main
{

    public static void main(String[] args)
    {
        int size = 7;
        char[][] twoDimensionalArray = TwoDimensionalArray.getTwoDimensionalArray(size);
        for (char[] printTwoDimensionalArray : twoDimensionalArray) {
            System.out.println(printTwoDimensionalArray);
        }
    }
}
