
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top ten by Goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("Top ten by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("Statistics for Sidney Crosby ");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        System.out.println("Ordered by points");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
    }
}
