package com.example.next.nexttool.adpter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.next.nexttool.R;
import com.example.next.nexttool.dao.Cards;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by next on 11/5/17.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
private Context mContext;
    //private  int mItemLayout;
    private List<Cards> cardses;
    DownloadImageTask downloadImageTask;

    public RecyclerAdapter(Context mContext, List<Cards> cardses) {
        this.mContext = mContext;
        this.cardses = cardses;
    }




    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.MyViewHolder holder, int position) {

        Cards card =cardses.get(position);
        holder.mTitleName.setText(card.getTitle());
       holder.mTextInfo.setImageResource(R.drawable.ic_info_outline_black_18dp);
     //  new DownloadImageTask(holder.mImageview).execute(cardses.get(position).getThumb());

        String url = "assets/images/thumb/no-image.png";

      //  Bitmap bitmap = loadBitmapFromAssets(mContext,url);
       // holder.mImageview.setImageBitmap(bitmap);

       // holder.mImageview.setImageBitmap(ImageViaAssets(card.getThumb()));




        try { // get input stream
            String[] split = card.getThumb().split("assets/");
            String imageName = split[1].replace("svg", "png");
            InputStream ims =mContext.getAssets().open(imageName);
            // load image as
            Drawable d = Drawable.createFromStream(ims, null);
            // set image to ImageView
            holder.mImageview.setImageDrawable(d);
            ims .close();
        }
        catch(IOException ex) {
            Log.i("RecyclerAdapter", "onBindViewHolder: "+ex.getMessage());
            return;
        }

    }

    @Override
    public int getItemCount() {
        return cardses.size();
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder {
         TextView mTitleName;
        ImageView mImageview, mTextInfo;;


        public MyViewHolder(View itemView) {
            super(itemView);

            mImageview= (ImageView) itemView.findViewById(R.id.cardview_imageView);
            mTitleName= (TextView) itemView.findViewById(R.id.cardview_title_name);
            mTextInfo= (ImageView) itemView.findViewById(R.id.cardview_textinfo);

        }

    }


    //imageAsyncTask

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }
        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }

    public Bitmap loadBitmapFromAssets(Context context, String path)
    {
        InputStream stream = null;
        try
        {
            stream = context.getAssets().open(path);
            return BitmapFactory.decodeStream(stream);
        }
        catch (Exception ignored) {} finally
        {

            try
            {
                if(stream != null)
                {
                    stream.close();
                }
            } catch (Exception ignored) {}
        }
        return null;
    }
//		new DownloadImageTask(holder.imageview).execute(actorList.get(position).getImage());


    public Bitmap ImageViaAssets(String fileName){

        AssetManager assetmanager = mContext.getAssets();
        InputStream is = null;
        try{

            is = assetmanager.open("/images/" + fileName);
        }catch(IOException e){
            e.printStackTrace();
        }
        Bitmap bitmap = BitmapFactory.decodeStream(is);
        return bitmap;
    }


}
