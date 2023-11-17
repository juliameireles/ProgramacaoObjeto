public class Main {
    
    public static void main(String[] args) {
        Telefone t1 = new Telefone();
        Telefone t2 = new Telefone();
        Telefone t3 = new Telefone();
        Telefone t4 = new Telefone();
        Telefone t5 = new Telefone();
        Telefone t6 = new Telefone ();
        t1.setTipo("celular");
        t2.setTipo("celular");
        t3.setTipo("celular");
        t4.setTipo("celular");
        t5.setTipo("celular");
        t6.setTipo("celular");
        t1.setDdd("61");
        t2.setDdd("62");
        t3.setDdd("21");
        t4.setDdd("67");
        t5.setDdd("22");
        t6.setDdd("74");
        t1.setNumero("91254-5258");
        t2.setNumero("96649-0999");
        t3.setNumero("9272-8105");
        t4.setNumero("3051-1801");
        t5.setNumero("7894-8934");
        t6.setNumero("3739-3728");
        

        Endereco end1 = new Endereco();
        Endereco end2 = new Endereco();
        Endereco end3 = new Endereco();
        Endereco end4 = new Endereco();
        Endereco end5 = new Endereco();
        end1.setEstado("SP");
        end1.setCidade("CAMPINAS");
        end1.setRua("Avenida Rio Verde");
        end2.setEstado("Rio de Janeiro");
        end2.setCidade("Niterói");
        end2.setRua("Avenida Pedro Filho");
        end3.setEstado("DF");
        end3.setCidade("Brasília");
        end3.setRua("Rua Monjolo");
        end4.setEstado("Mato Grosso do Sul");
        end4.setCidade("Campo Grande");
        end4.setRua("Maria das Dores");
        end5.setEstado("Bahia");
        end5.setCidade("Salvador");
        end5.setRua("Bom Viver");
        
        

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno ();
        a1.setNome("Aluno1");
        a2.setNome("Aluno2");
        a3.setNome("Aluno3");
        a4.setNome("Aluno4");
        a5.setNome("Aluno5");
        a1.setCpf("052-693-171-09");
        a2.setCpf("710-028-121-00");
        a3.setCpf("334-738-873-12");
        a4.setCpf("124-463-563-07");
        a5.setCpf("362-362-576-56");
        a1.setEmail("aluno1@gmail");
        a2.setEmail("aluno2@gmail");
        a3.setEmail("aluno3@gmail");
        a4.setEmail("aluno4@gmail");
        a5.setEmail("aluno5@gmail");
        a1.setEndereco(end3);
        a2.setEndereco(end2);
        a3.setEndereco(end4);
        a4.setEndereco(end4);
        a5.setEndereco(end5);



        Disciplina d1 = new Disciplina();
        Disciplina d2 = new Disciplina();
        Disciplina d3 = new Disciplina();
        Disciplina d4 = new Disciplina();
        d1.setNome("Estrutura de dados");
        d2.setNome("Algoritmos e programacao estruturada");
        d3.setNome("Programacao Orientada a Objetos");
        d4.setNome("Redes de Computadores");

        Curso c1 = new Curso();
        Curso c2 = new Curso();
        Curso c3 = new Curso();
        c1.setNome("Ciências da Computação");
        c2.setNome("ADS");
        c3.setNome("Engenharia de Software");

        Professor prof1 = new Professor();
        Professor prof2 = new Professor();
        Professor prof3 = new Professor();
        Professor prof4 = new Professor();
        Professor prof5 = new Professor();
        prof1.setNome("Professor1");
        prof1.setTitulacao("Especialista");
        prof1.setSalario(5500);
        prof2.setNome("Professor2");
        prof2.setTitulacao("Mestre");
        prof2.setSalario(7500);
        prof3.setNome("Professor3");
        prof3.setTitulacao("Especialista");
        prof3.setSalario(3500);
        prof4.setNome("Professor4");
        prof4.setTitulacao("Especialista");
        prof4.setSalario(4500);
        prof5.setNome("Professor5");
        prof5.setTitulacao("Mestre");
        prof5.setSalario(7500);
        
        
        prof1.setCpf("171-292-14-19");
        prof2.setCpf("534-071-166-97");
        prof3.setCpf("878-723-373-92");
        prof4.setCpf("124-073-197-96");
        prof5.setCpf("828-623-876-12");
        prof1.setEmail("professor1@gmail");
        prof2.setEmail("professor2@gmail");
        prof3.setEmail("professor3@gmail");
        prof4.setEmail("professor4@gmail");
        prof5.setEmail("professor5@gmail");
        prof1.setEndereco(end3);
        prof2.setEndereco(end2);
        prof3.setEndereco(end3);
        prof4.setEndereco(end4);
        prof5.setEndereco(end5);

        /// MUITAS DISCIPLINAS -- MUITOS CURSOS    
        d1.addCursos(c1); 
        d2.addCursos(c1);
        d3.addCursos(c3);
        d3.addCursos(c1);
        d4.addCursos(c1);
        d4.addCursos(c2);

        //UMA DISCIPLINA MUITOS PROFESSORES
        prof1.setDisciplina(d1);
        prof2.setDisciplina(d1);
        prof3.setDisciplina(d2);
        prof5.setDisciplina(d2);
        prof3.setDisciplina(d3);
        prof1.setDisciplina(d3);
        prof2.setDisciplina(d4);
        prof4.setDisciplina(d2);
        // PROFESSOR PODE TER VARIOS TELEFONES. TELEFONE PODE ESTAR ASSOCIADO A APENAS UM PROFESSOR
        prof1.addTelefone(t1);
        prof1.addTelefone(t2);
        prof2.addTelefone(t5);
        prof2.addTelefone(t3);
        prof3.addTelefone(t1);
        prof4.addTelefone(t4);
        prof5.addTelefone(t6);

        // MUITOS CURSOS -- MUITOS PROFESSORES
        prof1.addCursos(c1);
        prof2.addCursos(c1);
        prof3.addCursos(c1);
        prof2.addCursos(c2);
        prof2.addCursos(c3);
        prof3.addCursos(c2);
        prof5.addCursos(c2);
        prof1.addCursos(c3);
        prof4.addCursos(c3);
        
        

        //UM CURSO -- MUITOS ALUNOS
        a1.setCurso(c2);
        a2.setCurso(c1);
        a3.setCurso(c2);
        a4.setCurso(c1);
        a5.setCurso(c3);
        a1.setNota(d4,10); // aluno1 tirou 10 em Redes de Computadores
        a1.setNota(d2,8.5); // aluno1 tirou 8.5 em Algoritmos e programacao estruturada
        a2.setNota(d1,7.8); // aluno2 tirou 7.8 em Estrutura de Dados
        a2.setNota(d3,10);
        a2.setNota(d2,7.7); // aluno2 tirou 7.7 em  Algoritmos e programacao estruturada
        a3.setNota(d1,9); // aluno3 tirou 9 em Estrutura de dados e cursa ADS
        a3.setNota(d4, 6);
        a4.setNota(d4, 9.7); // aluno4 tirou 9.7 em Redes de Computadores e cursa Ciência da Computação
        a4.setNota(d1,9);
        a4.setNota(d2, 7);
        a5.setNota(d3,10); // aluno5 tirou 10 em  Programacao Orientada a objetos e cursa Engenharia de software
        
        
// UM ALUNO SE ASSOCIA A VARIOS TELEFONES. UM TELEFONE SE ASSOCIA A APENAS 1 ALUNO
        a1.addTelefone(t1);
        a1.addTelefone(t2);
        a2.addTelefone(t3);
        a2.addTelefone(t5);
        a3.addTelefone(t4);
        a4.addTelefone(t4);
        a5.addTelefone(t6);

        // IMPRIMIR CURSO
        c1.imprimirCurso();
        c2.imprimirCurso();
        c3.imprimirCurso();

        // IMPRIMIR ALUNO
        a1.imprimir();
        a2.imprimir();
        a3.imprimir();
        a4.imprimir();
        a5.imprimir();
        
        

        // IMPRIMIR PROFESSOR
        prof1.imprimir();
        prof2.imprimir();
        prof3.imprimir();
        prof4.imprimir();
        prof5.imprimir();
    }
}