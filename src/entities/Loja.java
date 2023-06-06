package entities;

import org.w3c.dom.ls.LSOutput;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco enderecoLoja;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    public Loja(){}

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, Produto[] estoqueProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = estoqueProdutos;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao,Produto[] estoqueProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        salarioBaseFuncionario = -1;
        this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = estoqueProdutos;
    }
    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEnderecoLoja() {
        return enderecoLoja;
    }

    public void setEnderecoLoja(Endereco enderecoLoja) {
        this.enderecoLoja = enderecoLoja;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    //METÓDO ETAPA 4 - IMPRIME PRODUTOS
    public void imprimeProdutos(){
        System.out.println("Produtos da loja:");
        for (Produto produto : estoqueProdutos) {
            System.out.println(produto);
        }
    }
    //METÓDO ETAPA 4 - INSERE PRODUTOS
    public boolean insereProduto(Produto produto){
        for(int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] == null){
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto){
        for(int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    public double gastosComSalario(){
        if (salarioBaseFuncionario == -1){
            return -1;
        }
        else {
            return salarioBaseFuncionario * quantidadeFuncionarios;
        }
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 0) {
            return '?';
        } else if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }

    }

    public String toString(){
        return "Informações lojas: "
                + "Loja: "
                + nome
                + ", Quantidade funcionários: "
                + quantidadeFuncionarios
                + ", Salario base: "
                + String.format ("%.2f", salarioBaseFuncionario)
                + enderecoLoja
                + ", Data fundação: "
                + dataFundacao
                + ", Total gastos salario: "
                + String.format ("%.2f", gastosComSalario())
                + ", Tamanho da loja: "
                + tamanhoDaLoja();
    }
}