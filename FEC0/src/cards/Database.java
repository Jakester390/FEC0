package cards;

public class Database {
	public static Card createCard(String id, boolean player) {
		@SuppressWarnings("rawtypes")
		Class c;
		try {
			c = Class.forName("cards." + id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		Card k = null;
		try {
			k = (Card) c.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(k != null) {
			k.setPlayer(player);
		}
		return k;
	}
}
