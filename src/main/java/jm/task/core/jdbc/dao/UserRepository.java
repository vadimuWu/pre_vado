package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import javax.persistence.QueryHint;
import java.util.Optional;
import java.util.UUID;
/*

public interface UserRepository extends JpaRepostory<UUID, User>{
    @QueryHint(value = "SELECT User u where u.id =d :i")
    Optional<User> getById(@Param UUID id);

}
*/
