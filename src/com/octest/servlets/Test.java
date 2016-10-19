package com.octest.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
       
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Cookie[] cookies=request.getCookies();
    	if(cookies !=null){
    		for(Cookie cookie :cookies){
    			if(cookie.getName().equals("prenom")){
    				request.setAttribute("prenom",cookie.getValue());
    			}
    			if(cookie.getName().equals("nom")){
    				request.setAttribute("nom",cookie.getValue());
    			}
    		}
    	}
    	this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
        
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
      
        Cookie cookiePrenom=new Cookie("prenom",prenom);
        cookiePrenom.setMaxAge(60*60*24);
        Cookie cookieNom=new Cookie("nom",nom);
        cookieNom.setMaxAge(3600);
        response.addCookie(cookieNom);
        response.addCookie(cookiePrenom);
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
    }

}