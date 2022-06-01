package com.xu.service.impl;

import com.xu.dao.BookDao;
import com.xu.dao.impl.BookDaoImpl;
import com.xu.service.BookService;

/**
 * @author XTY~
 * @version 1.0
 * @Date: 2022-06-01 21:33
 * @Description:
 */
public class BookServiceImpl implements BookService
{
    private BookDao bookDao = new BookDaoImpl();

    public void save()
    {
        System.out.println("book service save...");
        bookDao.save();
    }
}