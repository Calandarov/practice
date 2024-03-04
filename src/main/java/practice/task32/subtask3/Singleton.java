/*
* Реализовать класс Singleton, в котором определить статический метод getInstance().
* Этот метод должен возвращать экземпляр класса, если он еще не создавался.
* Иначе, возвращается ссылка на ранее созданный экземпляр.
* Также следует запретить создание объектов класса Singleton напрямую через оператор new.
* (Полученная реализация будет гарантировать существование только одного экземпляра класса в процессе работы программы и,
* фактически, является примером известного паттерна singleton).
*/
package practice.task32.subtask3;

public class Singleton {
    private static Singleton INSTANCE;
    private Singleton() {}
    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }
}
