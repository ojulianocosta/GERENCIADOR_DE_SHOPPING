package entities;

public class Produto {
    private String nome;
    private double preco;
    private Data dataDeValidade;

    public Produto(String nome, double preco, Data dataDeValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(Data dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public boolean estaVencido(Data dataAtual) {
        if (this.dataDeValidade.getAno() < dataAtual.getAno()) {
            return true;
        } else if (this.dataDeValidade.getAno() == dataAtual.getAno()
                && this.dataDeValidade.getMes() < dataAtual.getMes()) {
            return true;
        } else if (this.dataDeValidade.getAno() == dataAtual.getAno()
                && this.dataDeValidade.getMes() == dataAtual.getMes()
                && this.dataDeValidade.getDia() < dataAtual.getDia()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return " Produto: "
                + nome
                + ", Preço: "
                + preco
                + ", Data de validade: "
                + dataDeValidade;
    }
}

