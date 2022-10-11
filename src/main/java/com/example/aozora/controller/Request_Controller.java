package com.example.aozora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/** リクエスト受付用コントローラ */
@Controller
public class Request_Controller {
    
    /** 画面表示用関数 */
    @RequestMapping("/aozora")
    public String showScreen() {
        return "front";
    }

    /** ユーザ or not 画面表示関数*/
    @GetMapping("/separate")
    public String separateDisplay(@RequestParam Boolean judge) {
        if (judge == true) {
            return "login";
        } else {
            return "nologin";
        }
    }
}
