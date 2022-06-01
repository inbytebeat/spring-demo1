package com.xu.service.impl;

import com.xu.dao.BookDao;
import com.xu.service.BookService;

/**
 * @author XTY~
 * @version 1.0
 * @Date: 2022-06-01 21:33
 * @Description:
 */
public class BookServiceImpl implements BookService
{
    //5.删除业务层中，使用new方式创建的dao对象
    private BookDao bookDao;

    public void save()
    {
        bookDao.save();
    }

    //我们设置一个方法，来获取具体实现所必须的dao对象，而不是自己创建
    public void setBookDao(BookDao bookDao)
    {
        this.bookDao = bookDao;
    }
}