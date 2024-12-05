package com.abhilasha.rest_api_demo.controller;

import com.abhilasha.rest_api_demo.model.CloudUser;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clouduser")
public class CloudUserApiService {

    CloudUser user ;

    @GetMapping("{userId}")
    public CloudUser getCloudUserDetails(String userId)
    {
        //return new CloudUser("U1", "User one",
               // "Address one", "xxxxxx");
        return user;
    }

    @PostMapping
    public String createUser(@RequestBody CloudUser user)
    {
        this.user = user;
        return "User is created successfully.";
    }

    @PutMapping
    public String updateUser(@RequestBody CloudUser user)
    {
        this.user = user;
        return "User is updated successfully.";
    }

    @DeleteMapping("{userId}")
    public String deleteUser(String userId)
    {
        this.user=null;
        return "User is deleted successfully.";
    }
}
