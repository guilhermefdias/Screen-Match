public class Filme {
  String titulo;
  int duracaoEmMinutos;
  int anoLancamento;
  boolean incluidoNoPlano;
  double somaDasAvaliacoes;
  int totalDeAvaliacoes;


  void exibeFichaTecnica() {
    System.out.println("Titulo do filme: " + titulo);
    System.out.println("Ano de lancamento: " + anoLancamento);
    System.out.println("Duração em minutos: " + duracaoEmMinutos);
    System.out.println("Incluido no plano: " + incluidoNoPlano);
  }

  void avalia(double nota){
    somaDasAvaliacoes += nota;
    totalDeAvaliacoes++;
  }

  double mediaDasAvaliacoes() {
    return somaDasAvaliacoes / totalDeAvaliacoes;
  }
}
