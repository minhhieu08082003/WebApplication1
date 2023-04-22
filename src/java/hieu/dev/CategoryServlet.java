/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package hieu.dev;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.net.Authenticator;
import hieu.dev.data.DatabaseDao;
import hieu.dev.data.dao.CategoryDao;
import hieu.dev.data.model.Category;

/**
 *
 * @author Acer
 */
public class CategoryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));

        switch (action) {
            case "create":
                createCategory(categoryId);
                break;
            case "update":
                updateCategory(categoryId);
                break;
            case "delete":
                deleteCategory(categoryId);
                break;
            default:
                throw new AssertionError();
        }
        response.sendRedirect("HomeServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    private void updateCategory(int categoryId) {
        CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();

    }

    private void deleteCategory(int categoryId) {
        CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
        categoryDao.delete(categoryId);
    }

    private void createCategory(int categoryId) {
        CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
        categoryDao.insert(new Category("hieu", "mang   "));

    }

}