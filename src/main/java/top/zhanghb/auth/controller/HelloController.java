package top.zhanghb.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String,Object> hello(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","zhanghb");
        map.put("age",28);
        return map;
    }

    @GetMapping("/job")
    public Map<String,Object> job(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","zhanghb");
        map.put("job","java");
        return map;
    }
}
