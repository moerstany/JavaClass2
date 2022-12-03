public class Человек {

        String Name;
        int Age;
        double Salary;

        public Человек() {
            Name = "NoName";
            Age = 0;
            Salary = 0.00;
        }

        public Человек(String Name, int Age, double Salary) {
            this.Name = Name;
            this.Age = Age;
            this.Salary = Salary;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int Age) {
            this.Age = Age;
        }

        public double getSalary() {
            return Salary;
        }

        public void setSalary(double Salary) {
            this.Salary = Salary;
        }

    void displayInfo(){
        System.out.printf( "Name: %s \tAge: %d \tSalary: %f \n", Name, Age,Salary);
    }
    }

