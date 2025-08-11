package CRUIDtoSPRINGboot.dao;

import CRUIDtoSPRINGboot.model.User;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao {
    List<User> getAllUsers();
    void saveUser(User user);
    User getUserById(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
}