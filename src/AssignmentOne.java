import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {

    public static void main(String[] args) {

        // Part 3 – Using classes and objects
        GeneralPractitioner generalPractitioner1 = new GeneralPractitioner(1, "John Doe", "1234567891", "ear");
        GeneralPractitioner generalPractitioner2 = new GeneralPractitioner(2, "Dog Lee", "1234567892", "nose");
        GeneralPractitioner generalPractitioner3 = new GeneralPractitioner(3, "James", "1234567893", "throat");


        PsychologicalProfessional psychologicalProfessional1 = new PsychologicalProfessional(1, "Zhou ZiHao", "88888888", "88");
        PsychologicalProfessional psychologicalProfessional2 = new PsychologicalProfessional(2, "Marry Li", "99999999", "90");

        generalPractitioner1.print();
        generalPractitioner2.print();
        generalPractitioner3.print();

        psychologicalProfessional1.print();
        psychologicalProfessional2.print();


        System.out.println("------------------------------");


        // Part 5 – Collection of appointments
        List<Appointment> list = new ArrayList<>();

        Appointment appointment1 = new Appointment("zhang san", "18829289099", "08:00", generalPractitioner1);
        createAppointment(list, appointment1);
        Appointment appointment2 = new Appointment("wang wu", "18829289091", "09:00", generalPractitioner2);
        createAppointment(list, appointment2);

        Appointment appointment3 = new Appointment("li si", "18829289092", "08:00", psychologicalProfessional1);
        createAppointment(list, appointment3);
        Appointment appointment4 = new Appointment("xiao ming", "18829289093", "07:00", psychologicalProfessional2);
        createAppointment(list, appointment4);

        printExistingAppointments(list);

        cancelBooking(list, "18829289099");

        printExistingAppointments(list);


        System.out.println("------------------------------");

    }

    public static void createAppointment(List<Appointment> list, Appointment appointment) {
        list.add(appointment);
    }


    public static void printExistingAppointments(List<Appointment> list) {
        if (list.isEmpty()) {
            System.out.println("No existing appointments");
        } else {
            for (Appointment appointment : list) {
                appointment.print();
            }
        }
    }

    public static void cancelBooking(List<Appointment> list, String phone) {
        for (Appointment appointment : list) {
            if (appointment.getPhone().equals(phone)) {
                list.remove(appointment);
                System.out.println("Appointment cancelled for phone number: " + phone);
                return;
            }
        }
        System.out.println("No appointment found for phone number: " + phone);
    }

}
