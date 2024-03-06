/*
* Объявить класс Vec2 для представления двумерного вектора с приватными полями a, b – значения элементов вектора.
* Прописать конструктор(ы), сеттер(ы) и геттер(ы) для записи и считывания данных вектора.
* Нужно обеспечить, чтобы значения элементов вектора находились в диапазоне [-MAX_VAL; MAX_VAL],
* где MAX_VAL – константа, заданная в этом же классе. Добавить в класс Vec2 еще два метода:
* для вычисления суммы и разности двух векторов класса Vec2.
* Эти методы не должны менять значений векторов, участвующих в операциях сложения и вычитания, а создавать новый с соответствующими значениями.
*/
package practice.task30.subtask2;

public class Vec2 {
    private final double MAX_VAL = 5;
    private double a;
    private double b;

    public Vec2(double a, double b) {
        if(a < -MAX_VAL || a > MAX_VAL || b < -MAX_VAL || b > MAX_VAL) {
            throw new IllegalArgumentException("Значения должны находиться в диапазоне [" + -MAX_VAL + ";" + MAX_VAL + "]");
        }
        this.a = a;
        this.b = b;
    }

    public double getMAX_VAL() {
        return MAX_VAL;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if(a < -MAX_VAL || a > MAX_VAL) {
            throw new IllegalArgumentException("Значения должны находиться в диапазоне [" + -MAX_VAL + ";" + MAX_VAL + "]");
        }
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if(b < -MAX_VAL || b > MAX_VAL) {
            throw new IllegalArgumentException("Значения должны находиться в диапазоне [" + -MAX_VAL + ";" + MAX_VAL + "]");
        }
        this.b = b;
    }

    public Vec2 summation(Vec2 vec) {
        return new Vec2(this.getA() + vec.getA(), this.getB() + vec.getB());
    }

    public Vec2 subtraction(Vec2 vec) {
        return new Vec2(this.getA() - vec.getA(), this.getB() - vec.getB());
    }
}
