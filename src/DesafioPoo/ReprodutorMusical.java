package DesafioPoo;

public interface ReprodutorMusical {
  default void tocar() {
    System.out.println("Tocando");
  }

  default void pausar() {
    System.out.println("Muscia pausado");
  }

  default void selecionarMusica() {
    System.out.println("Musica selecionada");
  }
}
