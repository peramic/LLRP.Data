package havis.llrpservice.data.message;

import havis.llrpservice.data.message.MessageTypes.MessageType;
import havis.llrpservice.data.message.parameter.LLRPStatus;

public class AddAccessSpecResponse implements Message {

	private static final long serialVersionUID = 1196515796882721530L;

	private MessageHeader messageHeader;
	private LLRPStatus status;

	public AddAccessSpecResponse() {
	}

	public AddAccessSpecResponse(MessageHeader messageHeader, LLRPStatus status) {
		this.messageHeader = messageHeader;
		this.messageHeader.setMessageType(MessageType.ADD_ACCESSSPEC_RESPONSE);
		this.status = status;
	}

	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	public void setMessageHeader(MessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}

	public LLRPStatus getStatus() {
		return status;
	}

	public void setStatus(LLRPStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AddAccessSpecResponse [messageHeader=" + messageHeader + ", status=" + status + "]";
	}
}