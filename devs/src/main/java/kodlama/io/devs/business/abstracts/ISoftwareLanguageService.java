package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.business.requests.CreateSoftwareLanguageRequest;
import kodlama.io.devs.business.requests.DeleteSoftwareLanguageRequest;
import kodlama.io.devs.business.requests.UpdateSoftwareLanguageRequest;
import kodlama.io.devs.business.responses.GetAllSoftwareLanguageResponse;
import kodlama.io.devs.business.responses.GetByIdSoftwareLanguageResponse;

import java.util.List;

public interface ISoftwareLanguageService {
    List<GetAllSoftwareLanguageResponse> getAll();

    GetByIdSoftwareLanguageResponse getById(int id);
    void add(CreateSoftwareLanguageRequest createSoftwareLanguageRequest);
    void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest);

    void update(int id,UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest);

}
