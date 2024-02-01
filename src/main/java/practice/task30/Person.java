/*
* Объявить класс Person для описания сотрудника с полями: Ф.И.О., возраст, вес, номер разряда (целое число от 1 до 5).
* Прописать конструктор(ы), сеттер(ы) и геттер(ы) для записи значений по сотруднику и считывания данных.
* Обеспечить корректность представления данных:
* возраст и вес – положительные числа в пределах [30; 200];
* разряд в диапазоне [1; 5]; в Ф.И.О. могут использоваться только буквенные символы, пробел и дефис.
* Создать несколько таких объектов и убедиться в их корректной работе.
*/
package practice.task30;


public class Person {
    private String name;
    private int age;
    private int weight;
    private int numberCategory;
    
    public Person() {
        name = "Test";
        age = 30;
        weight = 30;
        numberCategory = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.matches("[a-zA-Zа-яА-Я\\- ]*")) {
            throw new IllegalArgumentException("в Ф.И.О. могут использоваться только буквенные символы, пробел и дефис");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 30 || age > 200) {
            throw new IllegalArgumentException("Возраст - положительное число в пределах [30; 200]");
        }
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight < 30 || weight > 200) {
            throw new IllegalArgumentException("Вес - положительное число в пределах [30; 200]");
        }
        this.weight = weight;
    }

    public int getNumberCategory() {
        return numberCategory;
    }

    public void setNumberCategory(int numberCategory) {
        if(numberCategory < 1 || numberCategory > 5) {
            throw new IllegalArgumentException("Разряд - положительное число в пределах [1; 5]");
        }
        this.numberCategory = numberCategory;
    }
}
