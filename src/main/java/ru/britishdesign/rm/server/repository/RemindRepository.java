package ru.britishdesign.rm.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.britishdesign.rm.server.entity.Remind;

public interface RemindRepository extends JpaRepository<Remind, Long> {
}


