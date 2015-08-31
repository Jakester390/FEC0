package util;
//Enum of The effect representations
	enum EffectType {
		ATTACK("A"), BONDABLE("B"), CLASS("C"), ID("D"), FULL_NAME("F"), GENDER("G"),
		INSIGNIA("I"), PLAYER("L"), NAME("N"), COST("O"), PROMOTION_COST("P"), QUOTE("Q"),
		RANGE("R"), SUPPORT("S"), SKILL_TEXT("T"), UNDERNEATH("U"), WEAPON("W"), LOCATION("Z");
		
		private String image;
		
		private EffectType(String image) {
			this.setImage(image);
		}

		/**
		 * @return the image
		 */
		public String getImage() {
			return image;
		}

		/**
		 * @param image the image to set
		 */
		public void setImage(String image) {
			this.image = image;
		}
	}

public class Statics {
	//Gender
	public static final int GENDER_MALE = 1;
	public static final int GENDER_FEMALE = 2;
	//Insignias
	public static final int INSIGNIA_AWAKENING = 1;
	public static final int INSIGNIA_SHADOW = 2;
	public static final int INSIGNIA_NOHR = 4;
	public static final int INSIGNIA_HOSHIDO = 8;
	//Locations
	public static final int LOCATION_HAND = 1;
	public static final int LOCATION_BOND = 2;
	public static final int LOCATION_REAR = 4;
	public static final int LOCATION_FRONT = 8;
	public static final int LOCATION_MAIN = 16;
	public static final int LOCATION_RETREAT = 32;
	public static final int LOCATION_ORBS = 64;
	public static final int LOCATION_DECK = 128;
	public static final int LOCATION_BATTLING = 256;
	public static final int LOCATION_SUPPORT = 512;
	//Triggers and Actions
	public static final int NUM_TRIGGERS = 9;
	public static final int BATTLE_TRIGGER = 1;
	public static final int REMOVE_TRIGGER = 2;
	public static final int SUPPORTED_TRIGGER = 4;
	public static final int SUMMON_TRIGGER = 8;
	public static final int PROMOTE_TRIGGER = 16;
	public static final int BOND_TRIGGER = 32;
	public static final int ATTACK_DECLARED = 64;
	public static final int END_TURN = 128;
	public static final int END_BATTLE = 256;
	//Weapons
	public static final int WEAPON_SWORD = 1;
	public static final int WEAPON_AXE = 2;
	public static final int WEAPON_LANCE = 4;
	public static final int WEAPON_TOME = 8;
	public static final int WEAPON_STONE = 16;
	public static final int WEAPON_BOW = 32;
	//Ranges
	public static final int RANGE_ONE = 1;
	public static final int RANGE_TWO = 2;
	public static final int RANGE_THREE = 4;
	//Flags
	public static final int FLAG_ARMOR = 1;
	public static final int FLAG_MOUNT = 2;
	public static final int FLAG_FLYING = 4;
	public static final int FLAG_DRAGON = 8;
	
	
	public static String getSleeve() {
		return "/resources/pics/Sleeves/25th_Anniversary(Sleeves).jpg";
	}
	
}
