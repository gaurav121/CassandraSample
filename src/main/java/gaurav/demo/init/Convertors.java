package gaurav.demo.init;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("convertors")
public class Convertors {

    public StudentSro getStudentSROfromStudent(Student student){

        StudentSro studentSro=new StudentSro();
        studentSro.setId(student.getId());
        studentSro.setName(student.getName());
        studentSro.setStudentID(student.getStudentID());
        studentSro.setStandard(student.getStandard());

        return studentSro;
    }

    public Student getStudentfromStudentSRO(StudentSro studentSro) {

        Student student = new Student();
        student.setName(studentSro.getName());
        student.setId(studentSro.getId());
        student.setStandard(studentSro.getStandard());
        student.setStudentID(UUID.randomUUID());
        return student;
    }
}
