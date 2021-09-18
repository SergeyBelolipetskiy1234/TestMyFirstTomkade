package ru.belolipetskiy;
@org.springframework.stereotype.Controller
public class HelloController {
    @org.springframework.web.bind.annotation.GetMapping("/hello-world")
public String sayHello() {
    return "hello_world";
}
}
