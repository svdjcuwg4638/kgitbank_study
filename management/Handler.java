package management;

import model.Student;

public class Handler {
	
	private Student[] arr = new Student[10];
	
	// �߰�
	public int arrAdd(Student ob) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] ==null) {
				arr[i]=ob;
				return 1;
			}
		}
		return 0;
	}
	// ���
	public void showArr() {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=null) {
				System.out.print("[" + (i+1)+"]");
				arr[i].showInfo();
				System.out.println();
			}
		}
	}
	// ����
	public int arr_delete(Student ob) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ob) {
				arr[i]=null;				// == �����ڴ� NullpointerException  �� �߻���Ű�� �ʴ´�
				return 1;						// . ������ null�̸� NullpointerException�� �߻��Ѵ�
			}
		}									// . �� ������ arr[i] !=null�� �־�����.
		return 0;
	}
	// �˻�
	public Student find(String name) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] !=null &&arr[i].getName().equals(name)) {
				return arr[i];
			}
		}
		return null; 
	}

	}
	
	
	

