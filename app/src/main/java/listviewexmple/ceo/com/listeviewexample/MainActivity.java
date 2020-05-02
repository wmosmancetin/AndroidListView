package listviewexmple.ceo.com.listeviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ChatModel> list = new ArrayList<>();
        list.add(new ChatModel("Selam", true));
        list.add(new ChatModel("Selam", false));
        list.add(new ChatModel("nasılsın?", true));
        list.add(new ChatModel("iyim sen nasılsın?", false));
        list.add(new ChatModel("iyi bende işler nasıl?", true));
        list.add(new ChatModel("işlerde iyi", false));

        ListView lvChat = findViewById(R.id.lvChat);
        ChatAdapter adapter = new ChatAdapter(getApplicationContext(), list);

        lvChat.setAdapter(adapter);

    }
}
