/**
 * 
 */
package tuan4.bai8CaSy;

/**
 * Tuan 4, Bai 8, mssv 25750041, hoten: Ngo Thanh Duoc
 */
public class CD {
	/**
	 * Khai bao thuoc tinh
	 */
	private String MaCD;
	private String TuaCD;
	private String CaSy;
	private int soBaiHat;
	private float giaThanh;
	
	/**
	 * Dong goi va rang buoc
	 */
	/**
	 * @return the maCD
	 */
	public String getMaCD() {
		return MaCD;
	}
	/**
	 * @param maCD the maCD to set
	 */
	public void setMaCD(String maCD) {
		MaCD = maCD;
	}
	/**
	 * @return the tuaCD
	 */
	public String getTuaCD() {
		return TuaCD;
	}
	/**
	 * @param tuaCD the tuaCD to set
	 */
	public void setTuaCD(String tuaCD) {
		TuaCD = tuaCD;
	}
	/**
	 * @return the caSy
	 */
	public String getCaSy() {
		return CaSy;
	}
	/**
	 * @param caSy the caSy to set
	 */
	public void setCaSy(String caSy) {
		CaSy = caSy;
	}
	/**
	 * @return the soBaiHat
	 */
	public int getSoBaiHat() {
		return soBaiHat;
	}
	/**
	 * @param soBaiHat the soBaiHat to set
	 * @throws Exception 
	 */
	public void setSoBaiHat(int soBaiHat) throws Exception {
		if(soBaiHat>0) {
			this.soBaiHat = soBaiHat;
		}
		else {
			throw new Exception("So bai hat lon hon 0");
		}
	}
	/**
	 * @return the giaThanh
	 */
	public float getGiaThanh() {
		return giaThanh;
	}
	/**
	 * @param giaThanh the giaThanh to set
	 */
	public void setGiaThanh(float giaThanh) {
		this.giaThanh = giaThanh;
	}
	/**
	 * Tao constructor
	 */
	/**
	 * @param maCD
	 * @param tuaCD
	 * @param caSy
	 * @param soBaiHat
	 * @param giaThanh
	 * @throws Exception 
	 */
	public CD(String maCD, String tuaCD, String caSy, int soBai, float giaThanh) throws Exception {
		this.MaCD = maCD;
		this.TuaCD = tuaCD;
		this.CaSy = caSy;
		if(soBaiHat>0) {
			this.soBaiHat = soBai;
		}
		else {
			throw new Exception("So bai hat lon hon 0");
		}
		this.giaThanh = giaThanh;
	}
	public CD() {

	}
	/**
	 * Tao Tieu de in
	 */
	public static void TieuDe
}
