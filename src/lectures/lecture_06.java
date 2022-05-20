package lectures;

public class lecture_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		String[] myArray = new String[13];
//		System.out.println(myArray.length);
//		System.out.println(array);
//		array[0]=1;
//		array[1]=2;
//		array[2]=3;
//		
//		System.out.println(array[0]);
		for(int index=0; index<array.length; index++) {
		array[index]=(int)(Math.random()*1000);
		//System.out.println(array[index]);
		}
		
		for (int var:array)
			//System.out.println("--------");
			System.out.println(var);
		for (int index = array.length - 1; index >= 0; index--) {
			//array[index]=(int)(Math.random()*1000);
			System.out.println(array[index]);
		}
	}

}
