package gos.vo;

public class RsMenuVO {
	private int rm_id;
	private int menu_id;
	private String rst_id;
	private int rm_qty;
	private String rs_id;

	public int getRm_id() {
		return rm_id;
	}

	public void setRm_id(int rm_id) {
		this.rm_id = rm_id;
	}

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	public String getRst_id() {
		return rst_id;
	}

	public void setRst_id(String rst_id) {
		this.rst_id = rst_id;
	}

	public int getRm_qty() {
		return rm_qty;
	}

	public void setRm_qty(int rm_qty) {
		this.rm_qty = rm_qty;
	}

	public String getRs_id() {
		return rs_id;
	}

	public void setRs_id(String rs_id) {
		this.rs_id = rs_id;
	}

	@Override
	public String toString() {
		return "RsMenuVO [rm_id=" + rm_id + ", menu_id=" + menu_id + ", rst_id=" + rst_id + ", rm_qty=" + rm_qty
				+ ", rs_id=" + rs_id + "]";
	}

}
