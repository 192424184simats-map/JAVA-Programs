package Task01;
public class TicketBenchmark {
 static String stringBuild(int n,int f){String s="";for(int i=0;i<n;i++)for(int j=0;j<f;j++)s=s+"T"+i+"-F"+j+";";return s;}
 static String builderBuild(int n,int f){StringBuilder s=new StringBuilder();for(int i=0;i<n;i++)for(int j=0;j<f;j++)s.append("T").append(i).append("-F").append(j).append(";");return s.toString();}
 static String bufferBuild(int n,int f){StringBuffer s=new StringBuffer();for(int i=0;i<n;i++)for(int j=0;j<f;j++)s.append("T").append(i).append("-F").append(j).append(";");return s.toString();}
 static double time(Runnable r){long s=System.nanoTime();r.run();return (System.nanoTime()-s)/1e6;}
 public static void main(String[]a){int[][]w={{1,6},{10000,50},{2000,100}};String[]names={"Short","Large","Custom"};for(int k=0;k<w.length;k++){int n=w[k][0],f=w[k][1];double x=time(()->stringBuild(n,f)),y=time(()->builderBuild(n,f)),z=time(()->bufferBuild(n,f));System.out.printf("%s (%d tickets x %d fields): String %.3f ms | StringBuilder %.3f ms | StringBuffer %.3f ms%n",names[k],n,f,x,y,z);System.out.println("Output length: "+builderBuild(n,f).length());}}
}