package inheritance;

public class Book {

    String Bookname;
    String WriterNAme;
    int Eddision;
    double prize;

    public Book(String Bookname, String WriterNAme, int Eddision, double prize) {
        this.Bookname = Bookname;
        this.WriterNAme = WriterNAme;
        this.Eddision = Eddision;
        this.prize = prize;
    }

    public void setBookname(String Bookname) {
        this.Bookname = Bookname;
    }

    public void setWriterNAme(String WriterNAme) {
        this.WriterNAme = WriterNAme;
    }

    public void setEddision(int Eddision) {
        this.Eddision = Eddision;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Book{" + "Bookname=" + Bookname + ", WriterNAme=" + WriterNAme + ", Eddision=" + Eddision + ", prize=" + prize + '}';
    }

}
