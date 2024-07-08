package com.ohgiraffers.section01.autowired.subsectiion02.constructor;

import com.ohgiraffers.section01.autowired.common.BookDAO;
import com.ohgiraffers.section01.autowired.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BookServiceConstructor")
public class BookService {

    private BookDAO bookDAO;

    //book타입의 bean객체를 constructor를 사용하여 자동으로 주입해준다
    @Autowired
    public BookService(BookDAO bookDAO){
        this.bookDAO = bookDAO;
    }

    /*스프링 4.3버전이후로는 생성자가 한개 뿐이라면 @autowired 어노테이션을 생략해도 자동으로
    * 생성자주입이 동작한다.따라서 생성자가 1개 이상일 경우에는 명시적으로 작성을 해주어야한다*/

    /*생성자주입 방식의 장점
    * 객체가 생성될때 모든 의존성이 주입되므로 의존성을 보장할수있다.
    * 객체의 불변성을 보장할수있다
    * (필드에 'final'을 사용가능하고,객체 생성이후 의존성을 변경 할 수 없어 안정성이 보장된다.
    * 코드가독성이 좋다
    * (해당 객체가 어떤 의존성을 가지고 있는지 명확히 알수있다.
    * di컨테이너와의 결합도가 낮기 때문에 테스트하기 좋다
    * (스프링컨테이너 없이 테스트를 할수있다)*/

    public List<BookDTO> selectAllBooks(){
        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence){
        return bookDAO.selectOneBook(sequence);
    }

}
