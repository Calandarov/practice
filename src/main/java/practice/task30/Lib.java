package practice.task30;

public class Lib {
    private final int MAX_BOOKS = 5;
    private Book[] lib;

    public Lib() {
        lib = new Book[MAX_BOOKS];
    }

    public int getMAX_BOOKS() {
        return MAX_BOOKS;
    }

    public Book[] getLib() {
        return lib;
    }

    public void addBook(Book book) {
        Book[] newLib = new Book[lib.length + 1];

        for(int i = 0; i < lib.length - 1; i++) {
            newLib[i] = lib[i];
        }

        newLib[newLib.length - 1] = book;
        lib = newLib;
    }

    public void deleteBook(Book book) {
        Book[] newLib = new Book[lib.length - 1];

        for(int i = 0 ; i < lib.length; i++) {
            if(!lib[i].equals(book)) {
                newLib[i] = lib[i];
            }
        }

        lib = newLib;
    }
}
