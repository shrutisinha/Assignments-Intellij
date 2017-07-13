package JavaAssignmentDay2.question4;
/*
*Complete the previous exercise by creating objects to attach to the array of references.
*/
import JavaAssignmentDay2.question3.ObjArr;
public class Question4{
    public static void main(String[] args) {
        //Array of references
        ObjArr obj[] = new ObjArr[5];
        obj[0] = new ObjArr("gate");
        obj[1] = new ObjArr("cat");
        obj[2] = new ObjArr("jee");
        obj[3] = new ObjArr("mat");
        obj[4] = new ObjArr("gmat");

    }
}
//class ObjArr {
//    String s;
//
//    ObjArr(String str) {
//        s = str;
//        System.out.println("Initialization message. s= " + str);
//        //s=str;
//    }
//
//    // ObjArr(){
//    // 	System.out.println("hi");
//    // }
//
//}