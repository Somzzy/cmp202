public class Student extends User {
    String matric_number = "bhu/22/02/02/0022";
    String admission_no = "12345";
    String registerCourse() {
        if (matric_number == "") {
            return "You cannot register at this moment";
        } else {
            return "You have registered for cmp 202";
        }
    }
    String checkResults() {
        if (matric_number == "") {
            return "Cannot check result.";
        } else {
            return "checked susessfully. 11 As.";
        }
    }    
}