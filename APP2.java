package task4_3.task4_3;

/**
 * Hello world!
 *
 */
import java.util.function.BiFunction;
import java.util.*;
interface Polindrome{
public static String[] p(String[] s,int i){
String[] s1=new String[i];
int j=0;
for(int k1=0;k1<i;k1++){
String t=s[k1];
String b1="";
int n=t.length();
for(int l=n-1;l>=0;l--){
b1=b1+t.charAt(l);
}
if(t.equalsIgnoreCase(b1)){
s1[j]=b1;
j++;
}
}
return s1;
}
}
public class Reference{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int h1=sc.nextInt();
int n=h1;
h1=h1-1;
String[] s=new String[h1+1];
while(h1>=0){
s[h1]=sc.next();
h1--;
}
BiFunction<String[],Integer,String[]>adder=Polindrome::p;
String[] result=adder.apply(s,n);
for(String l:result){
if(l!=null){
System.out.println(l);}
}
}
}

