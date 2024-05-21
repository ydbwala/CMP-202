public class Student extends Userr{
 


    String matricNo;
   String AdmissionNo;

    String RegisterCourse(){
        return "CMP202";
    }
    
    String CheckResult(){
     matricNo = "BHU/22/04/09/0039";
     AdmissionNo = "112242558";
     if (matricNo.equals("BHU/22/04/09/0039")||AdmissionNo.equals("112242558")) {
        
        return "Result";
     }

     else{
        return " FAILED!! Input matric number and admission number";
     }

     
    }
    public static void main(String[] args) {
         new Student();

         System.out.println("RESULT");

 
        
    }
}
