import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class CoolNumbers {

    public static final String LETTERS = "АВЕКМНОРСТУХ";
    static ArrayList<String> coolNumbersList;
    static ArrayList<String> coolNumbersListWithoutRegion;
    static ArrayList<Character> allowedLetters;
    static String  numberplate;
    static String numberplateWithoutRegion;
    static String numberFound = "номер найден";
    static String numberNotFound = "номер не найден";
    static boolean search = false;


    public static List<String> generateCoolNumbers()
    {
        allowedLetters = new ArrayList<>();
        coolNumbersListWithoutRegion = new ArrayList<>();
        coolNumbersList = new ArrayList<>();
        for (int i = 0; i < LETTERS.length(); i++) {
            allowedLetters.add(LETTERS.charAt(i));
        }
        for(Character firstLetter : allowedLetters){
            char firstLetterChar = firstLetter;
            for (int n = 0; n < 10; n++){
                for (Character secondLetter : allowedLetters){
                    char secondLetterChar = secondLetter;
                    for(Character thirdLetter : allowedLetters){
                        char thirdLetterChar = thirdLetter;
                        numberplateWithoutRegion = String.format("%c%d%d%d%c%c", firstLetterChar, n, n, n,
                            secondLetterChar, thirdLetterChar);
                        coolNumbersListWithoutRegion.add(numberplateWithoutRegion);
                    }
                }
            }
        }
        for (String numberWithoutRegion : coolNumbersListWithoutRegion) {
            if (coolNumbersList.size() < 2000000) {
                for (int j = 1; j < 200; j++) {
                    if (j < 10) {
                        numberplate = String.format("%s0%d", numberWithoutRegion, j);
                    } else {
                        numberplate = String.format("%s%d", numberWithoutRegion, j);
                    }
                    coolNumbersList.add(numberplate);
                }
            }
        }
        return coolNumbersList;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number)
    {
        long start = System.currentTimeMillis();
        //begin code
        for (String s : list) {
            if (s.equalsIgnoreCase(number))
            {
                search = true;
                System.out.print("Поиск перебором: " + numberFound);
                long finish = System.currentTimeMillis();
                long nsDelay = finish - start;
                System.out.println(", поиск занял " + nsDelay + "нс");
                break;
            }
            else
            {
                search = false;
                System.out.print("Поиск перебором: " + numberNotFound);
                long finish = System.currentTimeMillis();
                long nsDelay = finish - start;
                System.out.println(", поиск занял " + nsDelay + "нс");
            }
        }
        //end code
        return search;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number)
    {
        long start = System.currentTimeMillis();
        //begin code
        Collections.sort(sortedList);
        int resultBinarySearch = Collections.binarySearch(sortedList, number);
        if(resultBinarySearch >= 0)
        {
            search = true;
            System.out.print("Бинарный поиск: " + numberFound);
            long finish = System.currentTimeMillis();
            long nsDelay = finish - start;
            System.out.println(", поиск занял " + nsDelay + "нс");
        }
        else
        {
            search = false;
            System.out.print("Бинарный поиск: " + numberNotFound);
            long finish = System.currentTimeMillis();
            long nsDelay = finish - start;
            System.out.println(", поиск занял " + nsDelay + "нс");
        }
        //end code
        return search;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number)
    {
        long start = System.currentTimeMillis();
        //begin code
        for (String s : hashSet) {
            if (s.equalsIgnoreCase(number))
            {
                search = true;
                System.out.print("Поиск в HashSet: " + numberFound);
                long finish = System.currentTimeMillis();
                long nsDelay = finish - start;
                System.out.println(", поиск занял " + nsDelay + "нс");
                break;
            }
            else
            {
                search = false;
                System.out.print("Поиск в HashSet: " + numberNotFound);
                long finish = System.currentTimeMillis();
                long nsDelay = finish - start;
                System.out.println(", поиск занял " + nsDelay + "нс");
            }
        }

        //end code
        return search;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number)
    {
        long start = System.currentTimeMillis();
        //begin code
        for (String s : treeSet) {
            if (s.equalsIgnoreCase(number))
            {
                search = true;
                System.out.print("Поиск в TreeSet: " + numberFound);
                long finish = System.currentTimeMillis();
                long nsDelay = finish - start;
                System.out.println(", поиск занял " + nsDelay + "нс");
                break;
            }
            else
            {
                search = false;
                System.out.print("Поиск в TreeSet: " + numberNotFound);
                long finish = System.currentTimeMillis();
                long nsDelay = finish - start;
                System.out.println(", поиск занял " + nsDelay + "нс");
            }
        }
        //end code
        return search;
    }
}
