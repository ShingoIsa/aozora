package com.example.aozora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.aozora.entity.UserInform;
import com.example.aozora.form.UserInform_f;
import com.example.aozora.service.AozoraService;

/** リクエスト受付用コントローラ */
@Controller
@RequestMapping("/aozora")
public class Request_Controller {

    @Autowired
    AozoraService service;
    
    /** 画面表示用関数 */
    @GetMapping
    public String showScreen() {
        return "front";
    }

    /* 「form-backing bean」の初期化 */
    @ModelAttribute
    public UserInform_f setUpForm() {
        return new UserInform_f();
    }

    /** ユーザ or not 画面表示関数*/
    @PostMapping("/separate")
    public String separateDisplay(@RequestParam Boolean judge) {
        if (judge == true) {
            return "login";
        } else {
            return "nologin";
        }
    }

    @PostMapping("/separate2")
    public String separate2Display(@RequestParam Boolean divide) {
        if (divide == true) {
            return "nologin2";
        } else {
            return "login2";
        }
    }

    /* ユーザ情報登録リクエストハンドラメソッド */
    @PostMapping("/insert")
    public String insert(@Validated UserInform_f form, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        // formからentityへの詰め替え
        UserInform ent = new UserInform();
        ent.setSei(form.getSei());
        ent.setMei(form.getMei());
        ent.setEmail(form.getEmail());

        // 入力チェックされた場合
        if (!bindingResult.hasErrors()) {    
            
            service.insert(ent);
            redirectAttributes.addFlashAttribute("sei", ent.getSei());
            redirectAttributes.addFlashAttribute("mei", ent.getMei());
            return "redirect:/aozora/insertfinish";
        } else {
            // エラーがある場合は、一覧表示処理を呼びます
            return "login";
        }
    }

    @GetMapping("/insertfinish")
    public String insertfinish(@ModelAttribute("sei") String sei, @ModelAttribute("mei") String mei) {
        return "complete_registration";
    }
}

