import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TodoList {

    private List<Todo> todos;

    public TodoList() {
        this.todos = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        Todo todo = new Todo(tarefa);

        if (!todos.contains(todo)) {
            todos.add(todo);
        }
    }

    public void concluirTarefa(String tarefa) {
        for (Todo todo : todos) {
            if (todo.getTitulo().equals(tarefa)) {
                todo.concluir();
            }
        }
    }

    public void removerTarefa(String tarefa) {
        Iterator<Todo> it = this.todos.iterator();

        while (it.hasNext()) {
            Todo todo = it.next();

            if (todo.getTitulo().equals(tarefa)) {
                it.remove();
            }
        }
    }

    public String toString() {
    StringBuilder builder = new StringBuilder();

        for(Todo todo : todos) {

            if(todo.isConcluida()) {
                builder.append("[x] ");
            } else {
                builder.append("[ ] ");
            }

            builder.append(todo.getTitulo());
            builder.append("\n");

        }

        return builder.toString();

    }

}
