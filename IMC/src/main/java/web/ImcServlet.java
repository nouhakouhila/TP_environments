package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;

/**
 * Servlet implementation class ImcServlet
 */
public class ImcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		try (PrintWriter out = response.getWriter()){
			String p = request.getParameter("poids");
			String t = request.getParameter("taille");
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title> Servlet ImcServlet </title>");
			out.println("</head>");
			out.println("<body>");
			out.println("Poids "+ p + "<br>");
			out.println("Taille "+ t + "<br>");
			out.println("</body>");
			out.println("</html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    PrintWriter out = response.getWriter()
			String p = request.getParameter("poids");
			String t = request.getParameter("taille");
			double imc = Double.parseDouble(p)/Double.parseDouble(t)*Double.parseDouble(t);
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title> Servlet ImcServlet </title>");
			out.println("</head>");
			out.println("<body>");
			out.println("Poids "+ p + "<br>");
			out.println("Taille "+ t + "<br>");
			out.println("IMC "+ imc + "<br>");
			out.println("</body>");
			out.println("</html>");
	}

}
