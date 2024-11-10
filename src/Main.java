public class Main {
    public static void main(String[] args) {

        // method overriding = 	Declaring a method in subClass,
        //						which is already present in parent class.
        //						done so that a child class can give its own implementation

        //כאשר מתבצעת הורשה, המחלקה היורשת יכולה להחליט לשנות את המימוש של מתודה שעברה אליה בהורשה, בתהליך שנקרא דריסה.
        //התנאי היחיד לאפשרות לדריסה: הרשאת הגישה של המתודה הנדרסת היא או public או protected.
        //כלומר, מתודות שמוגדרות עם הרשאת גישה private לא ניתנות לדריסה.

        //הורשה היא טרנזיטיבית: אם מחלקה A יורשת ממחלקה B, ומחלקה B יורשת ממחלקה C – אזי המחלקה A יורשת (באופן מרומז) את המחלקה C.
        //לדוגמה, אם המחלקה Person מורישה למחלקה Employee, והמחלקה Employee מורישה למחלקה Manager, הדבר אומר שהמחלקה Manager גם היא יורשת את Person.


        Animal animal = new Animal();

        animal.speak();

        Dog dog = new Dog();

        dog.speak();
    }
}