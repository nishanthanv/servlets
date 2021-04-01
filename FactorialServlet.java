package factorial;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FactorialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FactorialServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int n=18;
        int i=1;
        int fact=1;
        

        if(n==0){
        	out.println("<h4>fact of 0"+"is"+n+"</h4>");
        }
        

        else{
        	while(i<=n){
        		fact=fact*i;
        		i=i+1;
        	} 
        	out.println("<h4>fact of " + n +"="+fact+ "</h4>");
        }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
