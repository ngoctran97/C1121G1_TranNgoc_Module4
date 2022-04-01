package com.codegym.service;

import com.codegym.model.Mailbox;

import java.util.List;

public interface IMailboxService {

    List<Mailbox> findAll();
}
