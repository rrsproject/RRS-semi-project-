package gos.vo;

public class RstcmtVO {
	private int rcmt_id;
	private String rcmt_content;
	private String rst_id;
	private int rv_id;

	public int getRcmt_id() {
		return rcmt_id;
	}

	public void setRcmt_id(int rcmt_id) {
		this.rcmt_id = rcmt_id;
	}

	public String getRcmt_content() {
		return rcmt_content;
	}

	public void setRcmt_content(String rcmt_content) {
		this.rcmt_content = rcmt_content;
	}

	public String getRst_id() {
		return rst_id;
	}

	public void setRst_id(String rst_id) {
		this.rst_id = rst_id;
	}

	public int getRv_id() {
		return rv_id;
	}

	public void setRv_id(int rv_id) {
		this.rv_id = rv_id;
	}

	@Override
	public String toString() {
		return "RstcmtVO [rcmt_id=" + rcmt_id + ", rcmt_content=" + rcmt_content + ", rst_id=" + rst_id + ", rv_id="
				+ rv_id + "]";
	}

}
