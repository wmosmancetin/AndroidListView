package listviewexmple.ceo.com.listeviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ChatAdapter extends ArrayAdapter<ChatModel> {

    public ChatAdapter(@NonNull Context context, List<ChatModel> dataSet) {
        super(context, -1, dataSet);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ChatModel chatModel = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        if(chatModel.isSender()){
            view = inflater.inflate(R.layout.list_view_item_sender, parent, false);
            ImageView ivAvatar = view.findViewById(R.id.ivAvatar);
            TextView tvText = view.findViewById(R.id.tvText);
            ivAvatar.setImageResource(R.drawable.avatar);
            tvText.setText(chatModel.getText());
        } else {
            view = inflater.inflate(R.layout.list_view_item_receiver, parent, false);
            ImageView ivAvatar = view.findViewById(R.id.ivAvatar);
            TextView tvText = view.findViewById(R.id.tvText);
            tvText.setText(chatModel.getText());
            ivAvatar.setImageResource(R.drawable.receiver);
        }
        return view;
    }
}
