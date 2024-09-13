package ir.spring.createapp002;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class Config extends WsConfigurerAdapter {

	@Bean
	 ServletRegistrationBean<MessageDispatcherServlet> message(ApplicationContext appContext) {
		MessageDispatcherServlet sev = new MessageDispatcherServlet();
		sev.setApplicationContext(appContext);
		sev.setTransformSchemaLocations(true);
		return new ServletRegistrationBean<>(sev, "/ws/*");
	}
	
	@Bean(name="webService") 
	 DefaultWsdl11Definition defaultwsdl(XsdSchema webServiceSchema) {
		DefaultWsdl11Definition d=new DefaultWsdl11Definition();
		d.setPortTypeName("webServicePort");
		d.setLocationUri("/ws");
		d.setTargetNamespace("http://www.spring.ir/createapp002/object");
		d.setSchema(webServiceSchema);
		return d;
	}
	
	@Bean
	 XsdSchema webServiceSchema() {
		return new SimpleXsdSchema(new ClassPathResource("webService.xsd"));
	}

}
