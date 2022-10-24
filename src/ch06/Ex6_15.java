package ch06;

class Ex6_15 {
	
	static int[] arr = new int[10];
	
	static {
		for(int i = 0; i < arr.length; i++) {
			// 1�� 10 ������ ������ ���� �迭 arr�� �����Ѵ�.
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
	
    public static void main(String[] args) {
    	for(int i = 0; i < arr.length; i++)
    		System.out.println("arr[" + i + "] :" + arr[i]);
    }
}

/*
	���
	arr[0] :10
	arr[1] :3
	arr[2] :7
	arr[3] :8
	arr[4] :9
	arr[5] :1
	arr[6] :10
	arr[7] :2
	arr[8] :1
	arr[9] :5
*/