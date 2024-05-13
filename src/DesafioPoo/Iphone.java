package DesafioPoo;

public class Iphone implements Navegador, ReprodutorMusical, Telefone {
  public static void main(String[] args) {
    Iphone iphone4 = new Iphone();

    System.out.println("----- --Reprodutor Musical-- -----");
    iphone4.tocar();
    iphone4.selecionarMusica();
    iphone4.pausar();

    System.out.println("----- --Telefone-- -----");
    iphone4.ligar();
    iphone4.atender();
    iphone4.iniciarCorreioVoz();

    System.out.println("----- --Navegador-- -----");
    iphone4.exibirPagina();
    iphone4.adicionarNovaAba();
    iphone4.atualizarPagina();
  }
}
