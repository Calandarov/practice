/*
* Реализовать класс Lib с запретом его наследования для работы с набором книг. Книги должны представлять другим классом Book с полями: название, автор, год издания, цена. В классе Lib реализовать следующий функционал:
* добавление/удаление книги из библиотеки;
* вывод информации по всем книгам;
* поиск книг по автору, а также по году издания.
*/
package practice.task36.subtask2;

import java.util.ArrayList;

public final class Lib {
    private ArrayList<Book> books;

    public Lib() {
        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public boolean addBook(Book book) {
        return books.add(book);
    }

    public boolean deleteBook(Book book) {
        return books.remove(book);
    }

    // TODO: должен возвращать список?
    public String printBooks() {
        return books.toString();
    }

    public ArrayList<Book> findBookByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();

        for(Book book : books) {
            if(book.getAuthor().equals(author)) {
                foundBooks.add(book);
            }
        }

        return foundBooks;
    }

    public ArrayList<Book> findBookByYear(int year) {
        ArrayList<Book> foundBooks = new ArrayList<>();

        for(Book book : books) {
            if(book.getYear() == year) {
                foundBooks.add(book);
            }
        }

        return foundBooks;
    }
}
