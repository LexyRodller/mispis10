
// Класс Курс
class Course {
    private int id; // уникальный номер курса
    private String name;
    private int weeklyDuration;

    public Course(int id, String name, int weeklyDuration) {
        this.id = id;
        this.name = name;
        this.weeklyDuration = weeklyDuration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeeklyDuration() {
        return weeklyDuration;
    }

    public void setWeeklyDuration(int weeklyDuration) {
        this.weeklyDuration = weeklyDuration;
    }
}