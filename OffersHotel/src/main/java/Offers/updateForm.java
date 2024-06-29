package Offers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateForm")
public class updateForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int offerID = Integer.parseInt(request.getParameter("oID"));
		System.out.println("OfferID = " + offerID);

		OfferDBUtil odbu = new OfferDBUtil();
		List<offers> retrieve;
		
		retrieve = odbu.retrieveSelectedOffer(offerID);
		
		request.setAttribute("selectedOffer", retrieve);
		RequestDispatcher dis = request.getRequestDispatcher("updateOffer.jsp");
		dis.forward(request, response);
		
	}

}
