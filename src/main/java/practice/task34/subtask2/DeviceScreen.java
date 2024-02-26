/*
* Требуется создать описание окна приложения для разных устройств: смартфонов, планшетов и настольных компьютеров (десктопов).
* Окно имеет общие параметры: заголовок, шрифт, наличие/отсутствие рамки. И уникальные для каждого устройства:
* для смартфонов: ничего (все берется из базового класса);
* для планшетов: положение и размер окна;
* для десктопов: положение и размер окна, возможность менять размеры, полноэкранный режим.
* Подумайте, как описать эти классы. Создайте экземпляры классов для каждого устройства и выведите значение полей в консоль.
*/
package practice.task34.subtask2;

public class DeviceScreen {
    protected String title;
    protected String font;
    protected boolean haveFrame;

    public DeviceScreen(String title, String font, boolean haveFrame) {
        this.title = title;
        this.font = font;
        this.haveFrame = haveFrame;
    }
}