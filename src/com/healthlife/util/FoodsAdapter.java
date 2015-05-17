package com.healthlife.util;

import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.healthlife.R;
import com.healthlife.entity.Food;
import com.healthlife.entity.GlobalVariables;

public class FoodsAdapter extends ArrayAdapter<Food>{
	private int resourceId;
	
	
	public FoodsAdapter(Context context, int resource,List<Food> objects) {
		super(context, resource, objects);
		resourceId=resource;
		// TODO Auto-generated constructor stub
	}
	
	@SuppressLint("ViewHolder")
	public View getView(int position,View convertView,ViewGroup parent){
		Food food = getItem(position);
		View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
		ImageView  foodImage = (ImageView)view.findViewById(R.id.image_food_type);
		TextView textName = (TextView)view.findViewById(R.id.text_food_name);
		TextView textCalorie = (TextView)view.findViewById(R.id.text_food_cal);
				
		switch(food.getType()){
		
		case GlobalVariables.MAINFOOD:
			//foodImage.setImageResource();
			textName.setText(food.getFoodName());
			textCalorie.setText(food.getCalorie() + "/100g");
			break;
		case GlobalVariables.DISHES:
			//foodImage.setImageResource();
			textName.setText(food.getFoodName());
			textCalorie.setText(food.getCalorie() + "/100g");
			break;
		case GlobalVariables.SNACKS:
			//foodImage.setImageResource();
			textName.setText(food.getFoodName());
			textCalorie.setText(food.getCalorie() + "/100g");
			break;
		case GlobalVariables.DRINKS:
			//foodImage.setImageResource();
			textName.setText(food.getFoodName());
			textCalorie.setText(food.getCalorie() + "/cc");
			break;
		case GlobalVariables.FRUITS:
			//foodImage.setImageResource();
			textName.setText(food.getFoodName());
			textCalorie.setText(food.getCalorie() + "/100g");
			break;
		default:
		}		
		return view;		
	}
}
