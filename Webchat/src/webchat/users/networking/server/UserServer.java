package webchat.users.networking.server;

import webchat.networking.GenericServer;

public class UserServer extends GenericServer {
	
	public static final String URL_LOCATION = "users";
	
	public UserServer() {
		super(URL_LOCATION, new UserService());
	}
}