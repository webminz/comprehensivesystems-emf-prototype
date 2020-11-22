package no.hvl.past.corrlang.tools;

import java.util.List;

public class Controller extends Block<List<Violation>> {

	private ModelRepair next;
	private Multimodel multimodel;
	private User user;
	private List<Violation> history;

	@Override
	public void receive(List<Violation> violations) {
		if (violations.isEmpty()) {
			this.history.clear();
			sendTo(multimodel, true);
		} else {
			for (Violation v : history) {
				if (violations.contains(v)) {
					sendTo(user, violations);
					return;
				}
			}
			history.addAll(violations);
			sendTo(next, violations);
		}
	}
}
