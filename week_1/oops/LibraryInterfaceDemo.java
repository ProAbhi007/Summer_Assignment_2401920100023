public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        //    Test Case #1: KidUser
        KidUser kid = new KidUser();

        kid.age = 10;
        kid.registerAccount();   //  registered as kid

        kid.age = 18;
        kid.registerAccount();   //  age error

        kid.bookType = "Kids";
        kid.requestBook();       //  issued, 10 days

        kid.bookType = "Fiction";
        kid.requestBook();       //  not allowed

        //   Test Case #2: AdultUser 
        AdultUser adult = new AdultUser();

        adult.age = 5;
        adult.registerAccount();  //  age error

        adult.age = 23;
        adult.registerAccount();  //  registered as adult

        adult.bookType = "Kids";
        adult.requestBook();      //  not allowed

        adult.bookType = "Fiction";
        adult.requestBook();      //  issued, 7 days
    }
}