package io.github.mehdicharife.professormicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.mehdicharife.professormicroservice.domain.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{
    
}
