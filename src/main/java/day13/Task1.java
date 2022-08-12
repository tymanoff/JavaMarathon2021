package day13;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");




        user1.subscribe(user2);

        user2.subscribe(user1);
        user3.subscribe(user1);


        System.out.println(" подписки user1 " + user1.getSubscriptions());
        System.out.println(" подписки user2 " + user2.getSubscriptions());

        System.out.println(user1.isSubscribed(user2));
        System.out.println(user2.isSubscribed(user1));

        System.out.println(user1.isFriend(user2));

        user1.sendMessage(user2, "сообщение второму от 1");
        user2.sendMessage(user1, "сообщение первому от 2");
        user3.sendMessage(user1, "сообщение первому от 3");


        MessageDatabase.showDialog(user1,user2);



    }
}
