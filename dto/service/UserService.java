package com.example.dto.service;

import com.example.dto.DtoExample.Dto;
import com.example.dto.Repository.UserRepo;
import com.example.dto.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

   public List<Dto> getAllUsersLocation()  {

return userRepo.findAll()
        .stream()
        .map(this::convertEntityToDo)
        .collect(Collectors.toList());

   }

   private Dto   convertEntityToDo(User user){

       Dto dto= new Dto();
       dto.setUserid(user.getId());
       dto.setEmail(user.getEmail());
       dto.setPlace(user.getLocation().getPlace());


      dto.setLongitude((long) user.getLocation().getLongitude());

       dto.setLatitude((long) user.getLocation().getLatitude());

       return dto;

   }

}
