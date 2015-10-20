package katas.brutalRefactoring;

import java.util.HashMap;
import java.util.Map;

public class Grid {

    private Map<GridPosition, Player> GRID = new HashMap<>();

	public void addMove(Player player, GridPosition gridPosition) {
		GRID.put(gridPosition,player);
	}

	public Player getPlayerAtMove(GridPosition gridPosition) {
		return GRID.get(gridPosition);
	}

}
