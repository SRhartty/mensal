package org.example;

public class Menu {

    public void renderProduto() {
        System.out.println(
                """
                        ||========================================||
                        ||Sistema gerenciador de estock uniamerica||
                        ||========================================||
                        ||1 - Cadastrar produto                   ||
                        ||2 - Listar produtos                     ||
                        ||3 - Buscar por nome                     ||
                        ||4 - Deletar produto                     ||
                        ||5 - Atualizar produto                   ||
                        ||6 - Sair                                ||
                        ||========================================||
                        """);
    }
}
