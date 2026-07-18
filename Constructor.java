public class Constructor{
    int x;
    float y;
    String z;
    public Constructor(){
        x=10;
        y=20.5f;
        z="hello";
    }
    public static void main(String[]args){
        Constructor c=new Constructor();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
    }
}