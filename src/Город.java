public class Город {
    String Name;
    String Gubernator_name;
    Double Nalog;

    public Город() {
        Name = "NoName";
        Gubernator_name = "NoName";
        Nalog = 0.00;
    }

    public Город(String Name, String Gubernator_name, Double Nalog) {
        this.Name = Name;
        this.Gubernator_name = Gubernator_name;
        this.Nalog = Nalog;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGubernator_name() {
        return Gubernator_name;
    }

    public void setGubernator_name(String Gubernator_name) {
        this.Gubernator_name = Gubernator_name;
    }

    public double getNalog() {
        return Nalog;
    }

    public void setNalog(double Nalog) {
        this.Nalog = Nalog;
    }

    void displayInfo(){
        System.out.printf( "Name: %s \tGubernator_name: %s \tNalog: %f \n", Name, Gubernator_name,Nalog);
    }
}



