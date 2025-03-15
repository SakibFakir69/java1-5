



// java mid term 1-5 

/// chapter 1 
// class Area{

//     void show(){
        
//         int h =10;
//         int w =20;
//         int ans = h*w;
//         System.out.println("Answer is: "+ans);
//     }
// }

class Test{

    int roll;
    int age ;

    Test(int roll, int age){
        this.roll=roll;
        this.age=age;
    }

    Test(Test s)
    {
        this.roll=s.age;
        this.age=s.age;
    }

    void Show(){
        System.out.println("call");
        
        System.out.println("Your age is  "+roll);
        System.out.println("Your roll is a  : "+age);
    }
}


public class sakib {

    public static void main(String[] args){


        Test x = new Test(10, 12);
   
        Test x2 = new Test(x);
        x2.Show();
        x.Show();



      

       


        
    
    }

    
}
