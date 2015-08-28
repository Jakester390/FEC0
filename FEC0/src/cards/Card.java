package cards;

import cards.scripts.CardActions;

public abstract class Card {
	private String fullName;
	private String refName;
	private String feClass;
	private int range;
	private int insignia;
	private int gender;
	private int weapon;
	private int flags;
	private int cost;
	private int promotion;
	private boolean classChanged;
	private int attack;
	private int support;
	private Card lesser;
	private boolean player;
	
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @return the refName
	 */
	public String getRefName() {
		return refName;
	}

	/**
	 * @return the feClass
	 */
	public String getFeClass() {
		return feClass;
	}

	/**
	 * @return the range
	 */
	public int getRange() {
		return range;
	}

	/**
	 * @return the insignia
	 */
	public int getInsignia() {
		return insignia;
	}

	/**
	 * @return the gender
	 */
	public int getGender() {
		return gender;
	}

	/**
	 * @return the weapon
	 */
	public int getWeapon() {
		return weapon;
	}

	/**
	 * @return the flags
	 */
	public int getFlags() {
		return flags;
	}

	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @return the promotion
	 */
	public int getPromotion() {
		return promotion;
	}

	/**
	 * @return the classChanged
	 */
	public boolean isClassChanged() {
		return classChanged;
	}
	protected void setClassChange(Card root) {
		this.lesser = root;
		classChanged = true;
	}

	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * @return the support
	 */
	public int getSupport() {
		return support;
	}

	/**
	 * @param fullName
	 * @param refName
	 * @param feClass
	 * @param range
	 * @param insignia
	 * @param gender
	 * @param weapon
	 * @param flags
	 * @param cost
	 * @param promotion
	 * @param classChanged
	 * @param attack
	 * @param support
	 */
	public Card(String fullName, String refName, String feClass, int range,
			int insignia, int gender, int weapon, int flags, int cost,
			int promotion, boolean classChanged, int attack, int support, boolean player) {
		this.fullName = fullName;
		this.refName = refName;
		this.feClass = feClass;
		this.range = range;
		this.insignia = insignia;
		this.gender = gender;
		this.weapon = weapon;
		this.flags = flags;
		this.cost = cost;
		this.promotion = promotion;
		this.classChanged = classChanged;
		this.attack = attack;
		this.support = support;
		this.player = player;
	}

	/**
	 * @param player the player to set
	 */
	protected void setPlayer(boolean player) {
		this.player = player;
	}

	/**
	 * @return the player
	 */
	public boolean isPlayer() {
		return player;
	}

	public abstract CardActions getScript();
	public abstract void addEffect(String effect, int trigger);
	/**
	 * @param fullName the fullName to set
	 */
	protected void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @param refName the refName to set
	 */
	protected void setRefName(String refName) {
		this.refName = refName;
	}

	/**
	 * @param feClass the feClass to set
	 */
	protected void setFeClass(String feClass) {
		this.feClass = feClass;
	}

	/**
	 * @param range the range to set
	 */
	protected void setRange(int range) {
		this.range = range;
	}

	/**
	 * @param insignia the insignia to set
	 */
	protected void setInsignia(int insignia) {
		this.insignia = insignia;
	}

	/**
	 * @param gender the gender to set
	 */
	protected void setGender(int gender) {
		this.gender = gender;
	}

	/**
	 * @param weapon the weapon to set
	 */
	protected void setWeapon(int weapon) {
		this.weapon = weapon;
	}

	/**
	 * @param flags the flags to set
	 */
	protected void setFlags(int flags) {
		this.flags = flags;
	}

	/**
	 * @param cost the cost to set
	 */
	protected void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * @param promotion the promotion to set
	 */
	protected void setPromotion(int promotion) {
		this.promotion = promotion;
	}

	/**
	 * @param classChanged the classChanged to set
	 */
	protected void setClassChanged(boolean classChanged) {
		this.classChanged = classChanged;
	}

	/**
	 * @param attack the attack to set
	 */
	protected void setAttack(int attack) {
		this.attack = attack;
	}

	/**
	 * @param support the support to set
	 */
	protected void setSupport(int support) {
		this.support = support;
	}
	public Card getLesser() {
		return lesser;
	}

	/**
	 * @param lesser the lesser to set
	 */
	protected void setLesser(Card lesser) {
		this.lesser = lesser;
	}

	public abstract void endEffects(int trigger);
}
