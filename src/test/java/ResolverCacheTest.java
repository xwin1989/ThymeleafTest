import org.junit.Test;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.resourceresolver.ClassLoaderResourceResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

/**
 * Created by neal.xu on 2014/10/9.
 */
public class ResolverCacheTest {
    @Test
    public void test() throws InterruptedException {
        TemplateResolver templateResolver = new TemplateResolver();
        templateResolver.setTemplateMode("HTML5");
        templateResolver.setPrefix("views/");
        templateResolver.setSuffix(".html");
        templateResolver.setCacheable(false);
        templateResolver.setResourceResolver(new ClassLoaderResourceResolver());


        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);

        Context context = new Context();
        context.setVariable("welcome", "neal");

        String hello = templateEngine.process("hello", context);
        System.out.println(hello);
    }
}
