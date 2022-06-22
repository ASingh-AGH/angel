package pl.edu.agh.softwarestudio.angel.security.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name="user")
public class User {

    @Id
    @SequenceGenerator(name="user_id_seq",
            sequenceName="user_id_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="user_id_seq")
    @Column(name = "id", updatable=false)
    private Integer id;

    private String username;
    private String password;
    private String email;
    private String role;
    private String fullname;

}
