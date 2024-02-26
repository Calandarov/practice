/*
* Реализовать интерфейс PersonInterface для единой работы с БД сотрудников. В этом интерфейсе объявить абстрактные методы:
* getInfo() – для получения общей информации о сотруднике;
* getStatus() – для получения информации о должности;
* getFIO() – для получения ФИО сотрудника.
* Объявить дочерние классы: Supervisers (для руководителей), Jobs (для рядовых сотрудников), Clients (для клиентов).
* В этих классах хранить информацию: ФИО, должность, год рождения, подразделение (если есть), телефон, адрес.
* Реализовать интерфейс PersonInterface с определением необходимых методов.
* Создать несколько экземпляров классов Supervisers, Jobs и Clients, используя обобщенные ссылки типа PersonInterface.
* Вызвать для этих объектов методы интерфейса и убедиться в их корректной работе.
*/
package practice.task38.subtask1;

public interface PersonInterface {

}
