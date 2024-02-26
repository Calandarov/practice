/*
* Запишите базовый класс Graph для представления графиков с полями: массив из N значений (значения графика), название.
* И производные от него классы: LineGraph (для линейного графика), Chart (для круговой диаграммы), Bar (для столбикового графика).
* В дочерних классах следует реализовать перегрузку метода draw() базового класса Graph для рисования графика в соответствующем виде
* (рисование – это вывод в консоль сообщения, что рисуется такой-то график с такими-то значениями).
* Создать несколько экземпляров дочерних классов со ссылками на них типа Graph.
* Через эти ссылки вызвать метод draw() и убедиться в работоспособности механизма динамической диспетчеризации (вызовов методов из дочерних классов).
*/
package practice.task36.subtask1;

import java.util.Arrays;

public class Graph {
    protected int[] graphValues;
    protected String title;

    public Graph(int graphValuesLength, String title) {
        this.graphValues = new int[graphValuesLength];
        this.title = title;
    }

    protected void draw() {
        System.out.println("Рисуется график " + title + " с значениями " + Arrays.toString(graphValues));
    }
}
