import java.util.ArrayList;
import java.util.Iterator;
/**
 * Friendsbook
 */
public class Friendsbook {

  private ArrayList<Friend> friends;

  public Friendsbook() {

    friends = new ArrayList<>();
  }

  // Μέθοδος που δέχεται ένα φίλο, αντικείμενο κλάσης Friend και
  // προσθέτεται στην ατζέντα ArrayList<Friend>
  public void storeAFriend(Friend aFriend) {
    String toAdd = aFriend.getName();
    friends.add(aFriend);
  }

 //Επιστρέφει το πλήθος (sum) των καταχωρημένων φίλων 
  public void numbrerOfFriends() {
    int sum = 0;
    for (int i = 0; i < friends.size(); i++) {
      sum++;
    }
    System.out.println(sum);    
  }

  // Δέχεται αριθμοδείκτη (indexFriend) και προβάλει τα
  // στοιχεία του φίλου με βάση τον δείκτη.
  public void showAFriend(int indexFriend) {
    friends.get(indexFriend).printFriend();
  }
  
  // Δέχεται αριθμοδείκτη (indexFriend) και αφαιρεί τα
  // στοιχεία του φίλου με βάση τον δείκτη.
  public void removeAFriend(int indexFriendToRemove) {
    friends.remove(indexFriendToRemove);
  }
  
  // Εμφάνιση όλων των φίλων (με τα στοιχεία τους)
  public void listAllFriends(){
    for (int i = 0; i < friends.size(); i++) {
      friends.get(i).printFriend(); 
    }
  }

  //Εμφανίζει μόνο εκείνους τους φ΄ίλους που έχουν γενέθλια το δοσμένο μήνα.
  // Επίσης υπολογίζει και το πλήθως φίλων με γενέθλια το δοσμένο μήνα 
  public void sameMonthBirthday(String month){
    int sum = 0;
    for (int i = 0; i < friends.size(); i++) {
      if(friends.get(i).getMonthBirthday().equals(month)) {
        friends.get(i).printAFriendBirthday();
        sum++;
      }      
    }
    System.out.println("Number of gifts to buy: " + sum);
  }
  
  public void friendBookInfo() {
    int last = friends.size()-1;
    System.out.println("The Friendsbook contains " + friends.size() + " friends");
    System.out.println("The friends are numbered from 0 to " + last);
    System.out.println("The first friend, which has the number 0 is: " + friends.get(0).getName());
    System.out.println("The last friend, which has the number " + last  + " is: " + friends.get(last).getName() );

  }

}