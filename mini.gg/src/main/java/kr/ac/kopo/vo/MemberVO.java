package kr.ac.kopo.vo;

public class MemberVO {
	private String id;
	private String pwd;
	private String name;
	private String no;
	

	public MemberVO(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	public MemberVO(String id) {
		this.id = id;
	}

	public MemberVO(String id, String pwd, String name, String no) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return no;
	}

	public void setNumber(String no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", no=" + no + "]";
	}
	
}
