package gaurav.demo.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("studentService")
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private Convertors convertors;

    public HttpStatus addStudent(StudentSro studentSro){

        Student student=convertors.getStudentfromStudentSRO(studentSro);
        studentRepo.save(student);
        return HttpStatus.OK;
    }

    public StudentSro getStudent(int id){

        Student student=studentRepo.findOne(id);
        return convertors.getStudentSROfromStudent(student);

    }


}
