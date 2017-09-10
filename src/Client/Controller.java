package Client;


import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Controller {
    @FXML
    TextField nameField;
    @FXML
    TextField ageField;
    @FXML
    TextField emailField;
    @FXML
    TextField familyStatusField;
    @FXML
    TextArea eventsArea;
    @FXML
    TextArea thoughtsArea;
    @FXML
    TextArea feelingsArea;
    @FXML
    TextArea dreamArea;


    public void saveDream() {
        try (FileOutputStream log = new FileOutputStream("log.txt", true)) {

            //Определяем текущее время запроса
            Date curDate = new Date(System.currentTimeMillis());
            //String curDate = new SimpleDateFormat("dd.mm.yyyy").format(curTime);

            //Димначеский массив для формирования строки
            ArrayList<String> str = new ArrayList<>();

            //Пишем в ячейку массива данные пользователя
            str.add(0, "\n" + curDate
                    + " \nИмя: " + nameField.getText()
                    + "\nВозраст: " + ageField.getText()
                    + "\nЭлектронная почта: " + emailField.getText()
                    + "\nСемейный статус: " + familyStatusField.getText()
                    + "\nЗначимые события: " + eventsArea.getText()
                    + "\nМысли: " + thoughtsArea.getText()
                    + "\nСодержание сна: " + dreamArea.getText() + "\n" + "================================\n\n");

            //Пишем в файл
            log.write(str.get(0).getBytes());

            //очищаем ячейку
            //str.remove(0);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveToDB(){}

}

