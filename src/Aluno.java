import java.util.ArrayList;

public class Aluno extends Pessoa{
    private double[] notas;
    private Curso curso;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public void setNota(Disciplina disciplina, double nota) {
        disciplina.setNota(this, nota);
    }
    public double getNota(Disciplina disciplina){
        return disciplina.getNota(this);
    }



    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;

    }

    public void addDisciplinas(Disciplina disciplina){
        disciplinas.add(disciplina);
    }


    public void imprimir(){
        System.out.println("Nome do aluno: "+getNome()+", CPF: "+getCpf()+", email: "+getEmail());
        System.out.println("Telefones:");
        for (Telefone telefone : getTelefones()) {
            System.out.println("  - Tipo: " + telefone.getTipo() + ", DDD: " + telefone.getDdd() + ", Número: " + telefone.getNumero());
        }
        System.out.println( "Endereço:"+" \n  - Estado: "+getEndereco().getEstado()+
                ", Cidade: "+getEndereco().getCidade()+", Rua: "+getEndereco().getRua());

        System.out.println(" ");

        System.out.println("Curso atual: "+getCurso().getNome());
        System.out.println("Nota do aluno em cada disciplina: ");
        for (Disciplina disciplina : getCurso().getDisciplinas()) {
            System.out.println("- " + disciplina.getNome()+": Nota = "+getNota(disciplina));
        }

        System.out.println(" ");
        System.out.println("==========================================================");
    } 
}
    