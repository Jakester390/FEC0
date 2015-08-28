package game;

import java.util.Queue;

import cards.Card;

public interface IGameState {
	Queue<Card> getPlayerAHand();
	Queue<Card> getPlayerBHand();
	void moveCard(int src, int dest, boolean player);
	void moveIndexedCard(int src, int index, int dest, boolean player);
	boolean meetRestriction(String restriction, int location);
	Card getTriggeringCard();
	Card getBattlingCard(boolean isAttacker);
	void ADraw();
	void BDraw();
	void ADiscard();
	void BDiscard();
	void ABond(int index);
	void BBond(int index);
	boolean reverseBonds(int num, boolean player);
	int getFaceUpBonds(boolean player);
	boolean queryPlayer(boolean player, String message);
	int getCount(int location, String restriction, Card owner);
	int getCount(int location, String restriction, boolean player);
}
