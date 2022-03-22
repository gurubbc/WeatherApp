package com.ofss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WeatherServlet
 */
public class WeatherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WeatherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String cityname=request.getParameter("cityname");
		// The servlet is taking the responsibility of creating the RESPONSE / VIEW
		// Which is not acceptable, which is against MVC rule
		// The role of the servlet is not executing any BUSINESS logic
		// The role of the servlet (controller layer) is just route to different components
		if (cityname.equals("Bangalore"))
			pw.println("The weather is 25"); // response  for Bangalore
		else if (cityname.equals("Mumbai"))
			pw.println("The weather is 30"); // response for Mumbai
		else 
			pw.println("I don't have the value for the entered city - INVALID CITY NAME");
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
