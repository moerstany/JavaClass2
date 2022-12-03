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

    }
}