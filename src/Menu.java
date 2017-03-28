import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Владелец on 25.03.2017.
 */
public class Menu {
    Database db = new Database();
    BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
    Scanner in = new Scanner(System.in);

    void ShowCommands() throws IOException {
        int choice=0;
        System.out.println("1.просмотр зарегистрированных изданий");
        System.out.println("2.Добавление нового издания");
        System.out.println("3.просмотр информации выбранного издания");
        System.out.println("4.удаление выбранного издания");
        System.out.println("5.выход");
        choice = in.nextInt();
        //choice = s.read();
        //String choice1 = s.readLine();
        switch(choice){
            case 1:
                //potom dobavlyu
                db.filling();
                db.showBase();
                System.out.println("Данные заполнены! Выберете следующую команду");
                ShowCommands();
                break;
            case 2:
                db.add();
                System.out.println("Издание добавлено");
                ShowCommands();
                break;
            case 3:
                db.showSingle();
                ShowCommands();
                break;
            case 4:
                db.deleteEd();
                System.out.println("Элемент удален");
                ShowCommands();
                break;
            case 5:
                db.exit();

                break;
                //potom
            default:
                System.out.println("Ошибка! Попробуйте заново");
                ShowCommands();
                break;
        }





    }




}
