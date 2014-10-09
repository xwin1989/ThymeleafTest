package com.nx.common;

import org.junit.Before;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.messageresolver.StandardMessageResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 * Created by neal.xu on 2014/10/9.
 */
public class GTVGApplication {
    protected TemplateEngine templateEngine;

    @Before
    public void initializeTemplateEngine() {
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setTemplateMode("HTML5");
        templateResolver.setPrefix("views/");
        templateResolver.setSuffix(".html");
//        templateResolver.setCacheable(false);
        //if templateResolver is a new TemplateResolver Object , Need set resolver
//        templateResolver.setResourceResolver(new ClassLoaderResourceResolver());

        templateResolver.addTemplateAlias("yo","hello");

        StandardMessageResolver standardMessageResolver = new StandardMessageResolver();
        standardMessageResolver.addDefaultMessage("m","MMM,{0}");
        standardMessageResolver.addDefaultMessage("data.format","yyyy-MM-dd");

        templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        templateEngine.addMessageResolver(standardMessageResolver);
        //Local Can't Work , Need Test On Web
//        templateResolver.getCacheablePatternSpec().addPattern("/view");
//        templateResolver.getNonCacheablePatternSpec().addPattern("/user");

        //Clear Cache
        templateEngine.clearTemplateCache();
    }
}
