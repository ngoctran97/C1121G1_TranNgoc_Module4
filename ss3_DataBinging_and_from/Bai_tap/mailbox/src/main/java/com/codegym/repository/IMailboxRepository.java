package com.codegym.repository;

import com.codegym.model.Mailbox;

import java.util.List;

public interface IMailboxRepository {
    List<Mailbox> findAll();
}
