// Класс Факультет
import java.util.ArrayList;
import java.util.List;
class Faculty {
    private String name;
    private Dean dean;
    private List<Institute> institutes;

    public Faculty(String name, Dean dean) {
        this.name = name;
        this.dean = dean;
        this.institutes = new ArrayList<>();
    }

    public void addInstitute(Institute institute) {
        institutes.add(institute);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dean getDean() {
        return dean;
    }

    public void setDean(Dean dean) {
        this.dean = dean;
    }

    public List<Institute> getInstitutes() {
        return institutes;
    }
}