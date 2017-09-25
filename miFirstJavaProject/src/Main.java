class Contact{
    String name;
    String email;
    String phoneNumber;
}

class ContactsManager {
    // Fields:
    Contact [] myFriends;
    int friendsCount;

    // Constructor:
    ContactsManager(){
        friendsCount = 0;
        myFriends = new Contact[500];
    }

    // Methods:
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String [] args){
        ContactsManager myContactsManager = new ContactsManager();
        Contact irene = new Contact();
        irene.name = "Irene Foo";
        irene.phoneNumber = "654125478";
        Contact mama = new Contact();
        mama.name = "Mercedes Bar";
        mama.phoneNumber = "875412365";

        myContactsManager.addContact(irene);
        myContactsManager.addContact(mama);

        System.out.println(myContactsManager.searchContact("Mercedes Bar").phoneNumber);
    }
}
