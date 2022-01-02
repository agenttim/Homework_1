public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();

        for (int i = 0; i < 15; i++)
            myList.add(i*5);

        for (int i = 0; i < myList.size(); i++)
            System.out.println(myList.get(i));

        System.out.println("В массиве хранится: " + myList.size() + " элементов");

/*        myList.remove(10);
        for (int i = 0; i < myList.size(); i++)
            System.out.println(myList.get(i));*/

        System.out.println("________________________________________________");

        MyList myList1 = new MyList();

        myList1.add(543);
        myList1.add(-25);
        myList1.add(124);
        myList1.add(13);
        myList1.add(0);

        System.out.print("Массив до сортировки: ");
        for (int i = 0; i < myList1.size(); i++)
            System.out.print(myList1.get(i) + " ");

        myList1.sort();

        System.out.println();
        System.out.print("Массив после сортировки: ");
        for (int i = 0; i < myList1.size(); i++)
            System.out.print(myList1.get(i) + " ");
        System.out.println();

        System.out.println("________________________________________________");



















    }
}
