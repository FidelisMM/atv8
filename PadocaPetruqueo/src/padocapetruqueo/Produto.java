package padocapetruqueo;

public class Produto {

    private int codigo;
    private String descricao;
    private double valor_unit;
    private int qtd_vendida;
    private double total_vendas;

    public Produto(int codigo, String descricao, double valor_unit, int qtd_vendida) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor_unit = valor_unit;
        this.qtd_vendida = qtd_vendida;
    }

    public void setCodigo() {
        this.codigo = codigo;
    }

    public void setDescricao() {
        this.descricao = descricao;
    }

    public void setValor_unit() {
        this.valor_unit = valor_unit;
    }

    public void setQtd_vendida() {
        this.qtd_vendida = qtd_vendida;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor_unit() {
        return valor_unit;
    }

    public int getQtd_unit() {
        return qtd_vendida;
    }

    public double getTotal_vendas() {
        return total_vendas;
    }

    public void calcularTotal() {
        total_vendas = qtd_vendida * valor_unit;
    }

    public void imprimir() {
        System.out.println("Código do produto: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println();
        System.out.println("Total: " + qtd_vendida + " X " + valor_unit + " = R$ " + total_vendas);
        System.out.println("-=-=-=-=-=-=-=-");
        System.out.println();
    }
}
