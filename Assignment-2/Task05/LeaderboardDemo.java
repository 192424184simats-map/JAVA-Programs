package Task05;
import java.util.*;
public class LeaderboardDemo {
 static class Team{String name;int points,gd;Team(String n,int p,int g){name=n;points=p;gd=g;}public String toString(){return name+" ("+points+", GD "+gd+")";}}
 static <T>List<T>rank(List<? extends T>items,Comparator<? super T>c){List<T>copy=new ArrayList<>(items);copy.sort(c);return copy;}
 public static void main(String[]a){List<Team>teams=Arrays.asList(new Team("Eagles",30,15),new Team("Lions",30,15),new Team("Falcons",28,12),new Team("Bulls",25,10),new Team("Tigers",25,10),new Team("Sharks",20,5));Comparator<Team>c=Comparator.comparingInt((Team t)->t.points).reversed().thenComparing(Comparator.comparingInt((Team t)->t.gd).reversed()).thenComparing(t->t.name);System.out.println("Leaderboard:");rank(teams,c).forEach(System.out::println);System.out.println("Safe integer comparator: "+Comparator.comparingInt(Integer::intValue).compare(Integer.MAX_VALUE,Integer.MIN_VALUE));}
}