package subclasses;

import entities.Data;
import entities.Endereco;
import entities.Loja;
import entities.Produto;

public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, Produto[] estoqueProdutos , boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao, estoqueProdutos);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao, Produto[] estoqueProdutos,boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, enderecoLoja, dataFundacao, estoqueProdutos);
        this.produtosImportados = produtosImportados;
    }

    public boolean isProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString(){
        return getNome()
                + " Produto importado : "
                + produtosImportados;
    }
}
