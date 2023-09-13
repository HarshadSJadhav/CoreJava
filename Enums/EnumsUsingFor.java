package Java.Enums;

public class EnumsUsingFor {
	enum level{
		HIGH,MEDIUM,LOW;
	}
	public static void main(String[] args) {
		for (level a:level.values()) {
			System.out.println(a);
		}
	}

}
