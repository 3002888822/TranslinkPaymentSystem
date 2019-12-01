package translink_payment.translink.app;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class StartServer {

	public static void main(String[] args) {
		
		try {
			//Create Jetty Server Instance at 8080 port
			Server server = new Server(8080);
			
			//Creating Web Application Instance
			WebAppContext context = new WebAppContext();
			//Setting welcome web page to index.jsp
			context.setResourceBase("src/main/webapp/index.jsp");
			server.setHandler(context);
			
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
