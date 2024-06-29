package Offers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/OfferInsert")
public class OfferInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		String offerName = request.getParameter("Offer Name");
		String description = request.getParameter("description");
		String startDate = request.getParameter("Start Date");
		String endDate = request.getParameter("End Date");
		System.out.println(offerName);
		String dpercentage = request.getParameter("Discount Percentage");
        int discountPercentage = Integer.parseInt(dpercentage);
       
        String couponCode = request.getParameter("Coupon Code");
        
        boolean isTrue;
        
        if(couponCode.length() == 5) {
        	
        
        
        isTrue = OfferDBUtil.insertOffer(offerName, description, startDate, endDate, discountPercentage, couponCode);
		
        if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("retriveoffersservlet");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
        	}
        else {
        	
        	
        	RequestDispatcher dis = request.getRequestDispatcher("invalidcodelength.jsp");
        	dis.forward(request, response);
        }
	}

}
