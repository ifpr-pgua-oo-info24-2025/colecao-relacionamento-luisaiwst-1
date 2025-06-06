
public class LivroFisico extends Livro {

    private Integer numerodePaginas;

    public Integer getnumerodePaginas() {
        return numerodePaginas;
    }

    public void setnumerodePaginas(Integer numerodePaginas) {
        this.numerodePaginas = numerodePaginas;
    }

    public LivroFisico(String titulo, Integer anoPublicacao, Autor autor, int numerodePaginas) {
        super(titulo, anoPublicacao, autor);
        this.numerodePaginas = numerodePaginas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("");
        System.out.println(numerodePaginas + " paginas");
        System.out.println(getTitulo());
        System.out.println(getAnoPublicacao());
        System.out.println(getAutor().getNome());
        System.out.println(getAutor().getNacionalidade());
    }

}
