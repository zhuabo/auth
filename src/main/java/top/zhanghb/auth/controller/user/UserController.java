package top.zhanghb.auth.controller.user;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/user")
@Controller
public class UserController {

    @GetMapping("/getUserInfo")
    @ResponseBody
    public OAuth2Authentication getUserInfo(OAuth2Authentication user){
        return user;
    }


}
