package kimdaehyun_2A;



public class Handler {

	SimpleToDoList[] arr = new SimpleToDoList[10];

	String showAll() {
		String msg = "";
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != null) {
				msg += "[" + cnt + "]";
				msg += arr[i].toStr();
				msg += "\n";
				cnt++;
			}

		}
		return msg;
	}

	int insert(SimpleToDoList ob) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
			
			
		}
		return 0;
	}

	int finish(String name) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] !=null &&arr[i].title.equals(name)) {
				arr[i].finish = true;
				return 1;
			}
		}
		return 0;
	}

	int delete(String name) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] !=null && arr[i].title.equals(name)) {
				arr[i] = null;
				return 1;
			}
				
		}
		return 0;
	}

	public void rangeArray() {
		long t1, t2;
		
		for (int i = 0; i < arr.length; i++) {
			for(int j =0; j<arr.length;j++) {
				
				if (arr[i] != null && arr[j] != null) {
					t1 = arr[i].date.getTime();
					t2 = arr[j].date.getTime();
					if (t1 < t2) {
						SimpleToDoList tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
					
				}
			}

		}

	}
}
