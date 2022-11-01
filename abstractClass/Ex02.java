package abstractClass;

abstract class Button{
	
	// abstract �޼���� ��� �޾Ƽ� ����ϱ� ������ private���� ������ �� ����.
	// protected Ȥ�� public���� �����ؾ� �Ѵ�
	// protected : ��Ű���� �޶� ��Ӱ��迡 ������ ���� ����
	// public : ��Ű���� ��ӿ��ο� ������� ������ ���� ����
	protected void onclick() {
	}	public void click() {
		this.onclick();
	
	}
}
class MessageButton extends Button{

	@Override
	protected void onclick() {
		System.out.println("hello, world!!");
		
	}
	
}
class NotepadButton extends Button{

	@Override
	protected void onclick() {
		try {
			Runtime rt = Runtime.getRuntime();
			String cmd = "notepad";
			rt.exec(cmd);
		}catch(Exception e) {}
		
	}
	
}
class CalcButton extends Button{
	@Override
	protected void onclick() {
		try {
			Runtime rt = Runtime.getRuntime();	// �ü�� ��Ÿ���� ��ü�� �޾ƿ´�
			String cmd = "notepad";				// ������ ��ɾ� �غ�
			Process pro = rt.exec(cmd);			// ����� ���μ����� �����صξ��ٰ�
			Thread.sleep(2000);					// 2����
			pro.destroy();						// ���α׷��� �����Ѵ�
			
		} catch(Exception e) {}
			
		
	}
}
public class Ex02 {
	public static void main(String[] args) {
//		Button btn1 = new Button(); 
		MessageButton btn2 = new MessageButton();
		btn2.click();
		
//		NotepadButton btn3 = new NotepadButton();
//		btn3.click();
		
		CalcButton btn4 = new CalcButton();	// ���� Ŭ������ ��ü�� ���� Ŭ������ �����Ѵ�
		btn4.click();
		// �߻� Ŭ������ ���� ��ü�� ������ �� ������, �ڷ������ν� ���������� ����ϴ� ���� �����ϴ�
			
		Button btn5 = new Button() {	// �͸� Ŭ����
			// Ŭ���� �����̶� private �����
			private String cmd = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
			private String url = " https://search.naver.com/search.naver?query=������";
			
			@Override
			protected void onclick() {
				try {
					Runtime rt = Runtime.getRuntime();
					cmd += url;
					rt.exec(cmd);
						
				}catch(Exception e) {}
			}
		};
		btn5.click();

	}
}

