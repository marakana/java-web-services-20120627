package chirp.representations;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

import chirp.model.User;

public class UserRepresentation {

	private final String username;
	private final String realname;

	public UserRepresentation(boolean summary, User user) {
		this.username = user.getUsername();
		this.realname = summary ? null : user.getRealname();
	}

	@JsonCreator
	public UserRepresentation(
			@JsonProperty("username") String username,
			@JsonProperty("realname") String realname) {
		this.username = username;
		this.realname = realname;
	}

	public String getUsername() {
		return username;
	}

	public String getRealname() {
		return realname;
	}

}
