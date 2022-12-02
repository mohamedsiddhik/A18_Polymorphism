
package  methodOverriding;

public  class Son4 extends Parent
{
    @Override
    public  void marriage(){
        System.out.println(" My marriage , My Rules ");
    }
    public static void main(String[] args) {
        Parent parent = new Son4();
        parent.properties();
        parent.marriage();
    }
}