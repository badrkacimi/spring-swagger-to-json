package com.badrkacimi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.badrkacimi.model.Users;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/api")
@Api(value="Badr Authentication API")
public class Controller {

    
    
    @GetMapping("/stagiares")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 401, message = "Unauthorized")})
    public Users users() {
        Users users = new Users();
        users.setId(1);
        users.setName("BADR");
        users.setSalary(3400);
        users.setTeamName("GRP");


        return users;
    }
    

}
