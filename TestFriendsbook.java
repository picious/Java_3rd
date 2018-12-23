import java.util.ArrayList;

/**
 * TestFriendsbook
 */
public class TestFriendsbook {

  public static void main(String[] args) {
    
    Friendsbook agenda = new Friendsbook();
    Friend friend1 = new Friend("George", "2310999000");
    Friend friend2 = new Friend("Chris", "2310999888");
    Friend friend3 = new Friend("Nick", "23107776666");
    agenda.storeAFriend(friend1);
    agenda.storeAFriend(friend2);
    agenda.storeAFriend(friend3);
    friend1.setBirthday("31/12/1978");
    friend2.setBirthday("25/12/1977");
    friend3.setBirthday("25/07/1967");
    friend1.setName("Jorge");
    System.out.println("*****Friends calls******");
    friend1.printFriend();
    friend1.setPhone("2310333555");
    friend1.printFriend();
    System.out.println(friend1.getBirthday());
    System.out.println(friend1.getMonthBirthday());
    System.out.println(friend1.getDayBirthday());
    friend1.printAFriendBirthday();

    System.out.println("*****Friendsbook calls******");
    
    agenda.numbrerOfFriends();
    agenda.showAFriend(2);
    agenda.removeAFriend(2);
    agenda.listAllFriends();
    agenda.numbrerOfFriends();
    agenda.sameMonthBirthday("12");
    agenda.friendBookInfo();
    
    
    
  }
  
}