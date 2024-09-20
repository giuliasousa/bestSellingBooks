import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main (String [] args){
        DatasetReader datasetReader = new DatasetReader();
        List<Book> amazon_books = datasetReader.readDataset("src/data.csv");


        String autor = "George R. R. Martin";

       //tarefa 01 mostra a quantidade de livros por autor ⬇️
/*         int qnt = 0;
        for (Book i : amazon_books){
            if (autor.equals(i.getAuthor())){
                qnt++;
            }
        }
        System.out.format("Número total de livros de %s é %d", autor, qnt); */

//-----------------------------------------------------------------

        //tarefa 02 mostra o nome de todos os autores presentes no .csv ⬇️
        /* List<String> totalAutores = new ArrayList<>();
        for(Book i : amazon_books){
            if (totalAutores.contains(i.getAuthor())){

            } else{
                totalAutores.add(i.getAuthor());
            }
        }
        for (String i : totalAutores){
            System.out.println(i);
        } */

//-------------------------------------------------------------------

       //tarefa 03 mostra o título dos livros do autor ⬇️
        /* List<String> totalLivros = new ArrayList<>();
        for (Book i : amazon_books){
            if (autor.equals(i.getAuthor())){
                totalLivros.add(i.getTitle());
            }
        }
        for(String i : totalLivros){
            System.out.println(i);
        } */

//--------------------------------------------------------------------

        //tarefa 04 mostra todos os livros que possuem a avaliação estabelecida ⬇️
        /*List<String> totalReviews = new ArrayList<>();
        String avaliacao = "4.5";
        for (Book i:amazon_books){
            if (avaliacao.equals(i.getUserRating())){
                if (!(totalReviews.contains(i.getTitle() + " escrito por " + i.getAuthor()))){
                    totalReviews.add(i.getTitle() + " escrito por " + i.getAuthor());
                }
            }
        }
        for (String livro:totalReviews){
            System.out.println(livro);
        }
*/
//---------------------------------------------------------------------

        //tarefa 5  mostra o preço dos livros do autor ⬇️
        /*autor = "George R. R. Martin";
        List<String> totalPrecos = new ArrayList<>();
        for(Book livro : amazon_books) {
            if (livro.getAuthor().equals(autor)) {
                if (!(totalPrecos.contains(livro.getTitle() + livro.getPrice()))) {
                    totalPrecos.add(livro.getTitle() + livro.getPrice());
                }
            }
        }
        for(String aut : totalPrecos){
            System.out.println(aut);
        }*/
    }
}
