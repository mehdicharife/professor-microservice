package io.github.mehdicharife.professormicroservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import io.github.mehdicharife.professormicroservice.domain.Professor;
import io.github.mehdicharife.professormicroservice.repository.ProfessorRepository;
import jakarta.annotation.PostConstruct;

@Service
public class ProfessorServiceImpl implements ProfessorService {
    
    private ProfessorRepository professorRepository;

    List<Professor> professors = new ArrayList<Professor>();

    public ProfessorServiceImpl(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    @PostConstruct
    public void init() {
        for (int i = 1; i <= 5; i++) {
            String fullName = "Professor " + i;
            professors.add(new Professor((long) i, fullName));
        }
    }

    public Optional<Professor> getProfessorById(Long id) {
        return this.professorRepository.findById(id);
    }

    public List<Professor> getAllProfessors() {
        return professors;
        //return this.professorRepository.findAll();
    }
}
