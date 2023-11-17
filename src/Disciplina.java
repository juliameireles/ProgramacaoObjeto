import java.util.ArrayList;
import java.util.HashMap;

public class Disciplina {
    private String nome;
    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private HashMap<Aluno, Double> notas = new HashMap<>(); 

    public void setNota(Aluno aluno, double nota) {
        notas.put(aluno, nota);
    }
    public double getNota(Aluno aluno) {
        return notas.getOrDefault(aluno, -1.0); 
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void addCursos(Curso curso){
        curso.addDisciplinas(this);
        cursos.add(curso);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void addAlunos(Aluno aluno){
        alunos.add(aluno);
    }

}