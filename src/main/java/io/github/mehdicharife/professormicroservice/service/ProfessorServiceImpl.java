package io.github.mehdicharife.professormicroservice.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import io.github.mehdicharife.professormicroservice.domain.Professor;
import io.github.mehdicharife.professormicroservice.repository.ProfessorRepository;

@Service
public class ProfessorServiceImpl implements ProfessorService {
    
    private ProfessorRepository professorRepository;

    public ProfessorServiceImpl(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public Optional<Professor> getProfessorById(Long id) {
        return this.professorRepository.findById(id);
    }
}
