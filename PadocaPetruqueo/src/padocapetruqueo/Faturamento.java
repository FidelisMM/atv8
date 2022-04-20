package padocapetruqueo;

/*
    @author Matheus Medeiros Fidelis | 11211100176 - Renato Kishi Cardoso | 11221401522
 */
public class Faturamento {

    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Pão", 0.90, 5);
        Produto produto2 = new Produto(2, "Suco em Lata", 4.90, 2);
        Produto produto3 = new Produto(3, "Refrigerante", 5.90, 1);
        Produto produto4 = new Produto(4, "Pão de queijo", 3.90, 4);
        Produto produto5 = new Produto(5, "Cigarro", 5.90, 2);
        Produto produto6 = new Produto(6, "Bala", 0.10, 18);

        produto1.calcularTotal();
        produto2.calcularTotal();
        produto3.calcularTotal();
        produto4.calcularTotal();
        produto5.calcularTotal();
        produto6.calcularTotal();

        produto1.imprimir();
        produto2.imprimir();
        produto3.imprimir();
        produto4.imprimir();
        produto5.imprimir();
        produto6.imprimir();
    }
}
