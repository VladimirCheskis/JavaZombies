package animationTesting;

public class AnimationErorException extends Exception {
String reason;

public AnimationErorException(String reason) {
	super();
	this.reason = reason;
}

}
