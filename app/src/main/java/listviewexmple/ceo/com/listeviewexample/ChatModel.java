package listviewexmple.ceo.com.listeviewexample;

public class ChatModel {
    private String text;
    private boolean sender;

    public ChatModel(String text, boolean sender) {
        this.text = text;
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isSender() {
        return sender;
    }

    public void setSender(boolean sender) {
        this.sender = sender;
    }
}
