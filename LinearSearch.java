import java.util.*;

public class LinearSearch{

public static int linearSearch(int[] arr, int key){
int c=-1;

if(arr!=null)
{
for(int i=0;i<arr.length;i++){
if(arr[i]==key){
c=i;
break;
}}}
return c;
}

public static void main(String args[]){
int a[]={3,4,6,7,8,5,9};
int pos=linearSearch(a,7);
System.out.println(pos);
}
}