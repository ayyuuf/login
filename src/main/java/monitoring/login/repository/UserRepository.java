package monitoring.login.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import monitoring.login.model.UserDao;
public interface UserRepository extends JpaRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}