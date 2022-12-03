public class Дробь {
    Double Числитель;
    Double Знаменатель;
    Double Частное;

    public Дробь() {
        Числитель = 0.00;
        Знаменатель = 0.00;
        Частное = 0.00;
    }

    public Дробь(Double Name, Double Знаменатель, double Частное) {
        this.Числитель = Числитель;
        this.Знаменатель = Знаменатель;
        this.Частное = Частное;
    }

    public Double getЧислитель() {
        return Числитель;
    }

    public void setЧислитель(Double Числитель) {
        this.Числитель = Числитель;
    }

    public Double getЗнаменатель() {
        return Знаменатель;
    }

    public void setPopulation(Double Знаменатель) {
        this.Знаменатель =Знаменатель;
    }

    public double getЧастное() {
        return Частное;
    }

    public void setЧастное(double Частное) {
        this.Частное = Числитель/Знаменатель;
    }

    void displayInfo(){
        System.out.printf( "Числитель: %f \tЗнаменатель: %f \tЧастное: %f \n", Числитель, Знаменатель,Частное);
    }




}

