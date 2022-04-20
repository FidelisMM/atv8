package padocapetruqueo;

/*
    @author Matheus Medeiros Fidelis | 11211100176 - Renato Kishi Cardoso | 11221401522
 */
public class Faturamento {

    public static void main(String[] args) {
        double faturamento_total;

        Produto p1 = new Produto(1, "Pão", 0.90, 5);
        Produto p2 = new Produto(2, "Suco em Lata", 4.90, 2);
        Produto p3 = new Produto(3, "Refrigerante", 5.90, 1);
        Produto p4 = new Produto(4, "Pão de queijo", 3.90, 4);
        Produto p5 = new Produto(5, "Cigarro", 5.90, 2);

        p1.calcularTotal();
        p2.calcularTotal();
        p3.calcularTotal();
        p4.calcularTotal();
        p5.calcularTotal();

        p1.imprimir();
        p2.imprimir();
        p3.imprimir();
        p4.imprimir();
        p5.imprimir();

        faturamento_total = p1.getTotal_vendas() + p2.getTotal_vendas()
                + p3.getTotal_vendas() + p4.getTotal_vendas() + p5.getTotal_vendas();

        System.out.printf("Total do pedido: R$ %5.2f%n", faturamento_total);
    }
}
