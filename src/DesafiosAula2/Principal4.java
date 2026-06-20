package DesafiosAula2;
// Testando Aluno
public class Principal4 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Gustavo");
        aluno.setNota1(8.5);
        aluno.setNota2(7.5);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Média: " + aluno.calcularMedia());
    }
}
