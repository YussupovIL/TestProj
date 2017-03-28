import java.io.*;
import java.util.*;
import java.util.logging.Logger;

/**
 * Created by Владелец on 24.03.2017.
 */
public class Database {
    BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
    Scanner in = new Scanner(System.in);

    List<String> edition = new ArrayList<>();
    List<String> publisher = new ArrayList<>();
    List<String> type = new ArrayList<>();
    List<String> StringAmount = new ArrayList<>();
    List<String> date = new ArrayList<>();
    Calendar c = new GregorianCalendar();

    void filling() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("edition.txt"));
        String line;

        while ((line = reader.readLine()) != null) {
            edition.add(line);
        }

        reader = new BufferedReader(new FileReader("publisher.txt"));
        //String line;

        while ((line = reader.readLine()) != null) {
            publisher.add(line);
        }

        reader = new BufferedReader(new FileReader("StringAmount.txt"));
        //String line;

        while ((line = reader.readLine()) != null) {
            StringAmount.add(line);
        }

        reader = new BufferedReader(new FileReader("date.txt"));
        //String line;

        while ((line = reader.readLine()) != null) {
            date.add(line);
        }

        reader = new BufferedReader(new FileReader("type.txt"));
        //String line;

        while ((line = reader.readLine()) != null) {
            type.add(line);
        }

        //System.out.println(edition.get(0));
    }


    void addBook() throws IOException {
        type.add("книга");
        System.out.println("введите наименование издания");
        String bookName = s.readLine();
        edition.add(bookName);
        //edition.add(in.nextLine());
        System.out.println("введите издателя");
        String publisherName =  s.readLine();
        publisher.add(publisherName);
        //publisher.add(in.nextLine());
        System.out.println("введите количество страниц");
        String pageAmount =  s.readLine();
        StringAmount.add(pageAmount);

        //StringAmount.add(in.nextInt());


        System.out.println("введите год издания");
        String dates =  s.readLine();
        date.add(dates);
        //date.add(in.nextLine());
    }



    void addBrochure() throws IOException {
        type.add("журнал/брошюра");

        System.out.println("введите наименование издания");
        String bookName =  s.readLine();
        edition.add(bookName);
        //edition.add(in.nextLine());
        System.out.println("введите издателя");
        String publisherName =  s.readLine();
        publisher.add(publisherName);
        //publisher.add(in.nextLine());
        System.out.println("введите количество страниц");
        String pageAmount =  s.readLine();
        StringAmount.add(pageAmount);

        //StringAmount.add(in.nextInt());


        System.out.println("введите месяц год издания");
        String dates =  s.readLine();
        date.add(dates);
        //date.add(in.nextLine());

    }

    void add() throws IOException {
        System.out.println("Что вы желаете добавить?");
        System.out.println("1. Книга");
        System.out.println("2. Журнал или Брошюра");
        int tempor = in.nextInt();
        if(tempor==1){
            addBook();
        }
        else if(tempor==2){
            addBrochure();
        }

        else {
            System.out.println("недопустимое значение. Повторите попытку");
            add();
        }


    }

    void clean() throws IOException {
        File myFile = new File("edition.txt"); //ochistka starogo faila
        if (myFile.exists()) {
            myFile.delete();
            myFile.createNewFile();
        }

        myFile = new File("publisher.txt"); //ochistka starogo faila
        if (myFile.exists()) {
            myFile.delete();
            myFile.createNewFile();
        }
        myFile = new File("StringAmount.txt"); //ochistka starogo faila
        if (myFile.exists()) {
            myFile.delete();
            myFile.createNewFile();
        }
        myFile = new File("date.txt"); //ochistka starogo faila
        if (myFile.exists()) {
            myFile.delete();
            myFile.createNewFile();
        }

        myFile = new File("type.txt"); //ochistka starogo faila
        if (myFile.exists()) {
            myFile.delete();
            myFile.createNewFile();
        }













    }


    void exit() throws IOException {
        clean();
        Writer writer = null;
        try {
            writer = new FileWriter("edition.txt");
            for (String line : edition) {
                writer.write(line);

                writer.write(System.getProperty("line.separator"));
            }
            writer.flush();
        } catch (Exception e) {




        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                }
            }
        }

        try {
            writer = new FileWriter("publisher.txt");
            for (String line : publisher) {
                writer.write(line);

                writer.write(System.getProperty("line.separator"));
            }
            writer.flush();
        } catch (Exception e) {

        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                }
            }
        }

        try {
            writer = new FileWriter("type.txt");
            for (String line : type) {
                writer.write(line);

                writer.write(System.getProperty("line.separator"));
            }
            writer.flush();
        } catch (Exception e) {

        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                }
            }
        }

        try {
            writer = new FileWriter("StringAmount.txt");
            for (String line : StringAmount) {
                writer.write(line);

                writer.write(System.getProperty("line.separator"));
            }
            writer.flush();
        } catch (Exception e) {

        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                }
            }
        }

        try {
            writer = new FileWriter("date.txt");
            for (String line : date) {
                writer.write(line);

                writer.write(System.getProperty("line.separator"));
            }
            writer.flush();
        } catch (Exception e) {

        }



    }







    /*void addEd(){
        System.out.println("введите наименование издания");
        edition.add(in.nextLine());
        System.out.println("введите издателя");
        publisher.add(in.nextLine());
        System.out.println("введите количество страниц");
        StringAmount.add(in.nextInt());

        System.out.println("Введите тип издание: Книга/журнал/брошюра");
        String Check = in.nextLine();
        type.add(Check);
        if(Check.equals("книга")){
            System.out.println("введите год издания");
            date.add(in.nextLine());
        }
        else {
            System.out.println("ввежие месяц и год издания в фомарте mm/yyyy");
            date.add(in.nextLine());
        }

    }*/


    void deleteEd(){
        System.out.println("идентификатор элемента, который хотите удалить");
        int delEl = in.nextInt();
        edition.remove(delEl);
        publisher.remove(delEl);
        StringAmount.remove(delEl);
        date.remove(delEl);
        type.remove(delEl);
    }

    void showSingle(){
        System.out.println("Введите идентификатор");
        int i= in.nextInt();
        //int size = edition.size();
        /*for (i=0;i<size;i++) {*/
            System.out.println(String.format("ID = %d;   Название =  %.15s;   издатель = %.15s;   тип = %.15s;   дата издания = %.15s;   количество страниц = %.15s;",
                    i,edition.get(i),publisher.get(i),type.get(i),date.get(i),StringAmount.get(i)));
       // }
    }

    void showBase(){
        int i=0;
        int size = edition.size();
        /*String sA = StringAmount.get(i);
        String types = type.get(i);
        String date1 = date.get(i);
        String pub = publisher.get(i);
        String ed = edition.get(i);*/


        for (i=0;i<size;i++) {
            System.out.println(String.format("ID = %d;   Название =  %.15s;   издатель = %.15s;   тип = %.15s;   дата издания = %.15s;   количество страниц = %.15s;",
            i,edition.get(i),publisher.get(i),type.get(i),date.get(i),StringAmount.get(i)));
        }
    }

}
