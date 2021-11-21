package site.referee.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import site.referee.backend.model.Match;

@Repository
public interface IMatchRepository extends JpaRepository<Match, Long>{
    
}
