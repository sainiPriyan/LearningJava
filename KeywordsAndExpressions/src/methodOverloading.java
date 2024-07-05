public class methodOverloading {

public static void main(String[] args){
System.out.println(something(100));
}

public static int something (String name , int score)
{
    System.out.println(name+" scored "+score+" points!");
    return score*100;
}
public static int something (int score)
{
    return something("anonymous",score);
}
}
