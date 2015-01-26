import java.util.List;
import java.util.LinkedList;

public class ExceptionExercise {

	public static void launch(int userInput) {
		List<String> myList = new LinkedList<String>();
		myList.add("a");
		myList.add("b");
		myList.add("c");
		myList.add("d");
		myList.add("e");
		try {
			String newElement = "f";
			myList.add(newElement);
			System.out.println(myList.get(userInput));
			myList.add(null);
		} catch (Exception ex) {
			ex.printStackTrace();
		} //catch (NullPointerException ex) {
//			ex.printStackTrace();
//		}
	}

	public static void main(String[] args) {
		launch(5);
		launch(6);
	}
}