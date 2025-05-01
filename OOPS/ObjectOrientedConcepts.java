class Parent{
    int parentData=10;
    private int privData=20;
    public int pubData=30;
    protected int protData=40;

    Parent(){
        System.out.println("=> parent deafult constructor");
        System.out.println(parentData);
        System.out.println(privData);
    }

    Parent(int n){
        this.parentData= n;
        System.out.println("=> parent deafult constructor");
    }
}

class Child1{
    Child1(int parentData){
        System.out.println("=> Child deafult constructor");
    }
}

public class ObjectOrientedConcepts {

    public static void main(String[] args) {
        // access specifiers
        Parent p = new Parent();
        System.out.println(p.parentData);
        System.out.println(p.protData); //accessible because it is in a different class 
        System.out.println(p.pubData);
        // System.out.println(p.privData); //Not accessible here, will generate error 
    }

}