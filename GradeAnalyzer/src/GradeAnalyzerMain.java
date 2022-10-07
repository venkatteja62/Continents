import java.util.ArrayList;

public class GradeAnalyzerMain {
    public static void main (String [] Teja)
    {
        ArrayList<Integer> gr = new ArrayList<>();
        gr.add(98);
        gr.add(58);
        gr.add(68);
        gr.add(48);
        gr.add(62);
        gr.add(90);

        GradeAnalyzer obj = new GradeAnalyzer();
        obj.getHighest(gr);
        obj.lowestGrade(gr);
        obj.averageGrade(gr);
    }
}
