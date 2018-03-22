package spring.core.beans;

public class EmailService {

    Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public EmailService() {
    }

    public EmailService(Student student) {

        this.student = student;
    }

    public void sendMessage(String msg, String email) {
        System.out.println("Email Sent to "+ email + " with Message="+msg);
    }
}
