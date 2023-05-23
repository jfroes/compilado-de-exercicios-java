
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Evil Dead");

        int anoDeLancamento = 1981;

        System.out.println("Ano de laçamento: " + anoDeLancamento);
        boolean inclusoNoPlano = true;
        double notaDoFilme = 7.4;

        String sinopse;

        sinopse = """
                Ashley e um grupo de amigos vão para
                 uma casa na floresta para uma noite de diversão. 
                 Lá, encontram um velho livro que, quando lido em voz alta, 
                 desperta a morte. Os amigos acabam libertando uma corrente 
                 de demônios e agora terão que lutar por suas vidas 
                 ou acabarão como um deles.
                """ + anoDeLancamento;

        System.out.println(sinopse);

        int classificacao;
        //cast de Float para int
        classificacao = (int) (notaDoFilme / 2);
        System.out.println(classificacao);
    }
}