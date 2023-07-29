package dB;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import codes.Furneture;


public class FurnetureInfo {
	private static final Logger LOGGER = Logger.getLogger(FurnetureInfo.class.getName());
	public static List<Furneture> furnetures = new ArrayList<>();
	
	
	static {
		
		Furneture u=new Furneture(100,"1","photo",100,true);
		Furneture n=new Furneture(200,"2","photo2",150,false);
		
		furnetures.add(u);
		furnetures.add(n);
		
		
		
	}
	
	
	public static int addItem(String id,String photo,int price) {
		int x= furnetures.size();
		Furneture f=new Furneture();
		f.setId((furnetures.get(x-1).getId())+1);
		f.setPersonId(id);
		f.setPic(photo);
		f.setPrice(price);
		f.setTaken(false);
		
		furnetures.add(f);
		
		for(Furneture k:furnetures) {
		
				LOGGER.info(k.toString());
			}
			
		
        
		return 1;
	}


	public static  int show() {
		for(Furneture k:furnetures) {
			if(!k.isTaken()) {
				LOGGER.info(k.toString());
			}
			
			
		}
		return 1;
	}
	
	
	
	
}
