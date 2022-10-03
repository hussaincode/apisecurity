package in.hussaincode.apisecurity.service;

import in.hussaincode.apisecurity.domain.AppUser;
import in.hussaincode.apisecurity.domain.Role;

import java.util.List;

/**
 * @author hussaincode(https://hussaincodes.in/)
 * @version 1.0
 * @since 02/10/2022
 * */

public interface UserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    AppUser getUser(String username);
    List<AppUser> getUser();
}
