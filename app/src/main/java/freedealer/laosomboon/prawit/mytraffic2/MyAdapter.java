package freedealer.laosomboon.prawit.mytraffic2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.PrivateKey;

/**
 * Created by Prawit on 1/10/2016.
 */
public class MyAdapter extends BaseAdapter{

    // Explicit
    private Context objContext;
    private int[] iconInts;
    private String[] titleStrings, detailStrings;


    public MyAdapter(Context objContext, int[] iconInts, String[] titleStrings, String[] detailStrings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    } // Constructor

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Open Service
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.traffic_listview, parent, false);

        //Show Icon
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imvIcon);
        iconImageView.setImageResource(iconInts[position]);

        //Show Title
        TextView titleTextView = (TextView) objView1.findViewById(R.id.txtListTitle);
        titleTextView.setText(titleStrings[position]);

        //Show Detail
        TextView detTextView = (TextView) objView1.findViewById(R.id.txtListDetail);
        detTextView.setText(detailStrings[position]);

        return objView1;
    }
} // Main Class
