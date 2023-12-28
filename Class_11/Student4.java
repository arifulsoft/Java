package inheritance;

public class Student {

    int id;
    String name;
    int round;
    String gender;
    String divison;
    double expancive;
    String district;
    double gpa;

    public Student(int id, String name, int round, String gender, String divison, double expancive, String district, double gpa) {
        this.id = id;
        this.name = name;
        this.round = round;
        this.gender = gender;
        this.divison = divison;
        this.expancive = expancive;
        this.district = district;
        this.gpa = gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDivison(String divison) {
        this.divison = divison;
    }

    public void setExpancive(double expancive) {
        this.expancive = expancive;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", round=" + round + ", gender=" + gender + ", divison=" + divison + ", expancive=" + expancive + ", district=" + district + ", gpa=" + gpa + '}';
    }

}
