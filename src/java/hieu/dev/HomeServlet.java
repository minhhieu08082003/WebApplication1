/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package hieu.dev;

import hieu.dev.data.Database;
import hieu.dev.data.DatabaseDao;
import hieu.dev.data.dao.CategoryDao;
import hieu.dev.data.dao.UserDao;
import hieu.dev.data.model.Category;
import hieu.dev.data.model.User;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author Asus
 */
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DatabaseDao.init(new Database());
        UserDao userDao = DatabaseDao.getInstance().getUserDao();
        List<User> userList = userDao.findAll();
        request.setAttribute("userList", userList);
        request.getRequestDispatcher("home.jsp").include(request, response);
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        // Set response content type
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//
//        DatabaseDao.init(new Database());
//        CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
//
//        List<Category> categoryList = categoryDao.findAll();
//        renderHtml(out, categoryList);
//    }
//
//    private void renderHtml(PrintWriter out, List<Category> categoryList) {
//        out.println("<!DOCTYPE html>");
//        out.println("<html lang=\"en\">");
//        out.println("<head>");
//        out.println("<title>Document</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("<table>");
//        out.println("<thead>");
//        out.println("<th>STT</th>");
//        out.println("<th>Name</th>");
//        out.println("<th>Image</th>");
//        out.println("<th>#</th>");
//        out.println("<th>#</th>");
//        out.println("</thead>");
//
//        out.println("<tbody>");
//        int index = 0;
//        for (Category category : categoryList) {
//            index++;
//            out.println("<tr>");
//            out.println("<td>" + index + "</td>");
//            out.println(String.format("<td>%s</td>", category.getName()));
//            out.println(String.format("<td><img src=\"%s\"></td>", category.getImage()));
//            out.println(String.format("<td><a href=\"CategoryServlet?action=edit&categoryId=%d\">Edit</a></td>", category.getId()));
//            out.println(String.format("<td><a href=\"CategoryServlet?action=delete&categoryId=%d\">Delete</a></td>", category.getId()));
//            out.println("</tr>");
//        }
//        out.println("</tbody>");
//        out.println("<a href=\"index.html\" style=\"text-decoration: none\">back</a>");
//        out.println("</table>");
//        out.println("</body>");
//        out.println("</html>");
//    }

}
