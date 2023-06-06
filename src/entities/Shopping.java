package entities;


public class Shopping {
    private String nome;
    private Endereco endereco;
    private  Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaxLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLoja(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja lojaInserida) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = lojaInserida;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shopping: ").append(nome).append("\n");
        sb.append("Endereço: ").append(endereco).append("\n");
        sb.append("Lojas: ").append("\n");
        for (Loja loja : lojas) {
            if (loja != null) {
                sb.append(loja).append("\n");
            }
        }
        return sb.toString();
    }
}
