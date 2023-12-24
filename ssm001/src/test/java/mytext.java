import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytext {
    @Test
    public void text()
    {
     ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
      BookService bookserviceimpl =   (BookService)context.getBean("BookServiceImpl");
      for (Books book:bookserviceimpl.queryAllBook())
      {
          System.out.println(book);
      }
    }
    @Test
    public void text1()
    {
        String a1 = "ab";
        String a2 = "cd";
        String a3 = "ab"+"cd";
        String a4 = a1+a2;
        System.out.println(a3.equals(a4));
    }
}
