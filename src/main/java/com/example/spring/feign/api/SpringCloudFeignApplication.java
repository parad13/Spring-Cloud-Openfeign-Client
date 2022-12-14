package com.example.spring.feign.api;

import com.example.spring.feign.api.client.UserClient;
import com.example.spring.feign.api.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringCloudFeignApplication {
	@Autowired
	private UserClient client;

	@GetMapping("/findAllUser")
	public List<UserResponse> getAllUser(){
		return  client.getUsers();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignApplication.class, args);
	}

}
