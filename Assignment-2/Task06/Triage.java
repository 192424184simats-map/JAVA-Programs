package Task06;
import java.util.*;
public class Triage {
 static class Patient{String name;int severity,arrival;Patient(String n,int s,int a){name=n;severity=s;arrival=a;}public String toString(){return name+" (severity "+severity+", arrival "+arrival+")";}}
 public static void main(String[]a){PriorityQueue<Patient>q=new PriorityQueue<>(Comparator.comparingInt((Patient p)->p.severity).thenComparingInt(p->p.arrival));String[]names={"Patient A","Patient B","Patient C","Patient D","Patient E","Patient F","Patient G","Patient H"};int[]levels={3,1,2,1,5,3,2,4};for(int i=0;i<names.length;i++)q.offer(new Patient(names[i],levels[i],i+1));System.out.println("Treatment order:");while(!q.isEmpty())System.out.println(q.poll());System.out.println("offer/poll O(log n); peek O(1); storage O(n).");}
}