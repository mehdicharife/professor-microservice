package io.github.mehdicharife.professormicroservice.service;

import java.util.Optional;

import io.github.mehdicharife.professormicroservice.domain.Professor;

public interface ProfessorService {

    Optional<Professor> getProfessorById(Long id);
}
