package com.enfo.user.dao;

import com.enfo.user.entity.Librarian;

//import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianMapperDAO {
    public Librarian selectLibrarian(Integer id);
}

