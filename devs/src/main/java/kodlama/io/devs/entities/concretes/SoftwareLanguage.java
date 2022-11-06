package kodlama.io.devs.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name="software_languages")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SoftwareLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="software_language_name")
    private String name;
    @OneToMany(mappedBy = "softwareLanguage")
    private List<Technology> technologies;

}
