// Класс Проект
class Project {
    private String name;
    private int hours;
    private String startingDate;
    private String endDate;

    public Project(String name, int hours, String startingDate, String endDate) {
        this.name = name;
        this.hours = hours;
        this.startingDate = startingDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}