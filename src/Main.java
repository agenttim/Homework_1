public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();

        for (int i = 0; i < 15; i++)
            myList.add(i*5);

        for (int i = 0; i < myList.size(); i++)
            System.out.println(myList.get(i));

        System.out.println("My list size: " + myList.size());

        myList.remove(10);
        for (int i = 0; i < myList.size(); i++)
            System.out.println(myList.get(i));









    }
}
