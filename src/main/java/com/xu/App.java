package com.xu;

import com.xu.service.BookService;
import com.xu.service.impl.BookServiceImpl;

/**
 * @author XTY~
 * @version 1.0
 * @Date: 2022-06-01 21:34
 * @Description:
 */
public class App
{
    public static void main(String[] args)
    {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}