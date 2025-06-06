
public class LivroDigital extends Livro {

    private double tamanhoEmMB;

    public LivroDigital(String titulo, Integer anoPublicacao, Autor autor, double tamanhoEmMB) {
        super(titulo, anoPublicacao, autor);
        this.tamanhoEmMB = tamanhoEmMB;
    }

    public double gettamanhoEmMB() {
        return tamanhoEmMB;
    }

    public void settamanhoEmMB(double tamanhoEmMB) {
        this.tamanhoEmMB = tamanhoEmMB;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("");
        System.out.println(tamanhoEmMB + " MB");
        System.out.println(getTitulo());
        System.out.println(getAnoPublicacao());
        System.out.println(getAutor().getNome());
        System.out.println(getAutor().getNacionalidade());
    }

}
