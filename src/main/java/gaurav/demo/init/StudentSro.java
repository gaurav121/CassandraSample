package gaurav.demo.init;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentSro {


    private int id;

    private UUID studentID;

    private String name;

    private String standard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public UUID getStudentID() {
        return studentID;
    }

    public void setStudentID(UUID studentID) {
        this.studentID = studentID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
