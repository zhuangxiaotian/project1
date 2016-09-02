package cn.topdeep.projgroup.action;

public class TestAction extends BaseAction {
	public String execute(){
		System.out.println("content = "+content);
		return SUCCESS;
	}
	
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
