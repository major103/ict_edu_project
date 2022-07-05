package vo;

public class FreeVo {

	int 	free_idx;
	String 	free_title;
	String	free_content;
	String	free_org_f;
	String 	free_mod_f;
	String	free_date;
	String	free_mod_date;
	int		free_count;
	String 	free_ip;
	String	user_id;
	
	public FreeVo(int free_idx, String free_title, String free_content, String free_ip) {
		super();
		this.free_idx = free_idx;
		this.free_title = free_title;
		this.free_content = free_content;
		this.free_ip = free_ip;
	}
	
	public int getFree_idx() {
		return free_idx;
	}
	public void setFree_idx(int free_idx) {
		this.free_idx = free_idx;
	}
	public String getFree_title() {
		return free_title;
	}
	public void setFree_title(String free_title) {
		this.free_title = free_title;
	}
	public String getFree_content() {
		return free_content;
	}
	public void setFree_content(String free_content) {
		this.free_content = free_content;
	}
	public String getFree_org_f() {
		return free_org_f;
	}
	public void setFree_org_f(String free_org_f) {
		this.free_org_f = free_org_f;
	}
	public String getFree_mod_f() {
		return free_mod_f;
	}
	public void setFree_mod_f(String free_mod_f) {
		this.free_mod_f = free_mod_f;
	}
	public String getFree_date() {
		return free_date;
	}
	public void setFree_date(String free_date) {
		this.free_date = free_date;
	}
	public String getFree_mod_date() {
		return free_mod_date;
	}
	public void setFree_mod_date(String free_mod_date) {
		this.free_mod_date = free_mod_date;
	}
	public int getFree_count() {
		return free_count;
	}
	public void setFree_count(int free_count) {
		this.free_count = free_count;
	}
	public String getFree_ip() {
		return free_ip;
	}
	public void setFree_ip(String free_ip) {
		this.free_ip = free_ip;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
}
