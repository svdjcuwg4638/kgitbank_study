package programmers;

import java.util.ArrayList;

// �ڵ��׽�Ʈ ���� -> 2019 īī�� ������ �ܿ� ���Ͻ� -> ũ���� �����̱� ����

public class Quiz64061 {
	
    static int solution(int[][] board, int[] moves) {
    	
        int answer = 0;
        // moves�� �����Ͽ� ������ ������� �̾Ƽ� ����ϱ�
//        String basket = "";
        ArrayList<Integer> basket = new ArrayList<Integer>();
        
        for(int i = 0; i < moves.length; i++) {		// ���� ��ȣ��� �ݺ��Ѵ�
        	int doll = 0;							// ���� ������ ������ ����
        	int index = moves[i] - 1;				// �ε����� ���� ��ȣ - 1
        	for(int j = 0; j < board.length; j++) {	// ������ ����(�� ��)��ŭ �ݺ�
        		if(board[j][index] != 0) {		// j��° ���� index��° ���Կ� ������ ������
        			doll = board[j][index];		// ������ doll�� �����ϰ�
        			board[j][index] = 0;		// ������ �̾�����, ���� ��ġ���� 0�� �����ϰ�
        			break;						// ���� �ϳ� ã������ �ݺ��� �ߴ�
        		}
        	}
        	System.out.print(doll + " ");	// �̱��� ������ ȭ�鿡 ���
        	
        	if(doll != 0) {					// ���� ������ ������ (0�� �ƴϸ�)
//        		basket += doll;				// ������ �ٱ��Ͽ� ��´�
        		basket.add(doll);
        	}
//        	if(basket.endsWith(doll + "" + doll)) {
//        	if(basket.contains(doll + "" + doll)) {	// �ٱ��Ͽ� ��� ���� ������ ������ �������� 2�� ������
        	int size = basket.size();
        	if(size >= 2 && basket.get(size - 1) == basket.get(size - 2)) {
        		System.out.println("�ߺ��� ���� ��Ʈ����");
//        		basket = basket.substring(0, basket.length() - 2);	// ó������ -2���� �߶󳽴�	
        		basket.remove(size - 1);
        		basket.remove(size - 2);
        		answer += 2;	// ��Ʈ�� ������ ������ŭ answer�� ������Ų��
        	}
        	
        	System.out.println(basket);
        }
        System.out.println();
        return answer;
    }
    
    static int solution2(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> basket = new ArrayList<Integer>();
        
        for(int i = 0; i < moves.length; i++) {		// ���� ��ȣ��� �ݺ��Ѵ�
        	int doll = 0;							// ���� ������ ������ ����
        	int index = moves[i] - 1;				// �ε����� ���� ��ȣ - 1
        	for(int j = 0; j < board.length; j++) {	// ������ ����(�� ��)��ŭ �ݺ�
        		if(board[j][index] != 0) {		// j��° ���� index��° ���Կ� ������ ������
        			doll = board[j][index];		// ������ doll�� �����ϰ�
        			board[j][index] = 0;		// ������ �̾�����, ���� ��ġ���� 0�� �����ϰ�
        			break;						// ���� �ϳ� ã������ �ݺ��� �ߴ�
        		}
        	}
        	
        	if(doll != 0) basket.add(doll);
        	
        	int size = basket.size();
        	if(size >= 2 && basket.get(size - 1) == basket.get(size - 2)) {
        		basket.remove(size - 1);
        		basket.remove(size - 2);
        		answer += 2;	// ��Ʈ�� ������ ������ŭ answer�� ������Ų��
        	}
        }
        return answer;
    }
    
    public static void main(String[] args) {
    	int[][] board = {
    			{0, 0, 0, 0, 0}, 
    			{0, 0, 1, 0, 3}, 
    			{0, 2, 5, 0, 1}, 
    			{4, 2, 4, 4, 2}, 
    			{3, 5, 1, 3, 1}
    	};
    	int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
    	int answer = solution2(board, moves);
    	System.out.println(answer == 4);
	}
}
