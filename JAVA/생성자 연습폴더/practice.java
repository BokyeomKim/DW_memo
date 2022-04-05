package 상속;

class Start {
	public void 시작하다() {
		System.out.println("연습을 시작합니다!");
	}
}

class Ga {
	public void 연습하다() {
		System.out.println("가.연습하는중(1)");
	}
}

class Na {
	public void 연습하다() {
		System.out.println("나.연습하는중(2)");
	}
}

class Da {

	public void 연습하다() {
		System.out.println("다.연습하는중(3)");
	}
}

class La {
	public void 연습하다() {
		System.out.println("라.연습하는중(4)");
	}
}

class Ma {
	public void 연습하다() {
		System.out.println("마.연습하는중(5)");
	}
}

class Ba {
	public void 연습하다() {
		System.out.println("바.연습하는중(6)");
	}
}

class Sa {
	public void 연습하다() {
		System.out.println("사.연습하는중(7)");
	}
}

class Exit {
	public void 종료하다() {
		System.out.println("연습을 종료 합니다!");
	}
}

public class practice {

	public static void main(String[] args) {

		Start start = new Start();
		start.시작하다();

		Ga a = new Ga();
		a.연습하다();

		Na b = new Na();
		b.연습하다();

		Da c = new Da();
		c.연습하다();

		La d = new La();
		d.연습하다();

		Ma e = new Ma();
		e.연습하다();

		Ba f = new Ba();
		f.연습하다();
		Sa g = new Sa();
		g.연습하다();
		Exit exit = new Exit();
		exit.종료하다();

	}

}
