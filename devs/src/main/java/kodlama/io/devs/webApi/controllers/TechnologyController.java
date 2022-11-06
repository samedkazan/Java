package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.ITechnologyService;
import kodlama.io.devs.business.requests.CreateTechnologyRequest;
import kodlama.io.devs.business.requests.DeleteTechnologyRequest;
import kodlama.io.devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.devs.business.responses.GetAllTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {
    private ITechnologyService iTechnologyService;
    @Autowired
    public TechnologyController(ITechnologyService iTechnologyService){
        this.iTechnologyService = iTechnologyService;
    }

    @GetMapping("/getall")
    public List<GetAllTechnologyResponse> getAll(){
        return iTechnologyService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateTechnologyRequest createTechnologyRequest){
        this.iTechnologyService.add(createTechnologyRequest);
    }

    @DeleteMapping("/delete")
    public void deleteById(DeleteTechnologyRequest deleteTechnologyRequest){
        this.iTechnologyService.delete(deleteTechnologyRequest);
    }

    @PutMapping("/update")
    public void updateById(int id, UpdateTechnologyRequest updateTechnologyRequest){
        this.iTechnologyService.update(id,updateTechnologyRequest);
    }
}
