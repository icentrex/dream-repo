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
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    //Создаем пару панелей
        setLayout(null);
        JPanel TextFieldsPane = new JPanel();
        TextFieldsPane.setBounds(0,0,800,400);
        TextFieldsPane.setBackground(new Color(100, 200, 50));
        JPanel ButtonPane = new JPanel();
        ButtonPane.setBounds(0,700,800,100);
        ButtonPane.setBackground(new Color(100, 100, 70));
        add(TextFieldsPane);
        add(ButtonPane);

    //Добавляем кнопку на нижнюю панель
        //ButtonPane.setLayout(null);
        JButton jbuttonAnalyze = new JButton("Waiting for Meaning");
        jbuttonAnalyze.setBackground(new Color(50, 100, 200));
        jbuttonAnalyze.setBounds(350, 725,100,50);
        ButtonPane.add(jbuttonAnalyze);

    //Добавляем текстовые поля на верхню панель
        TextFieldsPane.setLayout(new FlowLayout());

        //реализовать как массив, чтобы легче писать в базу и искать?
        JTextField Name = new JTextField("Ваше Имя: ");
        TextFieldsPane.add(Name);
        JTextField Age = new JTextField("Возраст: ");
        TextFieldsPane.add(Age);
        JTextField Occupation = new JTextField("Сфера деятельности: ");
        TextFieldsPane.add(Occupation);
        String[] MartialStatusCombo = {"Женат/Замужем", "Разведен(а)", "В разводе", "Вдовец/Вдова"};
        JComboBox<String> jcombo1 = new JComboBox<String>(MartialStatusCombo);
        TextFieldsPane.add(jcombo1);
        jcombo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jcombo1.getSelectedItem().toString());
            }
        });

        JTextArea EventsBeforeDream = new JTextArea("Значимые события перед сновидением");
        JScrollPane EventsBeforeDreamScroll = new JScrollPane(EventsBeforeDream);
        TextFieldsPane.add(EventsBeforeDream);

        JTextArea ThoughtsAboutDream = new JTextArea("Мысли по поводу сна - на что это похоже");
        JScrollPane ThoughtsAboutDreamScroll = new JScrollPane(ThoughtsAboutDream);
        TextFieldsPane.add(ThoughtsAboutDream);

        JTextArea FeelingsAboutDream = new JTextArea("Чувства, вызванные сном");
        JScrollPane FeelingsAboutDreamScroll = new JScrollPane(FeelingsAboutDream);
        TextFieldsPane.add(FeelingsAboutDream);

        JTextArea Dream = new JTextArea("Содержание сна");
        JScrollPane DreamScroll = new JScrollPane(Dream);
        TextFieldsPane.add(FeelingsAboutDream);

        setVisible(true);
    }

}
