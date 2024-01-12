package io.github.mehdicharife.professormicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import io.github.mehdicharife.professormicroservice.domain.Professor;
import io.github.mehdicharife.professormicroservice.service.ProfessorService;

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @QueryMapping
    public Professor professorById(@Argument Long id) {
        return new Professor((long) 3, "John Smith");
        //return this.professorService.getProfessorById(id).get();
    }

    @QueryMapping
    public List<Professor> allProfessors() {
        return this.professorService.getAllProfessors();
    }
}
