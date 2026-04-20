package com.app.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class PropertyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String id = request.getParameter("id");

        // Fake data (replace with DB later)
        if ("1".equals(id)) {
            request.setAttribute("title", "Lagos Apartment");
            request.setAttribute("price", "#50,000/night");
            request.setAttribute("image", "images/house1.jpg");
        } else {
            request.setAttribute("title", "Abuja Villa");
            request.setAttribute("price", "#150,000/night");
            request.setAttribute("image", "images/house2.jpg");
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("property.jsp");
        dispatcher.forward(request, response);
    }
}