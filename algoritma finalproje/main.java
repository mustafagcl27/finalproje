package finalproje1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 // işci id =123 patron =0 muhasebe =456
		 
		patron1 patron =new patron1();
		isci1 işci =new isci1();
		muhasebeci1 muhasebeci=new muhasebeci1();
				işci.setİd(123);
		Scanner scanner = new Scanner(System.in);
		boolean sistem=true;
		boolean giris =true;
			int isciücret=50;
			işci.setSaatlikücret(isciücret);
		while (sistem) {
			
		
		System.out.println("*****Sisteme hoşgeldiniz*****");
		
		System.out.print("lütfen isminizi giriniz : " );
		String isim = scanner.nextLine();
		System.out.print("lütfen soy isminizi giriniz : ");
		String soyisim = scanner.nextLine();
		System.out.print("lütfen yaşınızı giriniz : ");
		int yas =scanner.nextInt();
		scanner.nextLine();
		if (yas<=18 && yas>0) {
			System.out.println("18 yaşınızın altındasınız bu iş için 18 yaş ve üstü zorunluluğu vardır !!!!");
			giris=false;
		}else if (yas<0) {
			System.out.println("yaşınız negatif olamaz!!!");
			giris=false;
		}else {
			sistem=false;
		}
		
while (giris) {
	System.out.println("LÜTFEN BİR SEÇİM YAPINIZ \n"
			+ "1-GİRİŞ\n"
			+ "2-İD ALMA");
	int seçim =scanner.nextInt();
	switch (seçim) {
	case 1:
		System.out.print("LÜTFEN ID NİZİ GİRİNİZ : ");
		int id =scanner.nextInt();
		if (id==işci.getİd()) {
			//işci
			giris=false;
			işci.setİsim(isim);
			işci.setSoyisim(soyisim);
			işci.setYas(yas);
		
			Boolean isci =true;
			System.out.println("sisteme hoşgeldiniz "+işci.getİsim()+" "+işci.getSoyisim());
			System.out.println(" ");
			while (isci) {
				işci.setMaas(işci.getToplamçalışmasaati()*işci.getSaatlikücret());
			System.out.println("LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ\n"
					+ "1-BİLGİLERİ GÖRÜNTÜLEME\n"
					+ "2-GÜNLÜK ÜRETİM BİLGİSİ GİRME\n"
					+ "3-GÜNLÜK ÇALIŞMA SAATİ GİRME\n"
					+ "4-ANA MENÜYE DÖNME\n"
					+ "5-SİSTEMDEN ÇIKIŞ YAPMA\n"
					+ "6-MESAJ KUTUSU");
			
			int isciseçim=scanner.nextInt();
			switch (isciseçim) {
			case 1:
System.out.println("ID                      : "+işci.getİd());
System.out.println("İSİM                    : "+işci.getİsim());
System.out.println("SOY İSİM                : "+işci.getSoyisim());
System.out.println("YAŞ                     : " +işci.getYas());
System.out.println("SAATLİK ÜCRET           : "+işci.getSaatlikücret());
System.out.println("TOPLAM ÇALIŞMA SAATİ    : "+işci.getToplamçalışmasaati());
System.out.println("TOPLAM CÜZDAN HESABINIZ : "+işci.getMaas());
System.out.println("TOPLAM ÜRETİM :"+işci.getGenelüretim());
				break;
			case 2:
			Boolean üretim1 =true;
			while (üretim1) {
					System.out.print("LÜTFEN ÇALIŞTIĞINIZ SÜRE BOYUNCA ÜRETTİĞİNİZ MALI TON CİNSİNDEN GİRİNİZ : ");
				Double üretim =scanner.nextDouble();
				if (üretim>0) {
				işci.setGünlüküretimBilgisi(üretim);
				işci.setGenelüretim(işci.getGenelüretim()+işci.getGünlüküretimBilgisi());
				System.out.println("tebrikler başarıyla sisteme girilmiştir...");
				üretim1=false;
				}else {
					System.out.println("ÜRETİM NEGATİF OLAMAZ!!!!!");
					System.out.println("LÜTFEN TEKRAR DENEYİNİZ");
				}
			
				
				}
				break;
			case 3:
				Boolean çalışmasaati=true;
				System.out.print("LÜTFEN ÇALIŞMA SAATİNİZİ GİRİNİZ :");
			int	çalışmasaati1=scanner.nextInt();
			if (çalışmasaati1> 0) {
				işci.setSaatlikçalışma(çalışmasaati1);
				işci.setToplamçalışmasaati(işci.getToplamçalışmasaati()+işci.getSaatlikçalışma());
				System.out.println("SİSTEME BAŞARILI BİR ŞEKİLDE KAYDEDİLMİŞTİR...");
				çalışmasaati=false;
			}else {
				System.out.println("ÇALIŞMA SAATİ NEGATİF OLAMAZ!!!");
				System.out.println("LÜTFEN TEKRAR DENEYİNİZ");
			}
				
				break;
			case 4:
				isci=false;
				giris=true;
				break;
			case 5:
				isci=false;
				sistem=false;
				giris=false;
				System.out.println("SİSTEMDEN BAŞARIYLA ÇIKIŞ YAPILDI");
				System.out.println("İYİ GÜNLER DİLERİZ...");
				break;
				case 6:
				
					System.out.println("GELEN MESAJ KUTUSU\n"
							+ "1-GENEL MESAJ\n"
							+ "2-PATRON\n"
							+ "3-MUHASEBE");
					int case6=scanner.nextInt();
					switch (case6) {
					case 1:
						System.out.println("-----------------------------------");
System.out.println(" GENEL MESAJ\n"
		+ patron.getGenelmesajp());
System.out.println("-----------------------------------");

						break;
case 2:
	System.out.println("-----------------------------------");
System.out.println("PATRON ÖZEL MESAJ\n"
		+ patron.getGidenmesaj());
System.out.println("-----------------------------------");

						
						break;
case 3:
	System.out.println("-----------------------------------");
System.out.println("MUHASEBE ÖZEL MESAJ\n"
		+ muhasebeci.getGidenmesaj());
System.out.println("-----------------------------------");

	
	break;
					default:
						System.out.println("lütfen belirtilen seçeneklerdeki rakamı tuşlayınız!!!!");

						break;
					}
					
					
					break;
			default:
				System.out.println("lütfen belirtilen seçeneklerdeki rakamı tuşlayınız!!!!");

				break;
			}
			
			
			}
		}else if (id==muhasebeci.getİd()) {
			//muhasebeci
		boolean muhasebe =true;
		giris=false;
		muhasebeci.setİsim(isim);
		muhasebeci.setSoyisim(soyisim);
		muhasebeci.setYas(yas);
		muhasebeci.setSaatlikücret(150);
		System.out.println("SİSTEME HOŞGELDİNİZ "+muhasebeci.getİsim()+muhasebeci.getSoyisim());
		System.out.println(" ");
		muhasebeci.setStok(muhasebeci.getStok()+işci.getGenelüretim());
		while (muhasebe) {
			
			muhasebeci.setMaas(muhasebeci.getSaatlikücret()*muhasebeci.getToplamçalışmasaati());
			System.out.println("LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ\n"
					+ "1-BİLGİLERİ GÖRÜNTÜLEME\n"
					+ "2-TOPLAM ÜRETİMİ VE STOĞU GÖRME\n"
					+ "3-SATIŞ\n"
					+ "4-ÇALIŞAN BİLGİSİ GÖRÜNTÜLEME\n"
					+ "5-ÇALIŞAN MAAŞINA ZAM YAP\n"
					+ "6-ŞİRKET MAL VARLIĞI GÖRÜNTÜLEME\n"
					+ "7-GELEN MESAJ\n"
					+ "8-MESAJ GÖNDER\n"
					+ "9-GÜNLÜK ÇALIŞMA SAATİ GİRME\n"
					+ "10-ANA MENÜYE DÖNME\n"
					+ "11-SİSTEMDEN ÇIKIŞ YAPMA");
			int seçim1 =scanner.nextInt();
			switch (seçim1) {
			case 1:
				System.out.println("ID : "+muhasebeci.getİd());
				System.out.println("İSİM : "+muhasebeci.getİsim());
				System.out.println("SOY İSİM : "+muhasebeci.getSoyisim());
				System.out.println("YAŞ : "+muhasebeci.getYas());
				System.out.println("SAATLİK ÜCRET : "+muhasebeci.getSaatlikücret());
				System.out.println("TOPLAM ÇALIŞMA SAATİ : "+muhasebeci.getToplamçalışmasaati());
				System.out.println("TOPLAM CÜZDAN HESABI : "+muhasebeci.getMaas());
				break;
               case 2:
				System.out.println("TOPLAM ÜRETİM (TON CİNSİNDEN) : "+işci.getGenelüretim());
				System.out.println("ŞUANKİ STOK (TON CİNSİNDEN) : "+muhasebeci.getStok());
				break;
                case 3:
                	Boolean satış1=true;
    while (satış1) {            	
	System.out.print("SATILACAK MALI TON CİNSİNDEN GİRİNİZ :");
	double mal =scanner.nextDouble();
	
		if (muhasebeci.getStok()>=mal && mal>0) {
			boolean satış2 =true;
			while (satış2) {
			System.out.print("MALIN FİYATINI GİRİNİZ :");
			double fiyat=scanner.nextDouble();
			
				if (fiyat>0) {
					muhasebeci.setStok(muhasebeci.getStok()-mal);
					double satış=mal*fiyat;
					muhasebeci.setKasa(muhasebeci.getKasa()+satış);
					System.out.println("SATIŞ BAŞARIYLA GERÇEKLEŞTİRİLMİŞTİR...");
					System.out.println("SATIŞTAN ELDE ETTİĞİNİZ KAZANÇ :"+satış);
					System.out.println("GÜNCEL STOK DURUMU :"+muhasebeci.getStok());
					satış2=false;
					satış1=false;
				}else {
					System.out.println("TUTAR NEGATİF VEYA 0 OLAMAZ LÜTFEN TEKRAR GİRİNİZ!!!");
					satış1=false;
				}
			}
		}else {
			System.out.println("MAL STOKTAN BÜYÜK VEYA NEGATİF OLAMAZ!!!");
			System.out.println("GÜNCEL STOK (TON CİNSİNDEN) :"+muhasebeci.getStok());
			
		}
	}
	
	break;
                    case 4:
                    	System.out.println("LÜTFEN BİR TERCİH YAPINIZ\n"
                    			+ "1-İŞCİ ");
                    	int tercih=scanner.nextInt();
                    	switch (tercih) {
						case 1:
							System.out.println("ID                      : "+işci.getİd());
							System.out.println("İSİM                    : "+işci.getİsim());
							System.out.println("SOY İSİM                : "+işci.getSoyisim());
							System.out.println("YAŞ                     : " +işci.getYas());
							System.out.println("SAATLİK ÜCRET           : "+işci.getSaatlikücret());
							System.out.println("TOPLAM ÇALIŞMA SAATİ    : "+işci.getToplamçalışmasaati());
							break;

						default:
							System.out.println("lütfen belirtilen seçeneklerdeki rakamı tuşlayınız!!!!");

							break;
						}
	
	break;
              case 5:
            	  Boolean secim3=true;
            	  while (secim3) { 
            		  
            		  System.out.println("LÜTFEN ZAM YAPILACAK OLAN BÖLÜMÜ SEÇİNİZ\n"
            	  		+ "1-İŞCİ\n"
            	  		+ "2-MUHASEBE");
               int case5=scanner.nextInt();
               switch (case5) {
			case 1:
				 Boolean zamoranı=true;
            	  while (zamoranı) {
            		  System.out.println("ŞUANKİ SAATLİK İŞCİ ÜCRETİ :"+işci.getSaatlikücret());
						  System.out.print("LÜTFEN YAPILACAK OLAN ZAM TUTARINI GİRİNİZ :");
						  int zam =scanner.nextInt();
						  if (zam>0) {
							secim3=false;
							zamoranı=false;
							işci.setSaatlikücret(işci.getSaatlikücret()+zam);
							System.out.println("ZAM YAPILMIŞTIR GÜNCEL SAATLİK İŞCİ MAAŞI :"+işci.getSaatlikücret());
							
						}else {
							System.out.println("ZAM ORANI NEGATİF OLAMAZ!!!");
							secim3=false;
						}
						  
						 } 
				break;
			case 2:
				boolean zam4=true;
				while (zam4) {
					System.out.println("ŞUANKİ MUHASEBECİ SAATLİK ÜCRETİ :"+muhasebeci.getSaatlikücret());
					  System.out.print("LÜTFEN YAPILACAK OLAN ZAM TUTARINI GİRİNİZ :");
					  int zam =scanner.nextInt();
					  if (zam>0) {
							secim3=false;
							zam4=false;
							muhasebeci.setSaatlikücret(muhasebeci.getSaatlikücret()+zam);
							System.out.println("ZAM YAPILMIŞTIR GÜNCEL SAATLİK MUHASEBECİ MAAŞI :"+muhasebeci.getSaatlikücret());
							
						}else {
							System.out.println("ZAM ORANI NEGATİF OLAMAZ!!!");
							secim3=false;
						}
						  
				}
				break;
			default:
				System.out.println("LÜTFEN BELİRTİLEN ARALIKTA BİR SEÇİM YAPINIZ!!!");
				break;
			
				}
				}
	
	break;
              case 6:
	System.out.println("GÜNCEL ŞİRKET KASASI DURUMU :"+muhasebeci.getKasa());
	break;
                 case 7:
                	 System.out.println("GELEN MESAJ KUTUSU\n"
 							+ "1-GENEL MESAJ\n"
 							+ "2-PATRON");
                 int case7=scanner.nextInt();
                 switch (case7) {
				case 1:
					System.out.println("-----------------------------------");
System.out.println("PATRON GENEL MESAJ \n"
		+ patron.getGenelmesajp());
System.out.println("-----------------------------------");

					break;
				case 2:
					System.out.println("-----------------------------------");
System.out.println("PATRON ÖZEL MESAJ\n"
		+ patron.getMuhasebeciyegidenmesaj());
System.out.println("-----------------------------------");

					break;
				default:
					break;
				}
	
	break;
               case 8:
	System.out.println("KİŞİLER\n"
			+ "1-PATRON\n"
			+ "2-İŞÇİ\n"
			);
	int seçim5 =scanner.nextInt();
	switch (seçim5) {
	case 1:
		scanner.nextLine();
		System.out.print("LÜTFEN GÖNDERMEK İSTEDİĞİNİZ MESAJI YAZINIZ :");
		String mesaj1 =scanner.nextLine();
		System.out.println("MESAJINIZ İLETİLMİŞTİR");

		muhasebeci.setPatrongidenmesaj(mesaj1);
		break;
		
	case 2:
		scanner.nextLine();
		System.out.print("LÜTFEN GÖNDERMEK İSTEDİĞİNİZ MESAJI YAZINIZ :");
		String mesaj2 =scanner.nextLine();
		System.out.println("MESAJINIZ İLETİLMİŞTİR");

		muhasebeci.setGidenmesaj(mesaj2);
		break;
	default:
		System.out.println("LÜTFEN BELİRTİLEN ARALIKTA BİR TERCİH YAPINIZ!!!");
		break;
	}
	break;
                 case 9:
                	 Boolean saat1 =true;
                	 while (saat1) {
						System.out.print("LÜTFEN ÇALIŞTIĞINIZ SÜREYİ SAAT CİNSİNDEN GİRİNİZ :");
	int saat=scanner.nextInt();
				if (saat>=1) {
					muhasebeci.setSaatlikçalışma(saat);
	muhasebeci.setToplamçalışmasaati(muhasebeci.getToplamçalışmasaati()+saat);
	System.out.println("GÜNCEL TOPLAM ÇALIŞMA SAATİNİZ :"+muhasebeci.getToplamçalışmasaati());
	saat1=false;
				}else {
					System.out.println("ÇALIŞMA SAATİNİZ NEGATİF VEYA 0 OLAMAZ!!!");
				}
	
	}  
	break;
            case 10: 	
            	muhasebe=false;
            	giris=true;
	break;
                case 11:
                	              	
	muhasebe=false;
	giris=false;
	System.out.println("SİSTEMDEN BAŞARIYLA ÇIKIŞ YAPILDI");
	System.out.println("İYİ GÜNLER DİLERİZ...");
                	break;

			default:
				System.out.println("lütfen belirtilen seçeneklerdeki rakamı tuşlayınız!!!!");

				break;
			}
			
		}
			
		}else if (id==0) {
			//patron
			giris=false;
			boolean patron2=true;
			patron.setİsim(isim);
			patron.setSoyisim(soyisim);
			patron.setYas(yas);
			patron.setSaatlikücret(500);
			System.out.println("SİSTEME HOŞGELDİNİZ SAYIN "+patron.getİsim()+patron.getSoyisim());
			System.out.println(" ");
			while (patron2) {
				patron.setMaas(patron.getSaatlikücret()*patron.getToplamçalışmasaati());
				System.out.println("LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ\n"
						+ "1-BİLGİLERİ GÖRÜNTÜLE\n"
						+ "2-STOK DURUMU\n"
						+ "3-GÜNCEL KASA BİLGİSİ\n"
						+ "4-ÇALIŞAN BİLGİLERİ GÖRÜNTÜLEME\n"
						+ "5-MESAJ GÖNDERME\n"
						+ "6-GELEN MESAJ KUTUSU\n"
						+ "7-ANA MENÜYE DÖNME\n"
						+ "8-SİSTEMDEN ÇIKIŞ YAPMA");
				int iseçim=scanner.nextInt();
				switch (iseçim) {
				case 1:
					System.out.println("*****BİLGİLERİM*****");
					System.out.println("ID : "+patron.getİd());
					System.out.println("İSİM : "+patron.getİsim());
					System.out.println("SOY İSİM : "+patron.getSoyisim());
					System.out.println("SAATLİK ÜCRET : "+patron.getSaatlikücret());
					System.out.println("TOPLAM ÇALIŞMA SAATİ : "+patron.getToplamçalışmasaati());
					System.out.println("CÜZDANIM : "+patron.getMaas() );
					break;
				case 2:
					System.out.println("GÜNCEL STOK (TON): "+muhasebeci.getStok());
					break;
				case 3:
					System.out.println("GÜNCEL KASA DURUMU "+muhasebeci.getKasa());
					break;
				case 4:
					System.out.println("LÜTFEN GÖRÜNTELEMK İSTEDİĞİNİZ BÖLÜMÜ SEÇİNİZ\n"
							+ "1-İŞCİ\n"
							+ "2-MUHASEBE");
					int görüntüle =scanner.nextInt();
					switch (görüntüle) {
					case 1:
						System.out.println("--------------------------------------------");
						System.out.println("ID                      : "+işci.getİd());
						System.out.println("İSİM                    : "+işci.getİsim());
						System.out.println("SOY İSİM                : "+işci.getSoyisim());
						System.out.println("YAŞ                     : " +işci.getYas());
						System.out.println("SAATLİK ÜCRET           : "+işci.getSaatlikücret());
						System.out.println("TOPLAM ÇALIŞMA SAATİ    : "+işci.getToplamçalışmasaati());
						System.out.println("--------------------------------------------");

						break;
					case 2:
						System.out.println("--------------------------------------------");
						System.out.println("ID : "+muhasebeci.getİd());
						System.out.println("İSİM : "+muhasebeci.getİsim());
						System.out.println("SOY İSİM : "+muhasebeci.getSoyisim());
						System.out.println("YAŞ : "+muhasebeci.getYas());
						System.out.println("SAATLİK ÜCRET : "+muhasebeci.getSaatlikücret());
						System.out.println("TOPLAM ÇALIŞMA SAATİ : "+muhasebeci.getToplamçalışmasaati());
						System.out.println("--------------------------------------------");

						break;
					default:
						System.out.println("lütfen belirtilen seçeneklerdeki rakamı tuşlayınız!!!!");

						break;
					}
					break;
				case 5:
					System.out.println("MESAJ GÖNDERMEK İSTEDİĞİNİZ BÖLÜMÜ SEÇİNİZ\n"
							+ "1-GENEL MESAJ\n"
							+ "2-MUHASEBE\n"
							+ "3-İŞCİ");
					int mesaj7=scanner.nextInt();
					switch (mesaj7) {
					case 1:
						scanner.nextLine();
						System.out.print("LÜTFEN GÖNDERMEK İSTEDİĞİNİZ MESAJI YAZINIZ :");
						String mesaj8=scanner.nextLine();
						System.out.println("MESAJINIZ İLETİLMİŞTİR");

						patron.setGenelmesajp(mesaj8);
						
						break;
					case 2:
						scanner.nextLine();
						System.out.print("LÜTFEN GÖNDERMEK İSTEDİĞİNİZ MESAJI YAZINIZ :");
						String mesaj9=scanner.nextLine();
						System.out.println("MESAJINIZ İLETİLMİŞTİR");

patron.setMuhasebeciyegidenmesaj(mesaj9);
						break;
					case 3:
						scanner.nextLine();
						System.out.print("LÜTFEN GÖNDERMEK İSTEDİĞİNİZ MESAJI YAZINIZ :");
						String mesaj6=scanner.nextLine();
						System.out.println("MESAJINIZ İLETİLMİŞTİR");
						patron.setGidenmesaj(mesaj6);

						break;

					default:
						System.out.println("lütfen belirtilen seçeneklerdeki rakamı tuşlayınız!!!!");

						break;
					}
					
					break;
				case 6:
					System.out.println("LÜTFEN BELİRTİLEN KİŞİLERİ SEÇİNİZ\n"
							+ "1-GENEL MESAJ\n"
							+ "2-MUHASEBE");
					int case6=scanner.nextInt();
					switch (case6) {
					case 1:
						System.out.println("-----------------------------------");
						System.out.println("PATRON GENEL MESAJ \n"
								+ patron.getGenelmesajp());
						System.out.println("-----------------------------------");
						break;
					case 2:
						System.out.println("-----------------------------------");
System.out.println("MUHASEBE ÖZEL MESAJ\n"
		+ muhasebeci.getPatrongidenmesaj());
System.out.println("-----------------------------------");

						
						break;

					default:
						System.out.println("lütfen belirtilen seçeneklerdeki rakamı tuşlayınız!!!!");

						break;
					}
					
					break;
				case 7:
					patron2=false;
	            	giris=true;
					break;
				case 8:
					patron2=false;
	            	giris=false;
	            	System.out.println("SİSTEMDEN BAŞARIYLA ÇIKIŞ YAPILDI");
	            	System.out.println("İYİ GÜNLER DİLERİZ...");
					break;

				default:
					System.out.println("lütfen belirtilen seçeneklerdeki rakamı tuşlayınız!!!!");

					break;
				}
				
				
				
				
				
				
			}
			
		}else {
			System.out.println("LÜTFEN İD NİZİ KONTROL EDİNİZ!!!");
		}
		
		break;
	case 2:
		
		
		System.out.println("lütfen çalışacağınız pozisyonu seçiniz\n"
				+ "1-İŞCİ\n"
				+ "2-MUHASEBECİ\n"
				+ "3-PATRON");
		int case2=scanner.nextInt();
		switch (case2) {
		case 1:
			System.out.println("id : 123");
			
			break;
		case 2:
			System.out.println("id : 456");
			break;
		case 3:
			System.out.println("id : 0");
			break;
		default:
			System.out.println("lütfen belirtilen seçeneklerdeki rakamı tuşlayınız!!!!");

			break;
		}
		
		break;
	default:
		System.out.println("lütfen belirtilen seçeneklerdeki rakamı tuşlayınız!!!!");
		break;
	}
}
		}
		
	}

}
