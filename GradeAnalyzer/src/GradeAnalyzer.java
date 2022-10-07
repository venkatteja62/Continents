import java.util.ArrayList;

public class GradeAnalyzer {

    public GradeAnalyzer() {

    }

    public int getHighest(ArrayList<Integer> grades) {
        int highest = 0;
        if (grades.size() < 1)
            System.out.println("no grades");
        else {
            for (int grade : grades) {
                if (grade > highest)
                    highest = grade;
                else
                    highest = highest;
            }
        }
        System.out.println("highest grade" + highest);
        return highest;
    }

    public int lowestGrade(ArrayList<Integer> grades) {
        int lowest = 100;
        if (grades.size() < 1)
            System.out.println("no lowest grades");
        else {
            for (int grade : grades) {
                if ( grade < lowest)
                    lowest = grade;
                else
                    lowest = lowest;
            }
        }
        System.out.println("lowest grade"+lowest);
        return lowest;
    }
    public float averageGrade(ArrayList<Integer> grades)
    {
        float sum = 0;
        if (grades.size() < 1)
            System.out.println("no lowest grade");
        else {
            for (int grade : grades) {
                sum += grade;
            }
            sum = sum/grades.size();
        }
        System.out.println("average grade"+sum);
        return sum;
    }
}


/*public class Magic {
	public static void main(String[] args) {
    //myNumber is the original Number, 100
		int myNumber = 10;
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo/myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive/6;
    System.out.println(stepSix);


	}
} */