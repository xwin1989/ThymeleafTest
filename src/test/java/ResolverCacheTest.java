import com.nx.common.GTVGApplication;
import com.nx.domain.Money;
import com.nx.domain.User;
import org.junit.Test;
import org.thymeleaf.context.Context;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by neal.xu on 2014/10/9.
 */
public class ResolverCacheTest extends GTVGApplication {

    @Test
    public void test() throws InterruptedException {
        Context context = new Context();
        context.setVariable("welcome", "neal");

        List<User> users = new ArrayList<>();
        users.add(new User(1, "x1",new Money(1,10)));
        users.add(new User(2, "x2",new Money(2,20)));
        users.add(new User(3, "x3",new Money(3,30)));

        context.setVariable("users", users);
        context.setVariable("today", new Date());
        context.setVariable("calendar", Calendar.getInstance());

        //save cache is yo. Not is hello
        String hello = templateEngine.process("yo", context);
        System.out.println(hello);

        //Clear yo cache
        templateEngine.clearTemplateCacheFor("yo");
    }
}
