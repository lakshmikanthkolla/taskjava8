package task4.task4;

/**
 * Hello world!
 *
 */
import java.util.function.BiFunction;
import java.util.*;
interface Polindrome{
public static String[] p(String[] s,int i){
String[] s1=new String[i];
int j1=0;
for(int k1=0;k1<i;k1++){
String t=s[k1];
String b="";
int n=t.length();
for(int l=n-1;l>=0;l--){
b=b+t.charAt(l);
}
if(t.equalsIgnoreCase(b)){
s1[j1]=b;
j1++;
}
}
return s1;
}
}
public class Reference{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int h=sc.nextInt();
int n=h;
h=h-1;
String[] s=new String[h+1];
while(h>=0){
s[h]=sc.next();
h--;
}
BiFunction<String[],Integer,String[]>adder=Polindrome::p;
String[] result=adder.apply(s,n);
for(String l:result){
if(l!=null){
System.out.println(l);}
}
}
}
