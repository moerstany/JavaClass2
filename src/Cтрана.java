public class Cтрана {
    String Name;
    Double Population;
    Double Sqare;

    public Cтрана() {
        Name = "NoName";
        Population = 0.00;
        Sqare = 0.00;
    }

    public Cтрана(String Name, double Population, double Sqare) {
        this.Name = Name;
        this.Population = Population;
        this.Sqare = Sqare;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Double getPopulation() {
        return Population;
    }

    public void setPopulation(Double Population) {
        this.Population = Population;
    }

    public double getSqare() {
        return Sqare;
    }

    public void setSqare(double Sqare) {
        this.Sqare = Sqare;
    }

    void displayInfo(){
        System.out.printf( "Name: %s \tPopulation: %f \tSqare: %f \n", Name, Population,Sqare);
    }




}
