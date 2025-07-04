package com.sisregistration.bmwsis.repository;

import com.sisregistration.bmwsis.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
    Optional<Subject> findBySubjectCode(String subjectCode);
    List<Subject> findByYearLevel(Integer yearLevel);
    List<Subject> findByYearLevelLessThanEqual(Integer yearLevel);
} 