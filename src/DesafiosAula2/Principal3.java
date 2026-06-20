package DesafiosAula2;
// Testando Produto
public class Principal3 {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Notebook");
        produto.setPreco(3000);

        System.out.println("Preço original: R$ " + produto.getPreco());

        produto.aplicarDesconto(10);

        System.out.println("Preço com desconto: R$ " + produto.getPreco());
    }
}
