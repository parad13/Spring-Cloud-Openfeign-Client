package com.example.spring.feign.api.client;

import com.example.spring.feign.api.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url="http://jsonplaceholder.typicode.com/", name="USER-CLIENT")
public interface UserClient {

    @GetMapping("/users")
    public List<UserResponse> getUsers();







}
