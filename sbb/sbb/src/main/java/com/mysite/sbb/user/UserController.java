package com.mysite.sbb.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/")
    public String main(Model model) {
        SiteUser siteUser = this.userService.getSiteUser();
        model.addAttribute("siteUser", siteUser);
        return "index";
    }
    @PostMapping("/user/suggestion")
    @ResponseBody
    public SiteUser suggestionUp() {
        return this.userService.suggestionUp();
    }
}
