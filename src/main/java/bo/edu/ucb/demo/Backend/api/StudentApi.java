package bo.edu.ucb.demo.Backend.api;


import bo.edu.ucb.demo.Backend.bl.CursoBl;
import bo.edu.ucb.demo.Backend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v2/student")
public class StudentApi {
    private CursoBl cursoBl;

    @Autowired
    public StudentApi(CursoBl cursoBl){this.cursoBl=cursoBl;}

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Student create(@RequestBody Student student) {
        return cursoBl.createStudent(student);
    }
}
