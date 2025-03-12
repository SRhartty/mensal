package org.example.menu;

public class Menu {

    public void mainMenu() {
        System.out.println(
                """
                        ||========================================||
                        ||Sistema gerenciador de estock uniamerica||
                        ||========================================||
                        ||1 - Produtos                            ||
                        ||2 - Usuários                            ||
                        ||3 - Pdv                                 ||
                        ||4 - Sair                                ||
                        ||========================================||
                        """
        );
    }

    public void renderProducts() {
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
                        ||6 - Voltar                              ||
                        ||========================================||
                        """);
    }
}
