package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.ISoftwareLanguageService;
import kodlama.io.devs.business.requests.CreateSoftwareLanguageRequest;
import kodlama.io.devs.business.requests.DeleteSoftwareLanguageRequest;
import kodlama.io.devs.business.requests.UpdateSoftwareLanguageRequest;
import kodlama.io.devs.business.responses.GetAllSoftwareLanguageResponse;
import kodlama.io.devs.business.responses.GetByIdSoftwareLanguageResponse;
import kodlama.io.devs.dataAccess.abstracts.ISoftwareLanguageRepository;

import kodlama.io.devs.entities.concretes.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SoftwareLanguageManager implements ISoftwareLanguageService {
    private ISoftwareLanguageRepository iSoftwareLanguageRepository;
    @Autowired
    public SoftwareLanguageManager(ISoftwareLanguageRepository iSoftwareLanguageRepository) {
        this.iSoftwareLanguageRepository = iSoftwareLanguageRepository;
    }

    @Override
    public List<GetAllSoftwareLanguageResponse> getAll() {
        List<SoftwareLanguage> softwareLanguages = iSoftwareLanguageRepository.findAll();
        List<GetAllSoftwareLanguageResponse> softwareLanguageResponse = new ArrayList<GetAllSoftwareLanguageResponse>();

        for (SoftwareLanguage softwareLanguage: softwareLanguages
             ) {
            GetAllSoftwareLanguageResponse responseItem = new GetAllSoftwareLanguageResponse();
            responseItem.setId(softwareLanguage.getId());
            responseItem.setName(softwareLanguage.getName());
            softwareLanguageResponse.add(responseItem);
        }
        // İş Kuralları

        return softwareLanguageResponse;
    }

    @Override
    public GetByIdSoftwareLanguageResponse getById(int id) {
        SoftwareLanguage softwareLanguage = iSoftwareLanguageRepository.findById(id).get();
        GetByIdSoftwareLanguageResponse response = new GetByIdSoftwareLanguageResponse();
        response.setName(softwareLanguage.getName());
        return response;
    }

    @Override
    public void add(CreateSoftwareLanguageRequest createSoftwareLanguageRequest) {
        SoftwareLanguage softwareLanguage = new SoftwareLanguage();
        softwareLanguage.setName(createSoftwareLanguageRequest.getName());
        this.iSoftwareLanguageRepository.save(softwareLanguage);
    }

    @Override
    public void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest) {
        iSoftwareLanguageRepository.deleteById(deleteSoftwareLanguageRequest.getId());
    }

    @Override
    public void update(int id, UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest) {
        if(!updateSoftwareLanguageRequest.getName().isEmpty()){
            SoftwareLanguage softwareLanguage = iSoftwareLanguageRepository.findById(id).get();
            softwareLanguage.setName(updateSoftwareLanguageRequest.getName());
            iSoftwareLanguageRepository.save(softwareLanguage);
        }
    }
}
