package io.ace.springframework.mvc.config;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Nullable
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationConfig.class};
    }

    @Nullable
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        /*
        optionally  also set maxFileSize , maxRequestSize, fileSizeThreshold
         */
        registration.setMultipartConfig(new MultipartConfigElement("/tmp"));

        /*
        to enable logging of request parameter and headers
        */
        registration.setInitParameter("enableLoggingRequestDetails", "true");
    }
}
