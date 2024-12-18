import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// Класс для представления проекта
class Project {
    private String name;
    private int hours;
    private Date startingDate;
    private Date endDate;

    public Project(String name, int hours, Date startingDate, Date endDate) {
        this.name = name;
        this.hours = hours;
        this.startingDate = startingDate;
        this.endDate = endDate;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}

// Класс для представления курса
class Course {
    private String title;

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}


// Базовый класс для сотрудников
abstract class Employee {
    private String socialSecurityNumber;
    private String name;
    private String email;

    public Employee(String socialSecurityNumber, String name, String email) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.email = email;
    }

    // Геттеры и сеттеры
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Класс для научного сотрудника
class ResearchEmployee extends Employee {
    private String researchArea;
    private List<Project> projects;

    public ResearchEmployee(String socialSecurityNumber, String name, String email, String researchArea) {
        super(socialSecurityNumber, name, email);
        this.researchArea = researchArea;
        this.projects = new ArrayList<>();
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    // Геттеры и сеттеры
    public String getResearchArea() {
        return researchArea;
    }

    public List<Project> getProjects() {
        return projects;
    }
}

// Класс для административного персонала
class AdministrativeEmployee extends Employee {
    public AdministrativeEmployee(String socialSecurityNumber, String name, String email) {
        super(socialSecurityNumber, name, email);
    }
}

// Класс для кафедры
class Institute {
    private String name;
    private List<ResearchEmployee> staff;

    public Institute(String name) {
        this.name = name;
        this.staff = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStaff(ResearchEmployee employee) {
        staff.add(employee);
    }

    public List<ResearchEmployee> getStaff() {
        return staff;
    }
}

// Класс для факультета

class Faculty {
    private String name;
    private Dean dean;
    private List<Institute> institutes;

    public Faculty(String name, Dean dean) {
        this.name = name;
        this.dean = dean;
        this.institutes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Dean getDean() {
        return dean;
    }

    public void addInstitute(Institute institute) {
        institutes.add(institute);
    }

    public List<Institute> getInstitutes() {
        return institutes;
    }
}

// Класс для декана
class Dean extends Employee {
    public Dean(String socialSecurityNumber, String name, String email) {
        super(socialSecurityNumber, name, email);
    }
}

// Класс для университета
class University {
    private String name;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}
// Класс для преподавателя
class Lecturer extends ResearchEmployee {
    private List<Course> courses;

    public Lecturer(String socialSecurityNumber, String name, String email, String researchArea) {
        super(socialSecurityNumber, name, email, researchArea);
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }
}



public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        University university = new University("Example University");

        // Ввод данных о факультетах
        System.out.print("Введите количество факультетов: ");
        int facultyCount = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        for (int i = 0; i < facultyCount; i++) {
            System.out.println("Факультет " + (i + 1) + ":");
            System.out.print("Введите название факультета: ");
            String facultyName = scanner.nextLine();

            System.out.print("Введите ФИО декана: ");
            String deanName = scanner.nextLine();

            System.out.print("Введите email декана: ");
            String deanEmail = scanner.nextLine();

            Dean dean = new Dean("123-45-6789", deanName, deanEmail); // Для простоты используем один и тот же SSN
            Faculty faculty = new Faculty(facultyName, dean);

            // Ввод данных о институтах
            System.out.print("Введите количество институтов на факультете: ");
            int instituteCount = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            for (int j = 0; j < instituteCount; j++) {
                System.out.println("Институт " + (j + 1) + ":");
                System.out.print("Введите название института: ");
                String instituteName = scanner.nextLine();
                Institute institute = new Institute(instituteName);
                faculty.addInstitute(institute);

                // Ввод данных о научных сотрудниках
                System.out.print("Введите количество научных сотрудников в институте: ");
                int staffCount = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера

                for (int k = 0; k < staffCount; k++) {
                    System.out.println("Научный сотрудник " + (k + 1) + ":");
                    System.out.print("Введите ФИО сотрудника: ");
                    String employeeName = scanner.nextLine();

                    System.out.print("Введите email сотрудника: ");
                    String employeeEmail = scanner.nextLine();

                    System.out.print("Введите область исследований: ");
                    String researchArea = scanner.nextLine();

                    ResearchEmployee employee = new ResearchEmployee("987-65-4321", employeeName, employeeEmail, researchArea);
                    institute.addStaff(employee);

                    // Ввод данных о лекторах и курсах
                    System.out.print("Введите количество курсов, которые ведет этот лектор: ");
                    int courseCount = scanner.nextInt();
                    scanner.nextLine(); // Очистка буфера

                    for (int l = 0; l < courseCount; l++) {
                        System.out.println("Курс " + (l + 1) + ":");
                        System.out.print("Введите название курса: ");
                        String courseTitle = scanner.nextLine();
                        Course course = new Course(courseTitle);
                        if (employee instanceof Lecturer) {
                            ((Lecturer) employee).addCourse(course);
                        } else {
                            Lecturer lecturer = new Lecturer("987-65-4321", employeeName, employeeEmail, researchArea);
                            lecturer.addCourse(course);
                            institute.addStaff(lecturer);
                        }
                    }
                }
            }

            university.addFaculty(faculty);
        }

        // Вывод информации о университете
        System.out.println("\nСтруктура университета:");
        System.out.println("University: " + university.getName());
        for (Faculty f : university.getFaculties()) {
            System.out.println("Faculty: " + f.getName() + ", Dean: " + f.getDean().getName());
            for (Institute i : f.getInstitutes()) {
                System.out.println("  Institute: " + i.getName());
                for (ResearchEmployee e : i.getStaff()) {
                    System.out.println("    Staff: " + e.getName());
                    if (e instanceof Lecturer) {
                        Lecturer l = (Lecturer) e;
                        for (Course c : l.getCourses()) {
                            System.out.println("      Teaches: " + c.getTitle());
                        }
                    }
                }
            }
        }

        scanner.close();
    }
}
