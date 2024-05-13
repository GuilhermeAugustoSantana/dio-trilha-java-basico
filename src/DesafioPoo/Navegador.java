package DesafioPoo;

public interface Navegador {
  default void exibirPagina() {
    System.out.println("Exibindo Página");
  }

  default void adicionarNovaAba() {
    System.out.println("Nova aba adicionada");
  }

  default void atualizarPagina() {
    System.out.println("Pagina atualizada");
  }
}
