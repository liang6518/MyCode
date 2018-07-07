package chapter1;
//哥，我要是想实现这些接口，在class里该怎么写，那个接口的实现的例子我不能举一反三？？？
//实现Football接口的类需要实现五个方法，实现Hockey接口的类需要实现六个方法。这一点我是明白的
public interface Sport {
    void setHomeTeam(String name);
    void setVisitingTeam(String name);
}
interface Football extends Sport{
    void homeTeamScored(int points);
    void visitingTeamScored(int points);
    void endOfQuarter(int quarter);
}
interface Hockey extends Sport{
    void homeGoalScored();
    void visitingGoalScored();
    void endOfPeriod(int period);
    void overtimePeriod(int ot);
}

