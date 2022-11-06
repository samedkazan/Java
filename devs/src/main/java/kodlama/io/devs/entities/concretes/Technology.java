package kodlama.io.devs.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="technologies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="technologyId")
    private int id;

    @Column(name="technologyName")
    private String name;

    @ManyToOne
    @JoinColumn(name = "software_language_id")
    private SoftwareLanguage softwareLanguage;
}
