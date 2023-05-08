import java.util.*;

public class SkyscraperConstruction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the total number of floors in the building: ");
		int n = scanner.nextInt();

		PriorityQueue<Integer> floors = new PriorityQueue<>(Collections.reverseOrder());
		List<Integer> floorSizes = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter the floor size given on day " + (i + 1) + ": ");
			int floorSize = scanner.nextInt();
			floorSizes.add(floorSize);
			while (!floors.isEmpty() && floors.peek() == floorSizes.size()) {
				System.out.print(floors.poll() + " ");
			}
			if (floors.isEmpty() || floorSize < floors.peek()) {
				System.out.println();
			}
			floors.add(floorSize);
		}
		scanner.close();
	}
}
