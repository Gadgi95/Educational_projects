import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    /*Опишите алгоритм разбиения массива длины N на k подмассивов так,
    чтобы размер самого длинного и самого короткого подмассива отличалась не больше чем на 1
    Чему будут равны длины подмассивов?
    Может ли k быть больше длины N? */

    public static void main(String[] args) throws IOException {
        System.out.println("Введите число N - длинну массива");
        BufferedReader readerN = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(readerN.readLine());

        System.out.println("Введите число k - кол-во подмассивов");
        BufferedReader readerK = new BufferedReader(new InputStreamReader(System.in));
        int k =Integer.parseInt(readerK.readLine());

        if(N < k) {
            System.out.println("Кол-во подмассивов не может быть больше кол-ва элементов массива");
        }

        int[] m = new int[N];
        int division = N/k;
        int remainderOfDivision = N % k;

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < k; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < division; j++) {
                list.get(i).add(m[i]);
            }
        }

        if(remainderOfDivision != 0) {
            for (int i = 0; i < remainderOfDivision; i++) {
                list.get(i).add(m[m.length - (i+1)]);
            }
        }
    }
}
