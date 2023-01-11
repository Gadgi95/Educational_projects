import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {

    TreeMap<String, String> phoneBook = new TreeMap<>();
    Set<String> newPhoneBook;
    private final String CONTACT_SAVED = "Контакт сохранен";
    private final String ERROR = "Неверный формат ввода";
    private final String PHONE_REGEX = "^[\\d+]{11}";
    private final String NAME_REGEX = "^[А-Я[а-я]\\s]+";


    public void addContact(String phone, String name)
    {
        // проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента
        if(phone.matches(PHONE_REGEX) && name.matches(NAME_REGEX))
        {
            if(phoneBook.containsValue(phone))
            {
                for (Map.Entry<String, String> pair : phoneBook.entrySet())
                {
                    String value = pair.getValue();
                    String key = pair.getKey();
                    if(phone.equalsIgnoreCase(key))
                    {
                        phoneBook.remove(key);
                    }
                }
            }
            phoneBook.put(phone, name);
            System.out.println(CONTACT_SAVED);
        }
        else
        {
            System.out.println(ERROR);
        }
    }

    public String getNameByPhone(String phone)
    {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        if(!phone.matches(PHONE_REGEX))
        {
            System.out.println(ERROR);
        }
        else if (!phoneBook.containsKey(phone)) {
            return "";
        }
        else
            for (Map.Entry<String, String> pair : phoneBook.entrySet())
            {
                String value = pair.getValue();
                String key = pair.getKey();
                if(phone.equalsIgnoreCase(key)) {
                    return value + " - " + key;
                }
            }
        return "";
    }

    public Set<String> getPhonesByName(String name)
    {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        newPhoneBook = new TreeSet<>();
        if(!name.matches(NAME_REGEX))
        {
            System.out.println(ERROR);
        }
        else if(phoneBook.containsValue(name))
        {
            for (Map.Entry<String, String> pair : phoneBook.entrySet()) {
                String value = pair.getValue();
                String key = pair.getKey();
                if(name.equalsIgnoreCase(value))
                {
                    newPhoneBook.add(value + " - " + key);
                }
            }
        }
        return newPhoneBook;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        newPhoneBook = new TreeSet<>();
        if (!phoneBook.isEmpty())
        {
            for (Map.Entry<String, String> pair : phoneBook.entrySet())
            {
                String value = pair.getValue();
                String key = pair.getKey();
                newPhoneBook.add(value + " - " + key);
            }
        }
        return newPhoneBook;
    }
}
