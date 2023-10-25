package Favority;

public class FavorityBook {
    String name;
    int age;
    String favBook;

    public FavorityBook(String name, int age, String favBook){
        this.name = name;
        this.age = age;
        this.favBook = favBook;
    }
    public static void getUserString(String name, int age, String favBook){
        System.out.println("Hello, " + name + " .You have a good taste (" + favBook + "). "+ "For your age (" + age + ") I can recommend: ");
    }
    public static void recommendation(int age, String name){
        if (age >= 13 && age <= 16) {
            System.out.println("'Loving reaper' Jenny Jinya and 'The Chronicles of Narnia' John Ronald Reuel Tolkien");
        }else if (age<13){
            System.out.println("'Bad boys' Aaron Blaby");
        }
        if (age >= 17 && age <= 25) {
            System.out.println("'Trash of the count's family' Yoo Ryeo Han");
            System.out.println("'Lore Olympus' Rachel Smythe");
            System.out.println("'The subtle art of not giving a f**k: a counterintuitive approach to living a good life' Mark Menson");
        }
        if(age>25){
            System.out.println("'Loss of humanity' Dazai Osamu");
        }
    }
}

