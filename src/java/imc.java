/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 11161502046
 */
@WebServlet(urlPatterns = {"/imc"})
public class imc extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("resultado.jsp");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        float peso = Float.parseFloat(request.getParameter("peso"));
        float altura = Float.parseFloat(request.getParameter("altura"));
        float imc = peso/(altura*altura);
        String situacao = "";
        
        if(imc < 17){
            situacao = "Muito abaixo do peso";
        }
        else if(imc < 18.49){
            situacao = "Abaixo do peso";
        }
        else if(imc < 24.99){
            situacao = "Peso normal";
        }
        else if(imc < 29.99){
            situacao = "Acima do peso";
        }
        else if(imc < 34.99){
            situacao = "Obesidade I";
        }
        else if(imc < 39.99){
            situacao = "Obesidade II (severa)";
        }
        else{
            situacao = "Obesidade III (mórbida)";
        }


        
        request.setAttribute("imc", imc);
        request.setAttribute("situacao", situacao);
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
