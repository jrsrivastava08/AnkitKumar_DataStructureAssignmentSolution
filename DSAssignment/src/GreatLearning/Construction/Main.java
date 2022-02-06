package GreatLearning.Construction;

public class Main {
		static boolean largerFloor(int[] floors, int start, int floor) {
			boolean result = false;
			for (int i = start; i < floors.length; i++) {
				if (floors[i] > floor) {
					result = true;
					break;
				}
			}
			return result;
		}
	}