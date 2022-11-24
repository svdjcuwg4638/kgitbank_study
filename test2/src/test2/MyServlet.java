package test2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	//implements Serializable

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		
		String html = "";
		html += "<!DOCTYPE html>\n";
		html += "<html lang=\"ko\">\n";
		html += "<head>\n";
		html += "<meta charset=\"UTF-8\">";
		html += "<title>Servlet</title>\n";
		html += "</head>\n";
		html += "<body>\n";
		html += "<h1>Now : %s</h1>\n";
		html += "</body>\n";
		html += "</html>\n";
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String now = sdf.format(date);
		
		html = String.format(html, now);
		
		out.write(html);
		out.flush();
		out.close();
	}

}
