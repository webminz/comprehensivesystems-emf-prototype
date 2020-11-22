package no.hvl.past.corrlang.tools;

public interface Violation {
	Binding getViolatingVariableBinding();
	Constraint getConstraint();
}
