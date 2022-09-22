package mukemellSayı;

public class Main {

	public static void main(String[] args) {
		int number=5;
		int total=0;                            //sayı yı 1 den başlatıp kendisine kadar kendisi dahil olmayacak şekilde böldürmek 
		                                        // ve toplamak 
		
		for(int i=1;i<number;i++) {
			if (number % i==0) {             // o anki sayıyı i ye böl kalan 0 ise  o anki sayı yani "i" totale ekle 
				total=total+i;
			}
		}
          if(total ==number) {
        	  System.out.println("mükemmel sayı");
        	  
          }else {
        	  System.out.println("mükemmel sayı değildir!");
          }
	}

}