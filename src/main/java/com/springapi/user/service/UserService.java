package com.springapi.user.service;

import com.springapi.user.exception.UserCollectionException;
import com.springapi.user.model.User;

import javax.validation.ConstraintViolationException;
import java.util.List;

public interface UserService {
    public void createUser(User user) throws ConstraintViolationException, UserCollectionException;

    public List<User> getAll();


    public User getSingleUser(String id) throws UserCollectionException;

    public void updateUser(String id, User user) throws UserCollectionException;

    public void deleteUserById(String id) throws UserCollectionException;


    List<User> getAllUsersSorted(String sortBy);

    List<User> findUsersByGender(String gender);

    List<User> findUsersBySubject(String subject);

    List<User> findUsersByAgeGreaterThan(int age);

    List<User> findUsersByAgeLessThan(int age);

    List<User> findUsersByAgeBetween(int maxAge, int minAge);


}
