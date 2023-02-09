package S1_08_N3_E1;

public class Student {
    private String name;
    private Integer age;
    private String course;
    private double qualification;

    public Student(String name, Integer age, String course, double qualification) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return name + '\'' + " " + age + " " + course +" "+ qualification;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getQualification() {
        return qualification;
    }

    public void setQualification(double qualification) {
        this.qualification = qualification;
    }

}
