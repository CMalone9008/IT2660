import java.util.Random;

public class randomNumber {
   public void randomSequence(){
        Random random = new Random(100);
        for(int i=0;i<100;i++){
            System.out.println(random.nextInt());
        }
    }
	public static void main(String args[]){
		randomNumber test = new randomNumber();		
		System.out.println("New Random Numbers");
		test.randomSequence();
	}
}


