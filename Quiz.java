package collectyion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;



public class Quiz {
	public static void main(String[] args) throws Exception{
		String json = "[";
		json += "{\"name\":\"강하늘\", \"pnum\":\"010 - 2323 - 2323\"}";
		json +=",";
		json += "{\"name\":\"홍진호\", \"pnum\":\"010 - 2222 - 2222\"}";
		json += "]";
		
		
		List<HashMap<Object, Object>> list = new ArrayList<HashMap<Object,Object>>();
		
		List<String> list2 = Arrays.asList(json.split(","));
		HashMap<Object, Object> ob = new HashMap<Object, Object>();
		for (int i = 0; i < list2.size(); i++) {
			Object name = list2.get(i).replace("[","").replace("]", "").substring(9, 12);
			System.out.println(name);
			Object number = list2.get(i+1).replace("[","").replace("]", "").substring(9, 26);
			System.out.println(number);
			ob.put("name",name );
			ob.put("pnum",number );
			list.add(ob);	
		}
		System.out.println(ob);
		
	
		
//		
//		for(String str : list2) {
//			String name = str.replaceAll("[", "").replaceAll("{", "").replaceAll("\"", "");
//			System.out.println(name);
//		}
		
		
		
		// ArratList와 Hashmap을 이용하여, 위 문자열에서 데이터만 추출하여
		// 객체 형식으로 저장하고 출력하세요
		// split, replace, trim 등의 문자열 함수를 적극적으로 활용하세요
		
		
	}
}
