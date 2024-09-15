package com.codsoft.cc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/convert")
public class ConvertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String amountStr = request.getParameter("amount");
	        String fromCurrency = request.getParameter("fromCurrency");
	        String toCurrency = request.getParameter("toCurrency");

	        double amount = Double.parseDouble(amountStr);
	        double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);

	        request.setAttribute("result", "Converted Amount: " + convertedAmount + " " + toCurrency);
	        request.getRequestDispatcher("result.jsp").forward(request, response);
	    }

	    private double convertCurrency(double amount, String fromCurrency, String toCurrency) {
	      
	        double rate = 1.0;

	        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
	            rate = 0.85;
	        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
	            rate = 1.18;
	        } else if (fromCurrency.equals("USD") && toCurrency.equals("GBP")) {
	            rate = 0.75;
	        } else if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) {
	            rate = 1.33;
	        } else if (fromCurrency.equals("EUR") && toCurrency.equals("GBP")) {
	            rate = 0.88;
	        } else if (fromCurrency.equals("GBP") && toCurrency.equals("EUR")) {
	            rate = 1.14;
	        }

	        return amount * rate;
	    }
	
	}


