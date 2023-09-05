import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public abstract class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { AppConfig.class };
	}

//	@Override
//	protected Class<?>[] getServletConfigClasses() {
//		return new Class[] {Servlet.class};
//	}

}
//public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//	@Override
//	protected Class<?>[] getRootConfigClasses() {
//		return new Class[] {WebSecurityConfig.class};
//
//	}
//
//	@Override
//	protected Class<?>[] getServletConfigClasses() {
//		return new Class[] {AppConfig.class};
//	}
//
//
//	@Override
//	protected String[] getServletMappings() {
//		return new String[] { "/" };
//	}
//}