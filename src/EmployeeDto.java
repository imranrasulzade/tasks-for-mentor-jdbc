import java.time.LocalDate;

public class EmployeeDto {
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private Integer departmentId;
    private LocalDate birthdate;
    private Double salary;
    private Integer oldLocationId;
    private Integer newLocationId;

    public EmployeeDto(Integer employeeId, String firstName, String lastName, String jobTitle, Integer departmentId, LocalDate birthdate, Double salary, Integer oldLocationId, Integer newLocationId) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.departmentId = departmentId;
        this.birthdate = birthdate;
        this.salary = salary;
        this.oldLocationId = oldLocationId;
        this.newLocationId = newLocationId;
    }


    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getOldLocationId() {
        return oldLocationId;
    }

    public void setOldLocationId(Integer oldLocationId) {
        this.oldLocationId = oldLocationId;
    }

    public Integer getNewLocationId() {
        return newLocationId;
    }

    public void setNewLocationId(Integer newLocationId) {
        this.newLocationId = newLocationId;
    }



    @Override
    public String toString() {
        return "EmployeeDto{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", departmentId=" + departmentId +
                ", birthdate=" + birthdate +
                ", salary=" + salary +
                ", oldLocationId=" + oldLocationId +
                ", newLocationId=" + newLocationId +
                '}';
    }
}
