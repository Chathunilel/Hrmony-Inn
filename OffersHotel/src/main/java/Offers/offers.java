package Offers;

public class offers {

	private int offerid;
	private String offername;
	private String description;
	private String startdate;
	private String enddate;
	private int percentage;
	private String couponcode;
	
	
	public offers(int offerid, String offername, String description, String startdate, String enddate, int percentage,
			String couponcode) {
		
		this.offerid = offerid;
		this.offername = offername;
		this.description = description;
		this.startdate = startdate;
		this.enddate = enddate;
		this.percentage = percentage;
		this.couponcode = couponcode;
	}


	public int getOfferid() {
		return offerid;
	}


	public String getOffername() {
		return offername;
	}


	public String getDescription() {
		return description;
	}


	public String getStartdate() {
		return startdate;
	}


	public String getEnddate() {
		return enddate;
	}


	public int getPercentage() {
		return percentage;
	}


	public String getCouponcode() {
		return couponcode;
	}


	
	
	
	
	
	
	
}
