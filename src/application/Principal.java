package application;

import entities.*;

import java.time.LocalDate;
import java.util.Scanner;

public class
Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        Loja loja = null;
        Produto produto;

        while (opcao != 3) {
            System.out.println("Menu: ");
            System.out.println("1 - Criar uma loja ");
            System.out.println("2 - Criar um produto");
            System.out.println("3 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao != 1 && opcao != 2)
                System.out.println("Opção inválida");

              if (opcao == 1) {
                    System.out.println("nome da loja: ");
                    String nomeLoja = scanner.nextLine();
                    System.out.println("Quantidade funcionários: ");
                    int quantidadeFuncionarios = scanner.nextInt();
                    System.out.println("Salario base funcionario: ");
                    double salarioBaseFuncionario = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Rua: ");
                    String nomeDaRua = scanner.nextLine();
                    System.out.println("Cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.println("Estado: ");
                    String estado = scanner.nextLine();
                    System.out.println("País: ");
                    String pais = scanner.nextLine();
                    System.out.println("CEP: ");
                    String cep = scanner.nextLine();
                    System.out.println("Numero: ");
                    String numero = scanner.nextLine();
                    System.out.println("Complemento: ");
                    String complemento = scanner.nextLine();
                    Endereco enderecoLoja = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);

                    System.out.println("Data de fundação (dd/MM/aaaa): ");
                    String dataFundacaoString = scanner.nextLine();
                    String[] partes = dataFundacaoString.split("/");
                    int dia = Integer.parseInt(partes[0]);
                    int mes = Integer.parseInt(partes[1]);
                    int ano = Integer.parseInt(partes[2]);
                    Data dataFundacao = new Data(dia, mes, ano);

                    System.out.println("Quantidade máxima de produtos: ");
                    int maxProdutos = scanner.nextInt();
                    scanner.nextLine();

                    Produto[] estoqueProdutos = new Produto[maxProdutos];
                    loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao, estoqueProdutos);
                    loja.setEstoqueProdutos(estoqueProdutos);
                    System.out.println(loja);

                } else if (opcao == 2) {
                    System.out.println("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.println("Preço: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Data de validade dd/MM/yyyy");
                    String dataValidadeString = scanner.nextLine();
                    String[] partes = dataValidadeString.split("/");
                    int dia = Integer.parseInt(partes[0]);
                    int mes = Integer.parseInt(partes[1]);
                    int ano = Integer.parseInt(partes[2]);
                    Data dataValidade = new Data(dia, mes, ano);

                    Data dataAtual = new Data(20, 10, 2023);
                    produto = new Produto(nome, preco, dataValidade);
                    if (produto.estaVencido(dataAtual)) {
                        System.out.println("PRODUTO ESTÁ VENCIDO");
                    } else {
                        System.out.println("PRODUTO NÃO ESTÁ VENCIDO");
                    }
                    //Chamada método insereProduto
                    if (loja != null) {
                        Boolean produtoInserido = loja.insereProduto(produto);
                        if (produtoInserido) {
                            System.out.println("Produto inserido no estoque.");
                        } else {
                            System.out.println("Não foi possível inserir o produto no estoque. Estoque cheio.");
                        }
                    } else {
                        System.out.println("Nenhuma loja foi criada. Crie uma loja primeiro antes de inserir produtos.");
                    }

                    //Imprime produtos
                    loja.imprimeProdutos();

                    //Chamada método removeProduto
                    if (produto != null) {
                        System.out.println("Digite o nome do produto a ser removido: ");
                        String nomeProdutoRemover = scanner.nextLine();
                        boolean produtoRemovido = loja.removeProduto(nomeProdutoRemover);
                        if (produtoRemovido) {
                            System.out.println("Produto removido do estoque.");
                        } else {
                            System.out.println("Produto não encontrado no estoque.");
                        }
                    }
                }
        }
        scanner.close();
    }
}
