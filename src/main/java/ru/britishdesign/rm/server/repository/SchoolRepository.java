package ru.britishdesign.rm.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.britishdesign.rm.server.entity.School;

public interface SchoolRepository extends JpaRepository<School, Long> {
}