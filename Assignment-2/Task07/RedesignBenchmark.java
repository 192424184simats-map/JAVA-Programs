package Task07;
import java.util.*;
public class RedesignBenchmark {
 static String oldWay(int n,int f){String s="";for(int i=0;i<n;i++)for(int j=0;j<f;j++)s=s+"T"+i+"-F"+j+";";return s;}
 static String newWay(int n,int f){StringBuilder s=new StringBuilder();for(int i=0;i<n;i++)for(int j=0;j<f;j++)s.append("T").append(i).append("-F").append(j).append(";");return s.toString();}
 static long median(boolean fast,int n,int f){long[]v=new long[7];for(int i=0;i<7;i++){long s=System.nanoTime();if(fast)newWay(n,f);else oldWay(n,f);v[i]=System.nanoTime()-s;}Arrays.sort(v);return v[3];}
 public static void main(String[]a){int[][]w={{100,20},{1000,50},{5000,100}};String[]labels={"Small","Medium","Large"};for(int i=0;i<w.length;i++){int n=w[i][0],f=w[i][1];String x=oldWay(n,f),y=newWay(n,f);long p=median(false,n,f),q=median(true,n,f);System.out.printf("%s: equal=%s | String %.3f ms | StringBuilder %.3f ms | speedup %.2fx%n",labels[i],x.equals(y),p/1e6,q/1e6,(double)p/q);}}
}