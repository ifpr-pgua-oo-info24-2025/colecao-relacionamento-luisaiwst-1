import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Luisa Ayumi", "japones");
        Autor autor2 = new Autor("Ghard", "norte americano");

        LivroFisico lf1 = new LivroFisico("qm eh vc alaska", 2016, autor1, 330);
        LivroFisico lf2 = new LivroFisico("pessoas normais", 2020, autor2, 258);

        LivroDigital ld1 = new LivroDigital("pjo 1", 2012, autor2, 298);
        LivroDigital ld2 = new LivroDigital("pjo 2", 2013, autor1, 333);

        ArrayList<Livro> biblioteca = new ArrayList<>();

        biblioteca.add(lf1);
        biblioteca.add(lf2);
        biblioteca.add(ld1);
        biblioteca.add(ld2);

        for (int i = 0; i < biblioteca.size(); i++) {

            biblioteca.get(i).exibirDetalhes();
        }
    }
}
