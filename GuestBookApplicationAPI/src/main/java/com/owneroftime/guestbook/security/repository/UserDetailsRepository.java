package com.owneroftime.guestbook.security.repository;

import com.owneroftime.guestbook.security.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Ram
 * User Detail Repository which is handled the user details related operations
 *
 */
@Repository
public interface UserDetailsRepository extends JpaRepository<UserEntity, Long> {

    @Query("SELECT u FROM UserEntity u WHERE u.email = ?1")
    UserEntity loadUserByUsername(String email);

}
