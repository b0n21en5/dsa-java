import java.util.Scanner;


//the term method overloading allows us to have more
//methods with same name, since this process executed
// in compile time it is called as  compile time polymorphism

public class methodOverLoading extends student {
    
    public static void main(String[] args) {
        
        student std = new student();
        
        std.student();
        

    }
    
}


class student{

    static Scanner Sc = new Scanner(System.in);

    
    void student(){

        System.out.println("\nEnter you'r Id: ");
        int id = Sc.nextInt();

        System.out.println("Id: " + id);
        student(id);

        
    }

    void student(int id){

        String name="";

        switch(id){
            case 1:name = "Kayach";break;
            case 2:name = "Dibakar";break;
            case 3:name = "Ratnadip";break;
            case 4:name = "Piklu";break;
            case 5:name = "Shubhankar";break;
            case 6:name = "Gourmani";break;
            case 7:name = "Souvik";break;
            case 8:name = "Sandip";break;
            case 9:name = "Naveen";break;
            case 10:name = "Ashish";break;
            case 11:name = "Hemant";break;
            default:System.out.println("Invalid Id..");
        }

        student(name);
    }


    void student(String name){

        int marks=0 ;

        switch(name){
            case "Kayach": marks = 77;break;
            case "Dibakar": marks = 88;break;
            case "Ratnadip": marks = 91;break;
            case "Piklu": marks = 69;break;
            case "Shubhankar": marks = 80;break;
            case "Gourmani": marks = 79;break;
            case "Souvik": marks = 96;break;
            case "Sandip": marks = 63;break;
            case "Naveen": marks = 98;break;
            case "Ashish": marks = 93;break;
            case "Hemant": marks = 99;break;
            
        }

        student(name, marks);
    }

    void student(String name, int marks){

        System.out.println("Name: "+ name + "\nMarks: " + marks);
    }
}
