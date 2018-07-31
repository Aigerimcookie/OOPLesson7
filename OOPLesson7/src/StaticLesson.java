public class StaticLesson {
//
//    String name;
//    int age;
//
//
//
//        void display(){
//            System.out.println(name+" "+age);
//        }
//
//}
//
//class StaticLessonTest{
//    public static void main(String[] args) {
//
//    StaticLesson Employee1 = new StaticLesson();
//        Employee1.name="Aika";
//        Employee1.age = 22;
//
//        Employee1.display();
//
//}
//}



//
//    int id;
//    String name;
//    int age;
//
//    void insert(int a, String i, int b){
//
//    id = a;
//    name = i;
//    age = b;
//    }
//    void display(){
//            System.out.println(id+" "+name+" "+age);
//        }
//
//}
//    class StaticLessonTest{
//        public static void main(String[] args) {
//            StaticLesson Employee1 = new StaticLesson();
//
//            Employee1.insert(123, "Aigerim", 22);
//            Employee1.display();
//        }
//    }
//


//    int id;
//    String name;
//    int age;
//
//    StaticLesson(int a, String b, int c){
//        id = a;
//        name = b;
//        age =c;
//
//        }
//        void display(){
//            System.out.println(id+ " "+name+" "+age);
//        }
//}
//
//    class StaticLessonTes{
//    public static void main(String[]args){
//        StaticLesson l = new StaticLesson(123, "Aigerim", 23);
//        l.display();
//        }
//        }



//    int id;//копирование данных одного обьекта в другой
//    String name;
//
//    StaticLesson (int i, String a){
//    id= i;
//    name = a;
//    }
//    StaticLesson(StaticLesson a){
//        id = a.id;
//        name = a.name;
//    }
//
//    void display(){
//        System.out.println(id+" "+name);
//    }
//
//    public static void main(String[] args) {
//        StaticLesson stat1 = new StaticLesson(123, "Aigerim");
//        StaticLesson stat2 = new StaticLesson(stat1);
//
//        stat1.display();
//        stat2.display();
//
//    }
//


//    int num;
//
//    StaticLesson(int i){
//        num = i;
//    }
//        void display(){
//            System.out.println(num +"sq.="+num*num*num);
//        }
//
//
//    public static void main(String[] args) {
//        StaticLesson stat1 = new StaticLesson(3);
//        stat1.display();
//    }




}