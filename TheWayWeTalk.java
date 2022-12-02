


//Method OverLoading
package methodOverloading;

public  class TheWayWeTalk
{


    //by changing the method or data type.
    public  void talk(Boss styleOfTalking){
        System.out.println("Nothing Personal");
    }
    public  void talk(Parents styleOfTalking){
        System.out.println("Polite and RespectFul!!!");
    }
    public  void   talk(Friends styleOfTalking){
        System.out.println("Jolly , friendly");
    }
    public  void talk(Partner styleOfTalking){
        System.out.println("Love , Romance , mixed everything!!!");
    }
    public  void  talk(Childrens styleOfTalking){
        System.out.println("kindly and Strictly");
    }

    public static void main(String[] args) {
        TheWayWeTalk talk = new TheWayWeTalk(); //  object creation
        Parents parents = new Parents();
        Boss boss = new Boss();
        Friends friends = new Friends();
        Partner partner = new Partner();
        Childrens childrens = new Childrens();
        talk.talk(boss);                         // calling method
        talk.talk(parents);
        talk.talk(childrens);
        talk.talk(partner);
        talk.talk(friends);
    }
}