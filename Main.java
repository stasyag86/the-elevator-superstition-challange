
public class Main {

	public static void main(String[] args) {
		System.out.println(getLuckyFloorNumber(12));

	}
	
	public static int getLuckyFloorNumber(int n){
		int counter = 0;
		int result = 0;
		for (int i = 1; counter < n; i++){
			if (!isLuckyFloor(i)){
				counter++;
				result = i;
			}
			
		}
		return result;
	}
	
	public static boolean isLuckyFloor(int n){
		int number = n;
		if (number > 13){
			number = number % 10;
			int residue = 0;
			if (number != 0){
				residue = n - number * 10;
			}
			if (isLuckyNumer(number) || isLuckyNumer(residue)){
				return true;
			}else{
				return isLuckyFloor(number) || isLuckyFloor(residue);
			}
		}else{
			return isLuckyNumer(number);
		}
		
	}
	
	public static boolean isLuckyNumer(int n){
		if (n == 4 || n == 13){
			return true;
		}
		return false;
	}

}
