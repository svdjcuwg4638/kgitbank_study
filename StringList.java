package array;


public class StringList {
	// Ŭ���� ������ �Լ����� ���������� ������ �� �ִ� ����
	// �Լ��� ���������� �����ϱ� ���ؼ�, ��� �ʵ��� �θ���
	// ����ʵ�� �Ķ���, ���������� ����(��Ŭ���� �⺻ �׸�)
	
	private String[] arr = new String[0];
	
	
	public void add(String str) {
		String[] tmp;
		
		tmp = new String[arr.length+1];
		
		for(int i =0; i<arr.length;i++) {
			tmp[i] = arr[i];
		}
		arr=tmp;
		
		arr[arr.length-1] =str;
			
		}
	
	// �����ε� : ���� Ŭ���� �ȿ� ���� �̸��� �Լ��� 2�� �̻� �ִ�
	// �������̵� : ����Ŭ�������� [���]�޾Ƽ� �̹� �ִµ�, ���� �������� ���� ���� �����
	
	@Override	// Object.toString()
	public String toString() { 		// System.out.println(ob);
									// System.out.println(ob.toString());
		String ret = "{";

		for(int i =0; i<arr.length;i++) {
			if(arr[i] != null) {
				ret+= arr[i];
			}
			ret += i == arr.length -1 ? "}" : ", ";
		}
		return ret;
	}
	
	public int size() {
		return arr.length;
		
	}
}
	
	

	

