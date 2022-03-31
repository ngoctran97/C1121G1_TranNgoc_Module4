package com.codegym.controller;

import com.codegym.model.Mailbox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailboxController {
    @GetMapping(value = "/mailbox")
    public ModelAndView showForm(){
        ModelAndView modelAndView = new ModelAndView("index","mailbox",new Mailbox());
        modelAndView.addObject("languegesList",new String[]{"English","Vietnamese","Japanese","Chinese"});
        modelAndView.addObject("pageSizeList",new int[]{5,10,15,20});
        return modelAndView;
    }


}
