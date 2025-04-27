package org.example;


//Splitwise system design
//Users can be added to the system
//
//Users can create groups
//
//Expenses can be added by a user
//
//An expense can be split in different ways:
//
//Equal Split
//
//Exact Amount Split
//
//Percentage Split
//
//The system should calculate how much each user owes
//
//A user should be able to view balances with other users

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        SplitService service = new SplitService();
        service.splitWise();;

    }
}