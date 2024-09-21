package in.demo.soudeep.beans;

public class CustomerVo {
	
	private String cname;
	private String caddr;
	private String pamt;
	private String rate;
	private String time;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddr() {
		return caddr;
	}
	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}
	public String getPamt() {
		return pamt;
	}
	public void setPamt(String pamt) {
		this.pamt = pamt;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "CustomerVo [cname=" + cname + ", caddr=" + caddr + ", pamt=" + pamt + ", rate=" + rate + ", time="
				+ time + "]";
	}
	
}
