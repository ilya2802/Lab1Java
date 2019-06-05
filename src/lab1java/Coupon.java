package lab1java;

public class Coupon {
	private String receiver;
	private int issuedate;
	private int number;
	private int time;
	private String issuedby;
	private String examday;
	static private int amountofcoupons;
	protected int auditory;
	protected String lecturer;

	public int getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = (int) time;
	}

	public int getAuditory() {
		return auditory;
	}

	public void setAuditory(int auditory) {
		this.auditory = auditory;
	}

	 Coupon() {
	}

	public Coupon(String receiver, int issuedate, int number, double time) {
		this.receiver = receiver;
		this.issuedate = issuedate;
		this.number = number;
		this.time = (int) time;
	}

	public Coupon(String receiver, int issuedto, int number, double time, String issuedby, String examday,
			int amountofcoupons, int auditory, String lecturer) {
		this(receiver, issuedto, number, time);
		this.issuedby = issuedby;
		this.examday = examday;
		this.auditory = auditory;
		this.lecturer = lecturer;
	}

	public String toString() {
		return receiver + "   " + issuedate + "   " + number + "   " + time + "   " + issuedby + "   " + examday + "   "
				+ amountofcoupons + "   " + auditory + "   " + lecturer;
	}

	public void printAmountofCoupons() {
		System.out.println(amountofcoupons);
	}

	public void printStaticAmountofCoupons() {
		System.out.println(amountofcoupons);
	}

	public void resetValues(String receiver, int issuedto, int number, double time, String issuedby, String examday,
			int ammoutofcoupons, int auditory, String lecturer) {
		this.receiver = receiver;
		this.number = number;
		this.time = (int) time;
		this.issuedby = issuedby;
		this.examday = examday;
		this.auditory = auditory;
		this.lecturer = lecturer;
	}
}