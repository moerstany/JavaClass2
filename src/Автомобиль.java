public class Автомобиль {
    String Name;
    String Producer;
    int Year;
    double EngineVolume;

    public Автомобиль() {
        Name = "NoName";
        Producer = "NoProducer";
        Year = 0;
        EngineVolume=0.00;
    }
    public Автомобиль(String Name, String Producer, int Year,
                      int EngineVolume) {
        this.Name = Name;
        this.Producer=Producer;
        this.Year = Year;
        this.EngineVolume=EngineVolume;

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String Producer) {
        this.Producer = Producer;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public double getEngineVolume() {
        return EngineVolume;
    }

    public void setEngineVolume(double EngineVolume) {
        this.EngineVolume = EngineVolume;
    }


    void displayInfo(){
        System.out.printf( "Name: %s \tProducer: %s \t Year: %d \t EngineVolume: %f \n", Name, Producer, Year, EngineVolume);
    }
}
