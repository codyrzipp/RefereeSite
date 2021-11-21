package site.referee.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import site.referee.backend.model.Match;
import site.referee.backend.repository.IMatchRepository;

@RestController
@RequestMapping("/api/v1/")
public class MatchController {
    @Autowired
    private IMatchRepository matchRepository;

    @GetMapping("/matches")
    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }
}
