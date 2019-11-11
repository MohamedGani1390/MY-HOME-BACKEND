package gani.house.demo.service;

import gani.house.demo.domain.Milk;
import gani.house.demo.domain.MilkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MilkService {
    @Autowired
    MilkRepository milkRepository;

    public List<Milk> getAllPersons() {
        List<Milk> milkDetails = new ArrayList<Milk>();
        milkRepository.findAll().forEach(person -> milkDetails.add(person));
        return milkDetails;
    }

    public Milk getPersonById(int id) {
        return milkRepository.findById(id).get();
    }

    public void saveOrUpdate(Milk person) {
        milkRepository.save(person);
    }

    public void delete(int id) {
        milkRepository.deleteById(id);
    }

}
