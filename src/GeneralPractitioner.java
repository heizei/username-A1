public class GeneralPractitioner extends HealthProfessional {

    private String specialty;

    public GeneralPractitioner() {

    }

    public GeneralPractitioner(long id, String name, String phone, String specialty) {
        super(id, name, phone);
        this.specialty = specialty;
    }

    public void print() {
        super.print();
        System.out.println("Specialty: " + specialty);
    }

    @Override
    public String toString() {
        return "GeneralPractitioner{" +
                "specialty='" + specialty + '\'' +
                ", id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                '}';
    }
}
