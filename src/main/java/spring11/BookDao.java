package spring11;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BookDao implements IBookDao {
    public void add() {
        System.out.println("新增图书成功！");

    }
}
