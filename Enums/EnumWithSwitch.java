package Java.Enums;

public class EnumWithSwitch {
	enum level{
		HIGH,MEDIUM,LOW;
	}
	public static void main(String[] args) {
		level p = level.LOW;
		switch(p){
			case HIGH:
			System.out.println("High level");
			break;
			case MEDIUM:
				System.out.println("medium level");
				break;
			case LOW:
				System.out.println("LOW level");
				break;
			
		}
		
	}

}
