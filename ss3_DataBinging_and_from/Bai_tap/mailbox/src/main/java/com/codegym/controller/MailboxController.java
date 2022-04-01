package com.codegym.controller;

import com.codegym.model.Mailbox;
import com.codegym.service.IMailboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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


    @PostMapping(value = "mailbox")
    public String create(Mailbox mailbox){
        mailboxService.create(mailbox);
        return "create";
    }
    @PostMapping("/save")
    public String save(Mailbox mailbox) {
        List<Mailbox> mailboxList = mailboxService.findAll();
        mailbox.setId(mailboxList.size()+1);
        mailboxService.save(mailbox);
        return "redirect:/mailbox";
    }
//
//    @GetMapping("/create")
//    public ModelAndView createMailbox(){
//
//        ModelAndView modelAndView = new ModelAndView("create", "mailbox",new Mailbox());
//
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
