import java.util.ArrayList;

public class Professor extends Pessoa { 
    private String titulacao;
    private double salario;
   
    private ArrayList<Curso> cursos = new ArrayList<>();
    private Disciplina disciplina;


    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Disciplina getDisciplina(){
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }

    public ArrayList<Curso> getCursos(){
        return cursos;
    }

    public void addCursos(Curso curso){
        curso.addProfessor(this);
        cursos.add(curso);
    }

    public void imprimir(){
        System.out.println("Nome do professor: "+getNome()+", CPF: "+getCpf()+", email: "+getEmail()+
                            "\nSalário: "+getSalario()+", Titulação: "+getTitulacao());

        System.out.println("Telefones:");
        for (Telefone telefone : getTelefones()) {
            System.out.println("  - Tipo: " + telefone.getTipo() + ", DDD: " + telefone.getDdd() + ", Número: " + telefone.getNumero());
        }

        System.out.println("Endereço:"+
                            "\n  - Estado: "+getEndereco().getEstado()+", Cidade: "+getEndereco().getCidade()+", Rua: "+getEndereco().getRua());

        System.out.println(" ");

        if (disciplina != null) {
            System.out.println("Disciplina Ministrada: " + disciplina.getNome());
        } else {
            System.out.println("Nenhuma disciplina ministrada pelo professor.");
        }

        System.out.println("Cursos associados:");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("  - " + cursos.get(i).getNome());
        }

        System.out.println(" ");
        System.out.println("==========================================================");
    }

   
}
