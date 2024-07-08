package com.ohgiraffers.section01.autowired.common;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("bookDAO")
public class BookDAOImpl implements BookDAO{

    private Map<Integer, BookDTO> bookList;

    public BookDAOImpl(){
        bookList = new HashMap<>();
        bookList.put(1,
                new BookDTO(1, 123456, "앗녕", "강연진", "출판", LocalDate.now()));
    }

    @Override
    public List<BookDTO> selectBookList(){
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO selectOneBook(int sequence){
        return bookList.get(sequence);
    }


}
