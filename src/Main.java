public class Main {
  public static void main(String[] args) {
    Filme filme1 = new Filme();
    filme1.titulo = "O Poderoso Chefão";
    filme1.anoLancamento = 1972;
    filme1.duracaoEmMinutos = 175;
    filme1.incluidoNoPlano = true;

    filme1.exibeFichaTecnica();
    filme1.avalia(8);
    filme1.avalia(7);
    filme1.avalia(9);

    System.out.println("Média das avaliações: " + filme1.mediaDasAvaliacoes());
  }
}
