package org.example;

import org.example.DeepakConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class  MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
       // return new Class[]{DeepakConfig.class};
       return  null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
      //  return  null;
      return new Class[]{DeepakConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
