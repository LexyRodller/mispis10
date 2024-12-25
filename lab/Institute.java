// Класс Кафедра
import java.util.ArrayList;
import java.util.List;
class Institute {
    private String name;
    private String address;
    private List<ResearchEmployee> researchEmployees;

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
        this.researchEmployees = new ArrayList<>();
    }

    public void addResearchEmployee(ResearchEmployee employee) {
        researchEmployees.add(employee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ResearchEmployee> getResearchEmployees() {
        return researchEmployees;
    }
}