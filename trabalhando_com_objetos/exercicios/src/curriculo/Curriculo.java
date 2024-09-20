package curriculo;

import java.util.Arrays;

public class Curriculo {

    public String nome = "Giuliana";
    public Integer idade = 27;

    public String [] competencias = {"Java"};
    public String [] experiencias = {"Instrutora Online", "Desenvolvedora"};

    public String sobreMim() {
        return "Olá, eu sou " + nome + ", trabalho com " + Arrays.toString(competencias) + ", e minhas experiências foram " + Arrays.toString(experiencias);
    }

}
