package subclasses;

import entities.Data;
import entities.Endereco;
import entities.Loja;
import entities.Produto;

public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, Produto[] estoqueProdutos , double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao, estoqueProdutos);
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao, Produto[] estoqueProdutos  ,double metaVendas) {
        super(nome, quantidadeFuncionarios, enderecoLoja, dataFundacao, estoqueProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString(){
        return getNome()
                + " Meta vendas: "
                + metaVendas;
    }
}
