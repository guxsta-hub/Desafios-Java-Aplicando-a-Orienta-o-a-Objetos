package DesafiosAula2;
// Testando IdadePessoa
public class Principal2 {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setNome("Gustavo");
        pessoa.setIdade(16);

        pessoa.verificarIdade();
    }
}
