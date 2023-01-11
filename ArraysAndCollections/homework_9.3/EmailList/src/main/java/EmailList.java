import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class EmailList {
    Set<String> emailList = new TreeSet<String>() {};


    public void add(String email) {
        String VALID_EMAIL_ADDRESS_REGEX = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";

        if(email.matches((VALID_EMAIL_ADDRESS_REGEX))){
            emailList.add(email.toLowerCase(Locale.ROOT));
        }
        else {
            System.out.println("Неверный формат email");
        }
    }

    public List<String> getSortedEmails() {
        return new ArrayList<>(emailList);
    }

    public void printList() {
        System.out.println();
    }
}
