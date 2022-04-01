package com.codegym.controller;

import com.codegym.model.Mailbox;
import com.codegym.repository.IMailboxRepository;
import com.codegym.service.IMailboxService;
import com.codegym.service.Impl.MailboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MailboxController {
    @Autowired
    IMailboxService mailboxService;

    @GetMapping(value = "/mailbox")
    public String showMailboxList(Model model){
        List<Mailbox> mailboxList = mailboxService.findAll();
        model.addAttribute("mailboxList",mailboxList);
        return "list";
    }
//    @PostMapping(value = "mailbox")
//    public String create(Mailbox mailbox){
//        mailboxService.create(mailbox);
//        return "create";
//    }
//
//    @GetMapping("/create")
//    public ModelAndView createMailbox(){
//
//        ModelAndView modelAndView = new ModelAndView("create", "mailbox",new Mailbox());
//        modelAndView.addObject("languegesList",new String[]{"English","Vietnamese","Japanese","Chinese"});
//        modelAndView.addObject("pageSizeList",new int[]{5,10,15,20});
//        return modelAndView;
//
//    }
//    @PostMapping("/create")
//    public String createMailboxForm(@RequestParam Mailbox mailbox, Model model){
//        mailboxService.create(mailbox);
//        return "index";
//
//    }


}
