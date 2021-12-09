package com.autentia.DockerSpringNetflixGreetingMicroservice.controller;

import com.autentia.DockerSpringNetflixGreetingMicroservice.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  IGreetingService greetingService;

  public GreetingController(@Autowired IGreetingService greetingService) {
    this.greetingService = greetingService;
  }

  @GetMapping("/greet")
  public String getGreeting() throws Exception {
    return greetingService.getServiceGreeting();
  }

}
