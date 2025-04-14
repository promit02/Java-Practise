public class Loop {
    public static void NewLoop()
    {

        int i;
        for(i=100;i>50;i--)
        {
            if(i%5==0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        //System.out.println(NewLoop);
        NewLoop();
    }
}
