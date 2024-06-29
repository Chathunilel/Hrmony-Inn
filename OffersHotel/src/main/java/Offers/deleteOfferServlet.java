package Offers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteOfferServlet")
public class deleteOfferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String offerid = request.getParameter("oID");
		int offerID = Integer.parseInt(offerid);
		
		System.out.println(offerID);
		
		boolean isTrue;
		
		isTrue = OfferDBUtil.deleteOffer(offerID);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("viewservletafterdelete");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
		
		
	}

}
