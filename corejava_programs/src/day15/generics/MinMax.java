package day15.generics;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ublic interface MinMax<T extends Comparable<T>> {

			T min();

			T max();
		}
	}

}
