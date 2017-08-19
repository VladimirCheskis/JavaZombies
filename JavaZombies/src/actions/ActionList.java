package actions;

import java.util.ArrayList;

public class ActionList implements IAction {

	@Override
	public void step(float dtSec) {
		actions.forEach(action->action.step(dtSec));
	}
	
	public void add(IAction action){
		actions.add(action);
	}

	ArrayList<IAction> actions = new ArrayList<>();
}
