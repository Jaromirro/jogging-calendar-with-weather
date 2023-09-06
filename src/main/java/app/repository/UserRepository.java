package app.repository;

import app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);

}
