package gaurav.demo.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/student")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/addStudent",method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity addStudent(@RequestBody StudentSro studentSro){

        studentService.addStudent(studentSro);

      return ResponseEntity.ok(HttpStatus.OK);
    }
    @RequestMapping(value = "/getStudent/{id}",method = RequestMethod.GET, consumes = "application/json")
    public ResponseEntity getStudent(@PathVariable int id){


        return ResponseEntity.ok(studentService.getStudent(id));
    }

}
