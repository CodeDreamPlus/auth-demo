package com.codedreamplus.auth.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description: [测试controller]</p >
 * Created on 2022-04-05
 *
 * @author mo
 */
@RestController
public class TestController {
    /**
     * http://localhost:8080/test?name=liqiang
     * @param name
     * @return
     */
    @GetMapping("/test")
    public String test(@RequestParam String name) {
        return "hello" + name;
    }

    /**
     *http://localhost:8080/role?name=admin
     * http://localhost:8080/oauth/token
     * @param name
     * @return
     */
    @GetMapping("/role")
    public String role(@RequestParam String name) {
        return "role" + name;
    }

    /**
     *http://localhost:8080/authority?name=userAdd
     * @param name
     * @return
     */
    @PreAuthorize("hasAuthority('authority')")
    @GetMapping("/authority")
    public String authority(@RequestParam String name) {
        return "authority" + name;
    }

}