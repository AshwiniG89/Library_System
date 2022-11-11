public class Module_1 {
    // initiating global variables
    String name,f_name,uni_ID,UID;
    int semister;

    //constructor
    public void getdata(String name,String f_name,String uni_ID,String UID, int semister){
        //take input as local variable
        // comparing local variable with globle variable
        this.name=name;
        this.f_name=f_name;
        this.uni_ID=uni_ID;
        this.UID=UID;;
        this.semister=semister;
    }
    //statment print out line

    public void setdata(){
        System.out.println("Student's name: "+name);
        System.out.println("Student's father name: "+f_name);
        System.out.println("University id: "+uni_ID);
        System.out.println("User id: "+UID);
        System.out.println("Semister: "+semister);
    }

}
