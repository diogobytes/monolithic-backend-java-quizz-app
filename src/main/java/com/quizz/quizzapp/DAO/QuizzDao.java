package com.quizz.quizzapp.DAO;

import com.quizz.quizzapp.model.Quizz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizzDao extends JpaRepository<Quizz, Integer> {
}
