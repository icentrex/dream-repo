import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.URL;
import java.text.Normalizer;

public class MainWindow extends JFrame{

    public MainWindow(){
        setTitle("Dream Interpretation");
        setIconImage(new ImageIcon("animal-paw-print.png").getImage()); //добавить иконку в заголовок окна
        setSize(800, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    //Создаем пару панелей
        JPanel textFieldsPane = new JPanel();
        textFieldsPane.setBackground(new Color(100, 200, 50));
        add(textFieldsPane, BorderLayout.CENTER);

        JPanel ButtonPane = new JPanel();
        ButtonPane.setBackground(new Color(100, 100, 70));
        add(ButtonPane, BorderLayout.SOUTH);

    //Добавляем кнопку на нижнюю панель
        //ButtonPane.setLayout(null);
        JButton jbuttonAnalyze = new JButton("Request for Interpretation");
        jbuttonAnalyze.setBackground(new Color(160, 200, 200));
        jbuttonAnalyze.setBounds(350, 725,100,50);
        ButtonPane.add(jbuttonAnalyze);

    //Добавляем текстовые поля на верхню панель
        //TextFieldsPane.setLayout(new GridLayout(10,2));

        String[] MartialStatusCombo = {"Женат/Замужем", "Разведен(а)", "В разводе", "Вдовец/Вдова"};
        JComboBox<String> jcombo1 = new JComboBox<>(MartialStatusCombo);
        jcombo1.setPreferredSize(new Dimension(750,20));
        textFieldsPane.add(jcombo1);
        jcombo1.addActionListener(e -> System.out.println(jcombo1.getSelectedItem().toString()));

        JLabel lName = new JLabel("Ваше Имя: ");
        textFieldsPane.add(lName);
        JTextField jName = new JTextField( 60);
        textFieldsPane.add(jName);

        JLabel lAge = new JLabel("Возраст:     ");
        textFieldsPane.add(lAge);
        JTextField Age = new JTextField(60);
        textFieldsPane.add(Age);

        JLabel lOccupation = new JLabel("Сфера деятельности: ");
        textFieldsPane.add(lOccupation);
        JTextField occupation = new JTextField(55);
        textFieldsPane.add(occupation);

        JLabel lEvents = new JLabel("Значимые события перед сновидением:");
        textFieldsPane.add(lEvents);
        JTextArea eventsBeforeDream = new JTextArea(7, 40);
        eventsBeforeDream.setLineWrap(true);
        JScrollPane eventsBeforeDreamScroll = new JScrollPane(eventsBeforeDream);
        textFieldsPane.add(eventsBeforeDreamScroll);

        JLabel lThoughts = new JLabel("Мысли по поводу сна (На что это похоже?):");
        textFieldsPane.add(lThoughts);
        JTextArea thoughtsAboutDream = new JTextArea(7, 40);
        thoughtsAboutDream.setLineWrap(true);
        JScrollPane thoughtsAboutDreamScroll = new JScrollPane(thoughtsAboutDream);
        textFieldsPane.add(thoughtsAboutDreamScroll);

        JLabel lFellings = new JLabel("Чувства, вызванные сном:");
        textFieldsPane.add(lFellings);
        JTextArea feelingsAboutDream = new JTextArea(7, 50);
        feelingsAboutDream.setLineWrap(true);
        JScrollPane feelingsAboutDreamScroll = new JScrollPane(feelingsAboutDream);
        textFieldsPane.add(feelingsAboutDreamScroll);

        JLabel lDream = new JLabel("Содержание сна:");
        textFieldsPane.add(lDream);
        JTextArea dream = new JTextArea(7, 60);
        dream.setLineWrap(true);
        JScrollPane dreamScroll = new JScrollPane(dream);
        textFieldsPane.add(dreamScroll);

        setVisible(true);
    }

}
