package com.codegym.repository.impl;

import com.codegym.model.Mailbox;
import com.codegym.repository.IMailboxRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class MailboxRepository implements IMailboxRepository {
    private static List<Mailbox> mailboxList = new ArrayList<>();
    private static List<String> languegesList;

    static {
        mailboxList.add(new Mailbox(1,"ngoc123@gmail.com","Vietnamese",10,true,"Ngoc Tran"));
        mailboxList.add(new Mailbox(2,"trong456@gmai.com","Japanese",5,false,"Trong Tran"));
        languegesList = Arrays.asList("Vietnamese","Japanese","English","Chinese");
    }

    private static int id = mailboxList.size()+1;

    public List<Mailbox>findAll(){

        return mailboxList;
    }
}
