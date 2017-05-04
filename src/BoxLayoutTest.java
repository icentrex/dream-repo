import javax.swing.*;
import java.awt.*;

// Пример использования менеджера расположения BoxLayout

public class BoxLayoutTest extends JFrame{

    /**
     * Процедура добавления кнопки в контейнер
     * @param caption заголовок кнопки
     * @param container контейнер
     */
    private static void addButton(String caption, Container container)
    {
        JButton button = new JButton(caption);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }
    /**
     * Процедура создания интерфейса формы
     * @param container контейнер
     */
    public static void createUI(Container container) {
        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
        addButton("Хлеб"        , container);
        addButton("Молоко"      , container);
        addButton("Колбасы"     , container);
        addButton("Мясо и птица", container);
        addButton("Мороженные продукты", container);
    }

    public static void main(String[ ] args)
    {
        // Создание окна
        final JFrame frame = new JFrame("BoxLayoutTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Определение интерфейса окна
        createUI(frame.getContentPane());

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Открытие окна
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

}
