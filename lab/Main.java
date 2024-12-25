public class Main {
    public static void main(String[] args) {
        // Создание университета
        University university = new University("Воронежский Государственный Университет");

        // Создание декана
        Dean dean = new Dean("123-45-6789", "Иванов Иван Иванович", "ivanov@university.edu");

        // Создание факультета и добавление декана
        Faculty faculty = new Faculty("Факультет Интелектуальных Наук", dean);
        university.addFaculty(faculty);

        // Создание кафедры и добавление её на факультет
        Institute institute = new Institute("Кафедра", "ул. Программная, 1");
        faculty.addInstitute(institute);

        // Создание научного сотрудника
        ResearchEmployee researcher = new ResearchEmployee("987-65-4321", "Петров Петр Петрович", "petrov@university.edu", "Искусственный интеллект");

        // Создание проекта и добавление его к научному сотруднику
        Project project1 = new Project("Проект AI", 120, "2023-01-01", "2023-12-31");
        researcher.addProject(project1);

        // Добавление научного сотрудника в кафедру
        institute.addResearchEmployee(researcher);

        // Создание преподавателя и назначение курса
        Lecturer lecturer = new Lecturer("111-22-3333", "Сидоров Сидор Сидорович", "sidorov@university.edu", "Машинное обучение");
        Course course = new Course(101, "Введение в Машинное Обучение", 4);
        lecturer.assignCourse(course);

        // Добавление преподавателя в кафедру
        institute.addResearchEmployee(lecturer);

        // Вывод информации о университете
        System.out.println("Университет: " + university.getName());
        for (Faculty f : university.getFaculties()) {
            System.out.println("  Факультет: " + f.getName());
            System.out.println("    Декан: " + f.getDean().getName());
            for (Institute i : f.getInstitutes()) {
                System.out.println("    Кафедра: " + i.getName() + ", Адрес: " + i.getAddress());
                for (ResearchEmployee emp : i.getResearchEmployees()) {
                    System.out.println("      Научный сотрудник: " + emp.getName() + ", Область исследования: " + emp.getResearchArea());
                    for (Project proj : emp.getProjects()) {
                        System.out.println("        Проект: " + proj.getName() + ", Часы: " + proj.getHours());
                    }
                }
                // Вывод информации о преподавателе
                if (i.getResearchEmployees().contains(lecturer)) {
                    System.out.println("      Преподаватель: " + lecturer.getName() + ", Курс: " + lecturer.getCourse().getName());
                }
            }
        }
    }
}
