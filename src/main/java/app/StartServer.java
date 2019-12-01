package app;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.webapp.WebAppContext;

public class StartServer {

	public static void main(String[] args) {
		
		try {
			//Create Jetty Server Instance at 8080 port
			Server server = new Server(8080);
			
			//Creating Web Application Instance
			WebAppContext context = new WebAppContext();
			context.setDescriptor(context + "src/main/java/webapp/WEB-INF/web.xml");
			//Setting welcome web page to index.jsp
			context.setResourceBase(".");
			
			ContextHandlerCollection contexts = new ContextHandlerCollection();
			contexts.setHandlers(new Handler[] {context});
			
			server.setHandler(contexts);
			
			
			//Starting server thread
			server.start();
			server.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
