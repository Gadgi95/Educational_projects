public class ReverseArray {


    public static String[] reverse (String[] strings)
    {
        String a;

        for (int i = 0; i < strings.length / 2; i++) {

            a = strings[i];
            strings[i] = strings[strings.length - i - 1];
            strings[strings.length - i - 1] = a;
        }
        return strings;
    }
}
