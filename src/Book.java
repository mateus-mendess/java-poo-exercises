public class Book {
    public String title;
    public String author;
    public int yearPublication;
    public boolean availability = true;

    public void lend() {
        if (this.availability) {
            this.availability = false;

            System.out.println("Emprestando livro "+title);
        } else {
            System.out.println("Livro "+this.title+" emprestado, não está disponivel");
        }
    }

    public void returnBook() {
        if (! this.availability) {
            this.availability = true;

            System.out.println("Devolvendo livro "+title);
        } else {
            System.out.println("Livro "+this.title+" não está emprestado, para ser devolvido!");
        }
    }

    public  void informationBook() {
        System.out.println("Título: "+this.title+"\nAutor: "+this.author+"\nAno da Publicação: "+this.yearPublication);
    }

}
