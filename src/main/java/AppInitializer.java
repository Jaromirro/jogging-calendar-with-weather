import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

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