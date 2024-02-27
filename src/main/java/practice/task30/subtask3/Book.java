/*
* Объявить первый класс Book для представления книги с полями: название, автор, год издания, число страниц.
* Определить необходимые конструкторы, сеттеры и геттеры для записи и считывания данных (данные должны быть с очевидными ограничениями по диапазону значений).
* Объявить второй класс Lib, который будет хранить ссылки на книги Book в виде массива: Book lib[] = new Book[MAX_BOOKS];
* где MAX_BOOKS – константа, определяющая максимальное число книг.
* Обеспечить возможность добавления, удаления и вывода списка книг посредством методов класса Lib.
* Прямого доступа извне к массиву lib быть не должно.
*/
package practice.task30.subtask3;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int year;
    private int numberPages;

    public Book() {
        title = "Test";
        author = "Test";
        year = 2024;
        numberPages = 1000;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (!title.matches("[a-zA-Zа-яА-Я\\- ]*")) {
            throw new IllegalArgumentException("в названии могут использоваться только буквенные символы, пробел и дефис");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (!author.matches("[a-zA-Zа-яА-Я\\- ]*")) {
            throw new IllegalArgumentException("в Ф.И.О. могут использоваться только буквенные символы, пробел и дефис");
        }
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 800 || year > 2050) {
            throw new IllegalArgumentException("Год должен быть положительным числом в пределах [800; 2050]");
        }
        this.year = year;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        if (numberPages <= 0) {
            throw new IllegalArgumentException("Кол-во страниц должно быть положительным числом");
        }
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "title: '" + title + '\'' +
                ", author: '" + author + '\'' +
                ", year: " + year +
                ", numberPages: " + numberPages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && numberPages == book.numberPages && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }
}
