/*
* Записать класс Properties для описания свойств графических примитивов с полями: толщина линии, тип линии, цвет.
* Последнее поле цвет должно представляться внутренним классом Color с полями: red, green, blue.
* Создать несколько объектов класса Properties с разным набором данных и вывести их в консоль.
*/
package practice.task33;

public class Properties {
    private int lineWidth;
    private String lineType;
    private Color color;

    public Properties(int lineWidth, String lineType, int red, int green, int blue) {
        this.lineWidth = lineWidth;
        this.lineType = lineType;
        color = new Color(red, green, blue);
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    public String getLineType() {
        return lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    public String getColor() {
        return color.toString();
    }

    public void setColor(int red, int green, int blue) {
        color.setRed(red);
        color.setGreen(green);
        color.setBlue(blue);
    }

    class Color {
        private int red;
        private int green;
        private int blue;

        public Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        public int getRed() {
            return red;
        }

        public void setRed(int red) {
            this.red = red;
        }

        public int getGreen() {
            return green;
        }

        public void setGreen(int green) {
            this.green = green;
        }

        public int getBlue() {
            return blue;
        }

        public void setBlue(int blue) {
            this.blue = blue;
        }

        @Override
        public String toString() {
            return "red=" + red +
                    ", green=" + green +
                    ", blue=" + blue;
        }
    }
}
