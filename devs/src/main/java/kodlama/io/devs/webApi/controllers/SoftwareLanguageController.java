package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.ISoftwareLanguageService;
import kodlama.io.devs.business.requests.CreateSoftwareLanguageRequest;
import kodlama.io.devs.business.requests.DeleteSoftwareLanguageRequest;
import kodlama.io.devs.business.requests.UpdateSoftwareLanguageRequest;
import kodlama.io.devs.business.responses.GetAllSoftwareLanguageResponse;
import kodlama.io.devs.business.responses.GetByIdSoftwareLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//annotation
@RequestMapping("/api/SoftwareLanguage")
public class SoftwareLanguageController {
    private ISoftwareLanguageService iSoftwareLanguageService;
    @Autowired
    public SoftwareLanguageController(ISoftwareLanguageService iSoftwareLanguageService) {
        this.iSoftwareLanguageService = iSoftwareLanguageService;
    }
    @GetMapping("/getAll")
    public List<GetAllSoftwareLanguageResponse> getAll(){
        return iSoftwareLanguageService.getAll();
    }

    @GetMapping("/{id}")
        public GetByIdSoftwareLanguageResponse getById(int id){
        return iSoftwareLanguageService.getById(id);
        }
    @PostMapping("/add")
    public void add(CreateSoftwareLanguageRequest createSoftwareLanguageRequest){
    this.iSoftwareLanguageService.add(createSoftwareLanguageRequest);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest){
    this.iSoftwareLanguageService.delete(deleteSoftwareLanguageRequest);
    }
    @PutMapping("/update")
    public void update(int id,UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest){
        this.iSoftwareLanguageService.update(id,updateSoftwareLanguageRequest);
    }
}
