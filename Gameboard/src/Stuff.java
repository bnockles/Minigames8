public class Stuff {
	public static void main(String[] args) {
		int[][] g ={{9, 8, 7, 6},           

				   {5, 4, 2, 1},

				   {3, 9, 2, 3}};
		rowMajorOrder(g);
	}
	public static int[] rowMajorOrder(int[][] nums) {
		int i = nums.length * nums[0].length;
		int[] array = new int[i];
		int count = 0;
		for(int index = 0; index < nums.length;i++) {
			for(int j = 0; j < nums[0].length;j++) {
				array[count] = nums[index][j];
				count++;
			}
		}
		return array;
	}
	
	public static int[][] changeSign(int[][] array, int i, int j) {
		if(i > -1 && j > -1 && i < array.length && j < array.length) {
			//Switch Top
			if(i-1 > -1) {
				array[i-1][j] = -(array[i-1][j]);
			}
			//Switch left
			if(j-1 > -1) {
				array[i][j-1] = -(array[i][j-1]);
			}
			//Switch bottom
			if(i+1 < array.length) {
				array[i+1][j] = -(array[i+1][j]);
			}
			//Switch right
			if(j+1 < array.length) {
				array[i][j+1] = -(array[i][j+1]);
			}
			//Switch topLeft
			if(i-1 > -1 && j-1 > -1) {
				array[i-1][j-1] = -(array[i-1][j-1]);
			}
			//Switch bottomRight
			if(i+1 < array.length && j+1 < array.length) {
				array[i+1][j+1] = -(array[i+1][j+1]);
			}
			//Switch topRight
			if(i-1 > -1 && j+1 < array.length) {
				array[i-1][j+1] = -(array[i-1][j+1]);
			}
			//Switch bottomLeft
			if(j-1 > -1 && i+1 < array.length) {
				array[i+1][j-1] = -(array[i+1][j-1]);
			}
		}
		return array;
		
	}
	

}