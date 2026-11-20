package Task02;
import java.util.*;
public class PlaylistBenchmark {
 public static void main(String[]a){int n=a.length>0?Integer.parseInt(a[0]):10000;List<String>base=new ArrayList<>();for(int i=0;i<n;i++)base.add("Song-"+i);List<String>array=new ArrayList<>(base);LinkedList<String>linked=new LinkedList<>(base);ArrayDeque<String>deque=new ArrayDeque<>(base);String target="Song-"+(n/2);
 System.out.println("Playlist size: "+n);long s=System.nanoTime();for(String x:array){}System.out.printf("ArrayList traversal %.3f ms%n",(System.nanoTime()-s)/1e6);
 s=System.nanoTime();for(String x:linked){}System.out.printf("LinkedList traversal %.3f ms%n",(System.nanoTime()-s)/1e6);
 s=System.nanoTime();for(String x:deque){}System.out.printf("ArrayDeque traversal %.3f ms%n",(System.nanoTime()-s)/1e6);
 s=System.nanoTime();array.contains(target);System.out.printf("ArrayList search %.3f ms%n",(System.nanoTime()-s)/1e6);
 s=System.nanoTime();linked.contains(target);System.out.printf("LinkedList search %.3f ms%n",(System.nanoTime()-s)/1e6);
 s=System.nanoTime();deque.contains(target);System.out.printf("ArrayDeque search %.3f ms%n",(System.nanoTime()-s)/1e6);
 s=System.nanoTime();deque.addFirst("New");deque.removeFirst();System.out.printf("ArrayDeque end add/remove %.3f ms%n",(System.nanoTime()-s)/1e6);System.out.println("All collections have same size: "+(array.size()==linked.size()&&linked.size()==deque.size()));}
}