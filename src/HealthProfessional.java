public class HealthProfessional {

    /**
     * ID
     */
    private long id;

    /**
     * name
     */
    private String name;

    private String phone;

    public HealthProfessional() {
    }

    public HealthProfessional(long id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public void print() {
        System.out.println("HealthProfessional{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "HealthProfessional{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
