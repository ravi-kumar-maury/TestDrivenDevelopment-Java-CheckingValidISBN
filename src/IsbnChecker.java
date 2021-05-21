public class IsbnChecker {
public boolean checkISBN( String a){

    int val =0;

    int n =a.length();
    int mul=n;
    if(n<10 || n>13 || n==11 || n==12 ) throw new NumberFormatException();

    if(n==13){
        for (int i=0;i<n;i++) {
            int v = a.charAt(i) - '0';
            if (v >= 10) throw new NumberFormatException();
            if (i%2==0)
                val +=v;
            else val+=v*3;
        }
        if(val%10==0)return true;
        else return false;
    }
    for (int i=0;i<n-1;i++)
    {   int v= a.charAt(i)-'0';
        if(v>=10) throw new NumberFormatException();
        val = val+mul*v;
        mul--;
    }
    val = val%(n+1);
    int lastDigit;
    if(a.charAt(n-1)=='X')lastDigit=10;
    else lastDigit = a.charAt(n-1)-'0';
    if((val+lastDigit)%(n+1)==0)return true;
    else return false;

}
}
