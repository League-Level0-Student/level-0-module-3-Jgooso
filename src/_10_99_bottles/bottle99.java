package _10_99_bottles;

public class bottle99 {
	public static void main(String[] args) {
		int bottles = 99;
		for( int i = 0; i < 99; i++) {
			System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer");
			bottles--;
			System.out.println("Take one down, pass it around " + bottles + " bottles of beer on the wall.\n");
		}
	}
}
