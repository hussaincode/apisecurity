package in.hussaincode.apisecurity.repo;

import in.hussaincode.apisecurity.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hussaincode(https://hussaincodes.in/)
 * @version 1.0
 * @since 02/10/2022
 * */
public interface UserRepo extends JpaRepository<AppUser,Long> {
    AppUser findByUsername(String username);

}
