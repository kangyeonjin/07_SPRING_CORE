package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.autowired.common.BookDAO;
import com.ohgiraffers.section01.autowired.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.PanelUI;
import java.util.List;

//@service :@component의 세분화 어노테이션의 한 종류로 service계층에서 사용한다.
@Service("bookServiceConstructor")
public class BookService {

    //BookDAO타입의 Bean객체를 이 프로퍼티에 자동으로 주입해준다.
    @Autowired
    private BookDAO bookDAO;

    //도서목록 전체 조회
    public List<BookDTO> selectAllBooks(){

        return bookDAO.selectBookList();
    }

    //도서번호로 도서조회
    public BookDTO searchBookBySequence(int sequence){

        return bookDAO.selectOneBook(sequence);
    }

}
