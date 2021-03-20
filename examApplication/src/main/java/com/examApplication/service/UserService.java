package com.examApplication.service;

import com.examApplication.dao.UserDao;
import com.examApplication.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.Date;
import java.util.List;

@Path("/users")
public class UserService {
    private UserDao userDao = new UserDao();
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public User addUser(User user){
        return userDao.addUser(user);
    }

    @GET
    @Path("/{userName}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUserByName(@PathParam("userName") String name){
        return userDao.getUserByName(name);
    }

    @GET
    @Path("/{userBirthYear}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUserByBirthYear(@PathParam("userBirthYear") Date birthYear){
        return userDao.getUserByBirthDate(birthYear);
    }

    @GET
    @Path("/{userGender}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUserByGender(@PathParam("userGender") String gender){
        return userDao.getUserByGender(gender);
    }

    @GET
    @Path("/{requestDateTime}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAllRequest(@PathParam("requestDateTime") Date requestDateTime){
        return userDao.getAllRequest(requestDateTime);
    }

    @DELETE
    @Path("/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteRequestById(@PathParam("userId") Long userId){
        userDao.deleteRequestById(userId);
    }
}
