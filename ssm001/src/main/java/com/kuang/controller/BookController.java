package com.kuang.controller;

import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";//返回的是jsp页面
    }
    //跳转到添加页面
    @RequestMapping("/toAddBook")
    public  String toAddpaper()
    {
        return "addBook";
    }
    //添加
    @RequestMapping("/AddBook")
    public String addBook(Books books)
    {
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }
    //跳转到修改界面
    @RequestMapping("/toUpdate")
    public String toupdate(int bookId,Model model)
    {
        Books books = bookService.queryBookById(bookId);
        model.addAttribute("Qbook",books);
        return "updateBooks";
    }
    @RequestMapping("/updateBooks")
    public String updateBook(Model model, Books book) {
        bookService.updateBook(book);
        return "redirect:/book/allBook";
    }
    @RequestMapping("/deletebook")
    public String deletebook(int id)
    {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

}