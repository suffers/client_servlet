package response;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by Vishwas on 5/4/16.
 * Copyright (C) 2015  Vishwas Tripathi
 */
@javax.servlet.annotation.WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    private final static Logger logger = Logger.getLogger(Servlet.class);
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String html = request.getParameter("webPage");
        new Parse(html);


    }
}
