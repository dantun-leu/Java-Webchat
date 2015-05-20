package networking.client;

import java.util.SortedSet;

import networking.Message;
import networking.MessageInterface;

public class GetMessages implements Runnable {
	
	Message message;
	MessageInterface messageInterface;
	
	public GetMessages(MessageInterface messageInterface) {
		this.message = null;
		this.messageInterface = messageInterface;
	}
	
	@Override
	public void run() {
		while (true) {
			SortedSet<Message> messages = messageInterface.pull(message);
			message = messages.last();
			//TODO: GUI handler code here with messages
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
		}
	}
}
