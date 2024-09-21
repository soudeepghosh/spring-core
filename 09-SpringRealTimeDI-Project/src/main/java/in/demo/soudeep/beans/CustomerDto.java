package in.demo.soudeep.beans;

public class CustomerDto {
	
	private String cname;
	private String caddr;
	private Float pamt;
	private Float rate;
	private Float time;
	
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
	public Float getPamt() {
		return pamt;
	}
	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "CustomerDto [cname=" + cname + ", caddr=" + caddr + ", pamt=" + pamt + ", rate=" + rate + ", time="
				+ time + "]";
	}
	
}
