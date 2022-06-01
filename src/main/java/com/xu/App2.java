package com.xu;

import com.xu.dao.BookDao;
import com.xu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author XTY~
 * @version 1.0
 * @Date: 2022-06-01 21:42
 * @Description:
 */
public class App2
{
    public static void main(String[] args)
    {
        //3.获取Ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //4.获取bean
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        //最后利用获取到的对象实现功能
//        bookDao.save();
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}