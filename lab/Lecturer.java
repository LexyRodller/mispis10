// Класс Преподаватель (наследуется от Научного Сотрудника)
class Lecturer extends ResearchEmployee {
    private Course course;

    public Lecturer(String socialSecurityNumber, String name, String email, String researchArea) {
        super(socialSecurityNumber, name, email, researchArea);
    }

    public Course getCourse() {
        return course;
    }

    public void assignCourse(Course course) {
        this.course = course;
    }
}