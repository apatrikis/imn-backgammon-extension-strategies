/*
 * www.ichmags.net - Backgammon
 */
package net.ichmags.backgammon.strategy.impl;

import net.ichmags.backgammon.setup.IBoard;
import net.ichmags.backgammon.setup.IChecker;
import net.ichmags.backgammon.setup.IPlayer;
import net.ichmags.backgammon.strategy.IStrategy;

/**
 * The {@code PositionBlockStrategy} is a implementation of the {@link IStrategy} interface.
 * It is evaluating the board for consecutive blocks of {@link IChecker}, which will make the opponents
 * moving harder, as larger blocks can not be passed easily, e.g. a block of 6 cannot be passed
 * at all.
 * 
 * @author Anastasios Patrikis
 */
public class PositionBlockStrategy implements IStrategy {
	
	/**
	 * The maximum value {@link #evaluate(IPlayer, IBoard, IBoard, net.ichmags.backgammon.setup.IPlayer.PlayStyle)}
	 * can return ({@value #LIMIT}).
	 */
	public static final int LIMIT = 300;

	@Override
	public IPlayer.Level suitableForPlayerLevel() {
		return IPlayer.Level.BEGINNER;
	}

	@Override
	public IPlayer.PlayStyle suitableForPlayStyle() {
		return IPlayer.PlayStyle.SECURE;
	}
	
	@Override
	public int getLimit() {
		return LIMIT;
	}

	@Override
	public int evaluate(IPlayer player, IBoard boardBefore, IBoard boardAfter, IPlayer.PlayStyle preferedPlayStyle) {
		return 0; // TODO: search for blocks: the bigger, the better
	}
}
