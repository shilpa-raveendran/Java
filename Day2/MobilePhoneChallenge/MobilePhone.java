package mobilephoneChallenge;

import java.util.ArrayList;

public class MobilePhone {
    // write code here
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber=myNumber;
        this.myContacts = new  ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        //if contact doesnt exists ; return true
        if(findContact(contact) == -1){
            this.myContacts.add(contact);
            return true;
        }
        //else
        return false;

    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        //if contact exists && updated --> true
        if(findContact(oldContact) >= 0){
            this.myContacts.add(findContact(oldContact),newContact);
            return true;
        }
        //else--false
        return false;
    }

    public boolean removeContact(Contact toRemove){
        //if contact exists && removed --> true
        //else--false
        if(findContact(toRemove) >= 0 ){
            this.myContacts.remove(toRemove);
            return true;
        }
        return false;
    }

    private int findContact(Contact toFind){
        for(int i = 0 ; i <this.myContacts.size(); i ++){
            if(this.myContacts.get(i).getName() == toFind.getName()){
                return i;
            }
        }
        return -1;
    }
    private int findContact(String toFind){
        for(int i = 0 ; i <this.myContacts.size(); i ++){
            if(this.myContacts.get(i).getName().equals(toFind)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contact){
        int pos= findContact(contact);
        if(pos >= 0){
            return this.myContacts.get(pos);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i =0; i < this.myContacts.size(); i ++){
            System.out.println(i+1+". "+this.myContacts.get(i).getName()+" -> "+ this.myContacts.get(i).getPhoneNumber());
        }
    }
}

