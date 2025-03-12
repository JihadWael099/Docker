package org.microserviceproject.dockerdemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class DemoController {

    private final Repository repository;


    public DemoController(Repository repository) {
        this.repository = repository;
    }


    @GetMapping("/Demos")
    public List<DemoEntity> findAll(){
        return repository.findAll();
    }

    @PostMapping("/Demo")
    public String addDemo(@RequestParam String name){
        DemoEntity demoEntity =new DemoEntity();
        demoEntity.setName(name);
        repository.save(demoEntity);
        return demoEntity.getName();
    }
}
