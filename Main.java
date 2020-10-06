interface Computation{//Initialize an interface
    void computation(int budget); //created abstract method for transpotopm budget
    void computation(int cock,int hen, int chicken); //created abstract method for chicken computation
}
class Chicken implements Computation{//created class for chicken computation

    public void computation(int budget){//created dummy method because it is required on the interface
    }

    public void computation(int cock, int hen, int chicken){//created computation method with body
        int sum = (5*cock)+(3*hen)+(chicken/3);//compute the input to check if its 100
        if(sum == 100){//if its exactly 100
            System.out.println("Qty of chickens exactly cost 100");
        }
        else if (sum < 100){//if its less than 100
            System.out.println("Qty of chickens cost below 100");
        }
        else {//if its greater than 100
            System.out.println("Qty of chickens cost greater than 100");
        }
    }
}
class Transportation implements Computation{//created class for trasportation budged
    public void computation(int budget){
        //added multiple if statements to validate if budget is good for type of transportation mode
        if(budget >= 300){
            System.out.println("Has budget for Bus transportation");
        }
        if(budget >= 400){
            System.out.println("Has budget for Train transportation");
        }
        if(budget >=500){
            System.out.println("Has budget for Driving transportation");
        }
        if (budget >=1000){
            System.out.println("Has budget for Plane transportation");
        }

    }
    public void computation(int cock, int hen, int chicken){//created dummy method because it is required on the interface
    }
}
public class Main {

    public static void main(String [] args){

        Chicken chikken = new Chicken();
        Transportation transpo = new Transportation();
        chikken.computation(0,25,75);//calls computation method of Chicken class
        System.out.println("-----------------------------");
        transpo.computation(500);//calls computation method of Transportation method

    }
}
