/*
create interface student and sports.Create a class Result implements Student and Sports.Display the academic and sports score of a student?
*/


interface student{
	int score=10;
	void displayscore();
     }

interface sports{
	int score=25;
	void displaysportsscore();
}


class Result implements student,sports{
	public void displayscore(){
		System.out.println("academic score is "+student.score);
	}

	public void displaysportsscore(){
		System.out.println("\nsports score is "+sports.score);
	}
}


class Sportsstudent{
	public static void main(String arg[]){
		Result r=new Result();
		r.displayscore();
		r.displaysportsscore();
	}
}


/*
Output
academic score is 10
sports score is 25
*/
