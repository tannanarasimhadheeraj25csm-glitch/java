public class Demo{
    public void inputs(){
        System.out.println("hello");
    }
    public void display(int x,int y){
        System.out.println(x+y);
    }
    public int sample(int x,int y){
        return x+y;
    }
    public int output(){
        int x=20,y=10;
        return x+y;
    }
    public static void main(String[] args){
         Demo d=new Demo();
         d.inputs();
         d.display(10,20);
            int sum=d.sample(10,20);
            System.out.println(sum);
            int result=d.output();
            System.out.println(result);
    }

