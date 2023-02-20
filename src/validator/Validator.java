package validator;

public class Validator {
	
	public static boolean laboratuvarValidator(String laboratuvarAd) {
		if(laboratuvarAd.length()<=0 ||laboratuvarAd.length()>50) {return false;}
		return true;
	}
	
	public static boolean cihazValidator(String ad,String laboratuvar_ad) {
		if(ad.length()<=0 ||ad.length()>50) {return false;}
		
		
		if(laboratuvar_ad.length()<=0 ||laboratuvar_ad.length()>50) {return false;}
		return true;
	
	
	}
	public static boolean kullaniciVaidator(String kullaniciAd, String kullaniciSoyad,String kullaniciMail,String kullaniciSifre,String seviye) {
		if(kullaniciAd.length()<=0 ||kullaniciAd.length()>80){return false;}
		
		if(kullaniciSoyad.length()<=0 ||kullaniciSoyad.length()>75){return false;}
		
		if(kullaniciMail.length()<=0 ||kullaniciMail.length()>80){return false;}
		
		if(kullaniciSifre.length()<=0 ||kullaniciSifre.length()>75){return false;}
		
		if(seviye.length()<=0 ||seviye.length()>85){return false;}
		
		return true;
	}
	
}
