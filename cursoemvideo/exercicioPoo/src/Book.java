public class Book implements Publication {
    private String title, author;
    private int pages, currentPage;
    private boolean open;
    private Person reader;

    public Book(String title, String author, int pages, Person reader) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.currentPage = 0;
        this.open = false;
        this.reader = reader;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Person getReader() {
        return reader;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    // Public Methods
    public String details() {
        return "---------- Livro ----------" + "\n" +
                "Titulo: " + getTitle() + "\n" +
                "Autor: " + getAuthor() + "\n" +
                "Páginas: " + getPages() + "\n" +
                "Pagina atual: " + getCurrentPage() + "\n" +
                "Aberto: " + isOpen() + "\n" +
                "Leitor: " + getReader().getName();
    }

    @Override
    public void open() {
        this.open = true;
        this.currentPage = 1;
    }

    @Override
    public void close() {
        this.open = false;
        this.currentPage = 0;
    }

    @Override
    public void leafThrough(int p) {
        if(isOpen()) {
            if(p < 1 || p > getPages()) {
                this.currentPage = 0;
                setOpen(false);
            } else this.currentPage = p;
        }
    }

    @Override
    public void nextPage() {
        if(isOpen()) {
            if(getCurrentPage() < getPages()) {
                this.currentPage++;
            } else {
                this.currentPage = 0;
                setOpen(false);
            }
        }
    }

    @Override
    public void prevPage() {
        if(isOpen()) {
            if(getCurrentPage() == 0) {
                setOpen(false);
            } else this.currentPage--;
        }
    }
}
