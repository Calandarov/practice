/*
* Используя интерфейс и классы из подвига 1, добавить к классам базовый класс Persons для хранения общих полей:
* ФИО, год рождения, адрес.
* Кроме того, добавить две статические переменные:
* count и count_clients для подсчета числа сотрудников (классы Supervisers и Jobs) и клиентов организации (класс Clients).
* Создать несколько объектов, используя ссылки обобщенного типа PersonInterface.
* Вывести информацию по объектам, а также число сотрудников и клиентов.
*/
package practice.task38.subtask2;

public class Persons {
    protected static int count = 0;
    protected static int count_clients = 0;
    protected String FIO;
    protected int yearOfBirth;
    protected String address;

    public Persons(String FIO, int yearOfBirth, String address) {
        this.FIO = FIO;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }
}
