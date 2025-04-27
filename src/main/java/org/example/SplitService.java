package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitService {

    public Group createGroup(Users users, String name, int numUsers){

        Group group = new Group(name,numUsers);
        group.setUsers(users);

        return group;
    }


    public User addExpenses(String userName, long amount){

        Expenses expenses = new Expenses();
        expenses.setAmount(amount);

        User user = new User();

        user.setName(userName);
        user.setExpenses(expenses);

        return user;
    }

    public long calculateSplit(long spend, String splitType, int numUsers){

        double eachUserSpend = 0;

        if(SplitType.equal.equals("EQUAL")){
            eachUserSpend = (double) spend /numUsers;
        }

        return (long) eachUserSpend;
    }

    public void split(Group group, String splitType){
        long totalSpend = 0;
        int n = group.getTotalNoMember();
        List<User> userList = group.getUsers().getUserList();

        for (User user : userList){
            totalSpend += user.getExpenses().getAmount();
        }

        long eachUserExpAfterSplit = calculateSplit(totalSpend, splitType, n);

        for (User user : userList){
            long userSpend = user.getExpenses().getAmount();
            if (userSpend < eachUserExpAfterSplit){
                user.setOwes(eachUserExpAfterSplit-userSpend);
            }else {
                user.setBalance(userSpend-eachUserExpAfterSplit);
            }
        }
    }

    public void splitWise(){

        System.out.println("Welcome to SplitWise");

        System.out.println("Enter group name and number of users to add");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int numUsers = scanner.nextInt();

        List<User> userList = new ArrayList<>();

        for (int i=1; i<numUsers+1; i++){

            System.out.println("Enter userName" );
            String userName = scanner.next();
            System.out.println("Enter User's expenses");
            long amount = scanner.nextLong();

            userList.add(addExpenses(userName, amount));
        }

        Users users = new Users(userList);
        Group group = createGroup(users, name, numUsers);
        split(group, "EQUAL");

        for (User user : group.getUsers().getUserList()){
            System.out.println(user.getName() + " Owes: " + user.getOwes());
            System.out.println(user.getName() + " Balance: " + user.getBalance());

        }
    }

}
