package list;

public class Todo {

    private String titulo;
    private Boolean concluida;

    public Todo(String titulo) {
        this.titulo = titulo;
        this.concluida = false;
    }

    public void concluir() {
        this.concluida = true;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Boolean isConcluida() {
        return this.concluida;
    }

    public boolean equals(Object todo) {
        return this.titulo.equals(((Todo) todo).getTitulo());
    }
}
