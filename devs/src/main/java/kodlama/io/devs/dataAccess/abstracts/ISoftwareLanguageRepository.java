package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.concretes.SoftwareLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ISoftwareLanguageRepository extends JpaRepository<SoftwareLanguage,Integer> {


}
