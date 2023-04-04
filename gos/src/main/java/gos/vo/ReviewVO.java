package gos.vo;

public class ReviewVO {
	private int rv_id;
	private String rv_content;
	private String rv_date;
	private String rv_title;
	private int rv_sc;
	private int rv_rcmd;
	private String rv_photo;
	private String mem_id;
	private String rs_id;

	public int getRv_id() {
		return rv_id;
	}

	public void setRv_id(int rv_id) {
		this.rv_id = rv_id;
	}

	public String getRv_content() {
		return rv_content;
	}

	public void setRv_content(String rv_content) {
		this.rv_content = rv_content;
	}

	public String getRv_date() {
		return rv_date;
	}

	public void setRv_date(String rv_date) {
		this.rv_date = rv_date;
	}

	public String getRv_title() {
		return rv_title;
	}

	public void setRv_title(String rv_title) {
		this.rv_title = rv_title;
	}

	public int getRv_sc() {
		return rv_sc;
	}

	public void setRv_sc(int rv_sc) {
		this.rv_sc = rv_sc;
	}

	public int getRv_rcmd() {
		return rv_rcmd;
	}

	public void setRv_rcmd(int rv_rcmd) {
		this.rv_rcmd = rv_rcmd;
	}

	public String getRv_photo() {
		return rv_photo;
	}

	public void setRv_photo(String rv_photo) {
		this.rv_photo = rv_photo;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getRs_id() {
		return rs_id;
	}

	public void setRs_id(String rs_id) {
		this.rs_id = rs_id;
	}

	@Override
	public String toString() {
		return "ReviewVO [rv_id=" + rv_id + ", rv_content=" + rv_content + ", rv_date=" + rv_date + ", rv_title="
				+ rv_title + ", rv_sc=" + rv_sc + ", rv_rcmd=" + rv_rcmd + ", rv_photo=" + rv_photo + ", mem_id="
				+ mem_id + ", rs_id=" + rs_id + "]";
	}

}
