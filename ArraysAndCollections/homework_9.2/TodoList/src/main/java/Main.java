import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        String text;
        String command;
        String todo;
        int index;
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        if(text.indexOf(" ") != text.lastIndexOf(" "))
        {
            if(text.substring(0, 3).equalsIgnoreCase("ADD"))
            {
                command = text.substring(0, 3);
                todo = text.substring(4);

                if(Pattern.matches("\\d+", text.substring(4, 5)))
                {
                    index = Integer.parseInt(text.substring(4, 5));
                    todo = text.substring(6);
                }
            }
            else if (text.substring(0, 6).equalsIgnoreCase("DELETE"))
            {
                command = text.substring(0, text.indexOf(' '));
                index = Integer.parseInt(text.substring(text.indexOf(' ') + 1));
            }
            else if(text.substring(0, text.indexOf(' ')).equalsIgnoreCase("EDIT"))
            {
                command = text.substring(0, text.indexOf(' '));
                index = Integer.parseInt(text.substring(text.indexOf(' '), text.indexOf(' ')+1));
                todo = text.substring(text.indexOf(' ') + 1);
            }
        }
        else
        {
            command = text;
        }
    }
}
