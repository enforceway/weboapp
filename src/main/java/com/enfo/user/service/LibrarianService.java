package com.enfo.user.service;

import com.enfo.user.entity.Librarian;

public interface LibrarianService {
    Librarian selectLibrarian(Integer id);
    Librarian selectLibrarian();
}