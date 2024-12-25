// Базовый класс Сотрудник
abstract class Employee {
    private String socialSecurityNumber;
    private String name;
    private String email;

    public Employee(String socialSecurityNumber, String name, String email) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.email = email;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}