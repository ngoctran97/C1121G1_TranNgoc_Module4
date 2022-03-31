package com.codegym.service.Impl;

import com.codegym.model.Mailbox;
import com.codegym.service.IMailboxService;
import org.springframework.stereotype.Service;

@Service
public class MailboxService implements IMailboxService {
    @Override
    public void create(Mailbox mailbox) {
        mailbox.setLangueges(mailbox.getLangueges());
        mailbox.setPageSize(mailbox.getPageSize());
        mailbox.setSpamrfilter(mailbox.isSpamrfilter());
        mailbox.setSingnatune(mailbox.getSingnatune());

    }
}
