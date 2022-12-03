public class Книга {
    String Name;
    String Author;
    int Year;
    String Publisher;
    String Genre;
    int Pages;

    public Книга() {
        Name = "NoName";
        Author = "NoAuthor";
        Year = 0;
        Publisher="NoPublisher";
        Genre="NoGenre";
        Pages=0;

    }

    public Книга(String Name, String Author, int Year,
    String Publisher,String Genre, int Pages) {
        this.Name = Name;
        this.Author=Author;
        this.Year = Year;
        this.Publisher=Publisher;
        this.Genre=Genre;
        this.Pages=Pages;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int Pages) {
        this.Pages = Pages;
    }

    void displayInfo(){
        System.out.printf( "Name: %s \tAuthor: %s \t Year: %d\tPublisher: %s\n" +
                "Genre: %s\t Pages: %d \n", Name, Author,Year,Publisher,Genre,Pages);
    }
}



