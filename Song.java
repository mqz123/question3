package 第二次java作业;

public class Song {

	private String sName;
	private String sSinger;
	private int sTime;
	public Song(String sName, String sSinger, int sTime) {
		this.setsName(sName);
		this.setsSinger(sSinger);
		this.setsTime(sTime);
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsSinger() {
		return sSinger;
	}
	public void setsSinger(String sSinger) {
		this.sSinger = sSinger;
	}
	public int getsTime() {
		return sTime;
	}
	public void setsTime(int sTime) {
		this.sTime = sTime;
	}


}
