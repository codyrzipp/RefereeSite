package site.referee.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import site.referee.backend.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{
    
}
