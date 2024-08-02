package test5;

enum Gender {
	Male, Female
}

class Man {
	public void print() {
		System.out.println("남자 입니다.");
	}
}

class Woman {
	public void print() {
		System.out.println("여자 입니다.");
	}
}

public class Test09 {
	public static void main(String[] args) {

		Object human1 = makeHuman(Gender.Male);
		Object human2 = makeHuman(Gender.Female);
		
		if(human1 instanceof Man) {
			Man man = (Man) human1;
			man.print();
		}
		
		if(human2 instanceof Woman woman) {
			woman.print();
		}
		
	}

	private static Object makeHuman(Gender gender) {
		if(gender == Gender.Male) {
			return new Man();
		}else if(gender == Gender.Female) {
			return new Woman();
		}
		
		return null;
	}
}
