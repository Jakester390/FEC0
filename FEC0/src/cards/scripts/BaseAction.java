package cards.scripts;

import cards.Card;
import game.IGameState;

public abstract class BaseAction implements CardActions {
	public boolean hasSummonEffect() {
		return false;
	}
	public boolean SummonEffect() {
		return false;
	}
	@Override
	public boolean hasContinuousEffect() {
		return false;
	}

	@Override
	public boolean hasTriggerEffect() {
		return false;
	}

	@Override
	public boolean hasAttackSupportEffect() {
		return false;
	}

	@Override
	public boolean hasDefendSupportEffect() {
		return false;
	}

	@Override
	public boolean hasActiveEffect() {
		return false;
	}

	@Override
	public boolean hasRestrictionEffect() {
		return false;
	}

	@Override
	public int getTriggers() {
		return 0;
	}

	@Override
	public int getContinuousTriggers() {
		return 0;
	}

	@Override
	public void continuousEffect(IGameState state, Card owner, int trigger) {
	}

	@Override
	public boolean TriggerEffect(IGameState state, Card owner, int trigger) {
		return false;
	}

	@Override
	public boolean AttackSupportEffect(IGameState state, Card owner) {
		return false;
	}

	@Override
	public boolean DefendSupportEffect(IGameState state, Card owner) {
		return false;
	}

	@Override
	public boolean ActiveEffect(IGameState state, Card owner) {
		return false;
	}


	@Override
	public String getRestriction(Card Owner) {
		return null;
	}
}
