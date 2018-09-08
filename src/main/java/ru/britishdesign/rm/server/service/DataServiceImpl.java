package ru.britishdesign.rm.server.service;

import ru.britishdesign.rm.server.entity.Remind;
import ru.britishdesign.rm.server.entity.School;
import ru.britishdesign.rm.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.britishdesign.rm.server.repository.SchoolRepository;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {
    private RemindRepository repository;
    private SchoolRepository schoolRepository;

    @Autowired
    public void setRemindRepository(RemindRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setSchoolRepository(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public List<Remind> getAll() {
        return repository.findAll();
    }

    public Remind getByID(long id) {
        return repository.getOne(id);
    }

    public Remind save(Remind remind) {
        return repository.saveAndFlush(remind);
    }

    public void remove(long id) {
        repository.deleteById(id);

    }

    public List<School> getAllSchool() {
        return schoolRepository.findAll();
    }
}
