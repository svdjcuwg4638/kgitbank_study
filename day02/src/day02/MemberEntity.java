package day02;

public class MemberEntity {
	// entity, �ý����� �����ؾ� �ϴ� ������ �����ϴ� ����� �����ϴ� Ŭ����
	// Java�� �̿��ϴ� ���α׷������� ��κ� �ڹ� ���� �������� �����Ѵ�
	// private ��� �ʵ�, public getter/setter, �⺻������ (�Ű�����x)
	
	private String id;
	private String pw;
	private String name;
	
	public MemberEntity() {
		// �⺻ �����ڰ� �־�� (������ ����) ��ü�� ������ ��  �ִ�
	}
	
	
	public MemberEntity(String id, String pw, String name) {
		
		// �Ű������� �޴� �����ڴ� ��ü�� �ʱⰪ�� �Ҵ��ϸ鼭 ��ü�� ������ �� �ִ�
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}





	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
