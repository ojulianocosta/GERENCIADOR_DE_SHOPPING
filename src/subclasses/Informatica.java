package subclasses;

import entities.Data;
import entities.Endereco;
import entities.Loja;
import entities.Produto;

public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, Produto[] estoqueProdutos, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao, estoqueProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao, Produto[] estoqueProdutos ,double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, enderecoLoja, dataFundacao, estoqueProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }
    @Override
    public String toString(){
        return getNome()
                + " Seguro eletrônicos: "
                + seguroEletronicos;
    }
}
