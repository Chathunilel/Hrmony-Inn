package Offers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateOfferServlet")
public class UpdateOfferServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String offerid =request.getParameter("offerID");
		
		int offerID = Integer.parseInt(offerid);
		
		String offerName =request.getParameter("offerName");		
		String description =request.getParameter("description");
		String startDate =request.getParameter("startDate");
		String endDate =request.getParameter("endDate");
		
		String dperce =request.getParameter("discountPercentage");
		int discountPercentage = Integer.parseInt(dperce);
		
		String couponCode =request.getParameter("couponCode");
		
		
		boolean isTrue;
		
		System.out.println("TTTTTTTTTTTTTT");
		isTrue = OfferDBUtil.updateOffer(offerID, offerName, description, startDate, endDate, discountPercentage, couponCode);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("retriveoffersservlet");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
	}

}
