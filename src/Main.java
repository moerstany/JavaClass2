import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Человек Tanya=new Человек();
        Tanya.Name="Tatyana";
        Tanya.Age=42;
        Tanya.Salary=70000;
        Tanya.displayInfo();

        Город Новосибирск=new Город();
        Новосибирск.Name="Новосибирск";
        Новосибирск.Gubernator_name="Травников";
        Новосибирск.Nalog=260000000000.00;
        Новосибирск.displayInfo();

        Cтрана страна = new Cтрана();
        страна.Name="Россия";
        страна.Population=145000000.00;
        страна.Sqare=17125191.00;
        страна.displayInfo();

        Дробь дробь=new Дробь();
        дробь.Числитель=20000.00;
        дробь.Знаменатель=3000.00;
        дробь.Частное= дробь.Числитель/ дробь.Знаменатель;
        дробь.displayInfo();

        Книга книга=new Книга();
        Scanner in = new Scanner(System.in);
        System.out.print("Input Name: ");
        книга.Name = in.nextLine();
        System.out.print("Input Author: ");
        книга.Author = in.nextLine();
        System.out.print("Input Year: ");
        книга.Year = in.nextInt();
        System.out.print("Input Publisher: ");
        книга.Publisher = in.nextLine();
        System.out.print("Input Genre: ");
        книга.Genre = in.nextLine();
        System.out.print("Input Pages: ");
        книга.Pages = in.nextInt();
        книга.displayInfo();

        Автомобиль авто =new Автомобиль();
        авто.Name="Jeep Cheroki";
        авто.Producer="Jeep";
        авто.Year=2020;
        авто.EngineVolume=4.00;
        авто.displayInfo();

    }
}