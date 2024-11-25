package kr.ac.kopo.vo;

public class BoardVO {
	private int		no;
	private String	name;
	private	String	content;
	private String 	regDate;
	
	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", name=" + name + ", content=" + content + ", regDate=" + regDate + "]";
	}
	
	public BoardVO(int no, String name, String content, String regDate) {
		super();
		this.no = no;
		this.name = name;
		this.content = content;
		this.regDate = regDate;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
}
