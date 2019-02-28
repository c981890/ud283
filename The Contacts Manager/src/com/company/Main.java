package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ContactsManager myContactManager = new ContactsManager();

        Contact friendAiki = new Contact();
        friendAiki.name = "Aiki";
        friendAiki.phoneNumber = "+372 522 1539";
        myContactManager.addContact(friendAiki);

        Contact friendAleks = new Contact();
        friendAleks.name = "Aleks";
        friendAleks.phoneNumber = " ";

        Contact searchedName = myContactManager.searchContact("Aiki");
        String phone = searchedName.phoneNumber;
        System.out.println(phone);

    }
}
