package subclasses;

import entities.Data;
import entities.Endereco;
import entities.Loja;
import entities.Produto;

public class Cosmetico extends Loja {
    private double taxaComercialização;

    public Cosmetico(double taxaComercialização) {
        this.taxaComercialização = taxaComercialização;
    }

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, Produto[] estoqueProdutos, double taxaComercialização) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao, estoqueProdutos);
        this.taxaComercialização = taxaComercialização;
    }

    public Cosmetico(String nome, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao, Produto[] estoqueProdutos ,double taxaComercialização) {
        super(nome, quantidadeFuncionarios, enderecoLoja, dataFundacao, estoqueProdutos);
        this.taxaComercialização = taxaComercialização;
    }

    public double getTaxaComercialização() {
        return taxaComercialização;
    }

    public void setTaxaComercialização(double taxaComercialização) {
        this.taxaComercialização = taxaComercialização;
    }

    @Override
    public String toString(){
        return getNome()
               + " Taxa comercialição: "
               + taxaComercialização;
    }

}
