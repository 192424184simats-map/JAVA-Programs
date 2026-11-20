package Task04;
import java.util.*;
public class PharmacyMapBenchmark {
 static Map<Integer,String>fill(Map<Integer,String>m,int n){for(int i=0;i<n;i++)m.put(i,"Medicine-"+i);return m;}
 static double lookup(Map<Integer,String>m,int n){long s=System.nanoTime();for(int i=0;i<100000;i++)m.get(i%n);return (System.nanoTime()-s)/1e6;}
 public static void main(String[]a){for(int n:new int[]{1000,10000,50000}){Map<Integer,String>h=fill(new HashMap<>(),n),t=fill(new TreeMap<>(),n),v=fill(new Hashtable<>(),n),l=fill(new LinkedHashMap<>(),n);System.out.printf("%nRecords %d; 100000 lookups (ms)%nHashMap %.3f | TreeMap %.3f | Hashtable %.3f%n",n,lookup(h,n),lookup(t,n),lookup(v,n));System.out.println("TreeMap sorted keys: "+new ArrayList<>(t.keySet()).equals(new ArrayList<>(new TreeSet<>(t.keySet()))));System.out.println("LinkedHashMap first/last key: "+l.keySet().iterator().next()+" / "+new ArrayList<>(l.keySet()).get(n-1));}}
}