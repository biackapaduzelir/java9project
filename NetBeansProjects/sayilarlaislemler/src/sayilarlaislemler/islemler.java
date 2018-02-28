
package sayilarlaislemler;

public class islemler {

    public static class basamak {

        public basamak(int sayi) {
            super();
            int toplam = 0;
            while (sayi > 0) {
                int birler = sayi % 10;
                sayi -= birler;
                sayi /= 10;
                toplam += birler;
            }
            System.out.println("Sayinin Basamak Toplami:" + toplam);
        }
    }
public class mukemmel
{
	public mukemmel(int sayi)
	{
		int toplam=0;
		
		if(sayi>0)
		{
		for(int say=1;say<sayi;say++)
		{
			if(sayi%say==0)
				toplam+=say;
		}
		
		if(toplam==sayi)
			System.out.println("Sayi Mukemmel Sayidir!");
		else
			System.out.println("Sayi Mukemmel Degil!");
	
		}
		else
			System.out.println("Sayi>0 Olmali!");
	}
	
}
}
