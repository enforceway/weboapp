package com.enfo.user.serviceImpl;

import com.enfo.user.dao.LibrarianMapperDAO;
import com.enfo.user.entity.Librarian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enfo.user.service.LibrarianService;

@Service
public class LibrarianServiceImpl implements LibrarianService {

    @Autowired
    private LibrarianMapperDAO librarianMapperDAO;

    @Override
    public Librarian selectLibrarian(Integer id) {
        return this.librarianMapperDAO.selectLibrarian(id);
    }

    @Override
    public Librarian selectLibrarian() {
        return new Librarian();
    }

}