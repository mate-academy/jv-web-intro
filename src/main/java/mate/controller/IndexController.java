package mate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController extends HttpServlet {
    private static final String VIEWS_FOLDER = "/WEB-INF/views/";
    private static final String INDEX_PAGE = "index.jsp";

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher(VIEWS_FOLDER + INDEX_PAGE).forward(req, resp);
    }
}
