package subclasses;

import entities.Data;
import entities.Endereco;
import entities.Loja;
import entities.Produto;

public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, Produto[] estoqueProdutos , Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao, estoqueProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao,Produto[] estoqueProdutos ,Data dataAlvara) {
        super(nome, quantidadeFuncionarios, enderecoLoja, dataFundacao, estoqueProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString(){
        return getNome()
                + " Data Alvara: "
                + dataAlvara;
    }
}
