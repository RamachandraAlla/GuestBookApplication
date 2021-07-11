package com.owneroftime.guestbook.security.service;

import com.owneroftime.guestbook.security.model.UserModel;


/**
 * 
 * @author Ram
 * User Service Interface
 *
 */
public interface UserService {
    Void createUser(UserModel userModel) throws Exception;
    UserModel getUserDetailsByEmail(String emailIO) throws Exception;
}
