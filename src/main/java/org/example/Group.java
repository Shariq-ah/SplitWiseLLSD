package org.example;

public class Group {

    private int groupId;
    private String groupName;
    private int totalNoMember;
    private User user;
    private Users users;

    public Group() {
    }

    public Group(String groupName, int totalNoMember) {
        this.groupName = groupName;
        this.totalNoMember = totalNoMember;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getTotalNoMember() {
        return totalNoMember;
    }

    public void setTotalNoMember(int totalNoMember) {
        this.totalNoMember = totalNoMember;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName=" + groupName +
                ", totalNoMember=" + totalNoMember +
                ", user=" + user +
                ", users=" + users +
                '}';
    }
}

