package katas.brutalRefactoring;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import katas.brutalRefactoring.Grid;
import katas.brutalRefactoring.GridPosition;
import katas.brutalRefactoring.Player;

import org.junit.Test;


public class GridTest {

	@Test
	public void shouldAddMoveToGrid(){
		Grid grid = new Grid();
		Player player = new Player();
		grid.addMove(player, GridPosition.TOP_LEFT);
		
		assertThat(grid.getPlayerAtMove(GridPosition.TOP_LEFT), is(player));
		
	}
	
	
}
