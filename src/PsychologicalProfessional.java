public class PsychologicalProfessional extends HealthProfessional {

    private String psychometricScore;

    public PsychologicalProfessional() {

    }

    public PsychologicalProfessional(long id, String name, String phone, String psychometricScore) {
        super(id, name, phone);
        this.psychometricScore = psychometricScore;

    }

    public void print() {
        super.print();
        System.out.println("PsychometricScore: " + psychometricScore);
    }

    @Override
    public String toString() {
        return "PsychologicalProfessional{" +
                "psychometricScore='" + psychometricScore + '\'' +
                ", id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                '}';
    }
}
