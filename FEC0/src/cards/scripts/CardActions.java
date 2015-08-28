package cards.scripts;

import cards.Card;
import game.IGameState;

public interface CardActions {
	
	public boolean hasContinuousEffect();
	public boolean hasTriggerEffect(); //Battling, Victory, Supported, etc.
	public boolean hasSummonEffect();
	public boolean hasAttackSupportEffect();
	public boolean hasDefendSupportEffect();
	public boolean hasActiveEffect();
	public boolean hasRestrictionEffect();
	public int getTriggers();
	public int getContinuousTriggers();
	public void continuousEffect(IGameState state, Card owner, int trigger);
	public boolean TriggerEffect(IGameState state, Card owner, int trigger);
	public boolean AttackSupportEffect(IGameState state, Card owner);
	public boolean DefendSupportEffect(IGameState state, Card owner);
	public boolean ActiveEffect(IGameState state, Card owner);
	public boolean SummonEffect();
	public String getRestriction(Card owner);
}
