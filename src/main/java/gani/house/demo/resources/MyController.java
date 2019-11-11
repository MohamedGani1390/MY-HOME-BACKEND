package gani.house.demo.resources;


import gani.house.demo.domain.Milk;
import gani.house.demo.service.MilkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MyController {

    @Autowired
    MilkService milkService;

    @GetMapping("/milk")
    private List<Milk> getAllDetails() {
        return milkService.getAllPersons();
    }

    @GetMapping("/milk/{id}")
    private Milk getMilkById(@PathVariable("id") int id) {
        return milkService.getPersonById(id);
    }

    @DeleteMapping("/milk/{id}")
    private void deleteMilkById(@PathVariable("id") int id) {
        milkService.delete(id);
    }

    @PostMapping("/milk")
    private Integer saveMilk(@RequestBody Milk milk) {
        milkService.saveOrUpdate(milk);
        return milk.getId();
    }
}