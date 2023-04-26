package practice;

public class marks {
	
	private int math;
	private int sci;
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	@Override
	public String toString() {
		return "marks [math=" + math + ", sci=" + sci + "]";
	}
	
	

}
