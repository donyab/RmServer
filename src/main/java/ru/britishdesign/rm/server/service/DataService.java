package ru.britishdesign.rm.server.service;

import ru.britishdesign.rm.server.entity.Remind;
import ru.britishdesign.rm.server.entity.School;

import java.util.List;

public interface DataService {
    List<Remind>getAll();
    Remind getByID(long id);
    Remind save(Remind remind);
    void remove(long id);

    List<School>getAllSchool();
}
