import java.util.ArrayList;

public class TodoList {

    ArrayList<String> Todo = new ArrayList<>();


    public void add(String todo)
    {
        Todo.add(todo);
    }

    public void add(int index, String todo) {
        if(index < Todo.size())
        {
            Todo.add(index, todo);
        }
        else
        {
            Todo.add(todo);
        }

        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
    }

    public void edit(String todo, int index) {
        if(index >= Todo.size())
        {
            System.out.println("Дело с таким номером не существует");
        }
        else
        {
            Todo.remove(index);
            Todo.add(index, todo);
        }

        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {
        if (index >= Todo.size())
        {
            System.out.println("Дело с таким номером не существует");
        }
        else
        {
            Todo.remove(index);
        }
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }

    public ArrayList<String> getTodos() {
        for (int i = 0; i < Todo.size(); i++) {
            System.out.println(Todo.get(i));
        }
        return Todo;
    }

}