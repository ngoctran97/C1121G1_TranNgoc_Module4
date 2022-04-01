package com.codegym.service.Impl;

import com.codegym.model.Mailbox;
import com.codegym.repository.IMailboxRepository;
import com.codegym.service.IMailboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailboxService implements IMailboxService {
    @Autowired
    IMailboxRepository mailboxRepository;

    @Override
    public List<Mailbox> findAll() {

        return mailboxRepository.findAll();
    }
}
