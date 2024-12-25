// Класс Научный Сотрудник
import java.util.ArrayList;
import java.util.List;
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

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public List<Project> getProjects() {
        return projects;
    }
}