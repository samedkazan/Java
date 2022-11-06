package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.ITechnologyService;
import kodlama.io.devs.business.requests.CreateTechnologyRequest;
import kodlama.io.devs.business.requests.DeleteTechnologyRequest;
import kodlama.io.devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.devs.business.responses.GetAllTechnologyResponse;
import kodlama.io.devs.dataAccess.abstracts.ISoftwareLanguageRepository;
import kodlama.io.devs.dataAccess.abstracts.ITechnologyRepository;

import kodlama.io.devs.entities.concretes.SoftwareLanguage;
import kodlama.io.devs.entities.concretes.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public class TechnologyManager implements ITechnologyService {

    private ITechnologyRepository iTechnologyRepository;
    private ISoftwareLanguageRepository iSoftwareLanguageRepository;

    @Autowired
    public TechnologyManager(ITechnologyRepository iTechnologyRepository,ISoftwareLanguageRepository iSoftwareLanguageRepository){
        this.iTechnologyRepository = iTechnologyRepository;
        this.iSoftwareLanguageRepository = iSoftwareLanguageRepository;
    }

    @Override
    public List<GetAllTechnologyResponse> getAll() {
        List<Technology> technologies = iTechnologyRepository.findAll();
        List<GetAllTechnologyResponse> responses = new ArrayList<>();
        for (Technology technology: technologies) {
            GetAllTechnologyResponse response = new GetAllTechnologyResponse();

            response.setName(technology.getName());
            response.setLanguageName(technology.getSoftwareLanguage().getName());

            responses.add(response);
        }
        return responses;
    }

    @Override
    public void add(CreateTechnologyRequest createTechnologyRequest) {
        Technology technology = new Technology();
        SoftwareLanguage softwareLanguage = iSoftwareLanguageRepository.findById(createTechnologyRequest.getSoftwareLanguageId()).get();
        technology.setName(createTechnologyRequest.getName());
        technology.setSoftwareLanguage(softwareLanguage);
        iTechnologyRepository.save(technology);

    }

    @Override
    public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
        iTechnologyRepository.deleteById(deleteTechnologyRequest.getId());

    }

    @Override
    public void update(int id, UpdateTechnologyRequest updateTechnologyRequest) {
        Technology technology = iTechnologyRepository.findById(id).get();
        SoftwareLanguage softwareLanguage = iSoftwareLanguageRepository.findById(updateTechnologyRequest.getSoftwareLanguageId()).get();
        technology.setName(updateTechnologyRequest.getName());
        technology.setSoftwareLanguage(softwareLanguage);
        iTechnologyRepository.save(technology);
    }
}

